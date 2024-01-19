package stmallphb.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import stmallphb.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "searchProductions",
    path = "searchProductions"
)
public interface SearchProductionRepository
    extends PagingAndSortingRepository<SearchProduction, Long> {}
