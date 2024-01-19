<template>

    <v-data-table
        :headers="headers"
        :items="searchProduction"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'SearchProductionView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            searchProduction : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/searchProductions'))

            temp.data._embedded.searchProductions.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.searchProduction = temp.data._embedded.searchProductions;
        },
        methods: {
        }
    }
</script>

