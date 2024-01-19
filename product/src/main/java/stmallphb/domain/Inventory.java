package stmallphb.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import stmallphb.ProductApplication;
import stmallphb.domain.InventoryDecreased;
import stmallphb.domain.InventoryIncreases;

@Entity
@Table(name = "Inventory_table")
@Data
//<<< DDD / Aggregate Root
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String productName;

    private String productImage;

    private Integer stock;

    @PostUpdate
    public void onPostUpdate() {
        InventoryDecreased inventoryDecreased = new InventoryDecreased(this);
        inventoryDecreased.publishAfterCommit();

        InventoryIncreases inventoryIncreases = new InventoryIncreases(this);
        inventoryIncreases.publishAfterCommit();
    }

    public static InventoryRepository repository() {
        InventoryRepository inventoryRepository = ProductApplication.applicationContext.getBean(
            InventoryRepository.class
        );
        return inventoryRepository;
    }

    //<<< Clean Arch / Port Method
    public static void inventoryReduction(DeliveryCompleted deliveryCompleted) {
        //implement business logic here:

        /** Example 1:  new item 
        Inventory inventory = new Inventory();
        repository().save(inventory);

        InventoryDecreased inventoryDecreased = new InventoryDecreased(inventory);
        inventoryDecreased.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryCompleted.get???()).ifPresent(inventory->{
            
            inventory // do something
            repository().save(inventory);

            InventoryDecreased inventoryDecreased = new InventoryDecreased(inventory);
            inventoryDecreased.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void inventoryIncrease(DeliveryCollected deliveryCollected) {
        //implement business logic here:

        /** Example 1:  new item 
        Inventory inventory = new Inventory();
        repository().save(inventory);

        InventoryIncreases inventoryIncreases = new InventoryIncreases(inventory);
        inventoryIncreases.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryCollected.get???()).ifPresent(inventory->{
            
            inventory // do something
            repository().save(inventory);

            InventoryIncreases inventoryIncreases = new InventoryIncreases(inventory);
            inventoryIncreases.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root