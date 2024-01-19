package stmallphb.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmallphb.domain.*;
import stmallphb.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class InventoryIncreases extends AbstractEvent {

    private Long id;
    private String productName;
    private String productImage;
    private Integer stock;

    public InventoryIncreases(Inventory aggregate) {
        super(aggregate);
    }

    public InventoryIncreases() {
        super();
    }
}
//>>> DDD / Domain Event
