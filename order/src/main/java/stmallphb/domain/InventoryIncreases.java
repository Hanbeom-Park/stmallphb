package stmallphb.domain;

import java.util.*;
import lombok.*;
import stmallphb.domain.*;
import stmallphb.infra.AbstractEvent;

@Data
@ToString
public class InventoryIncreases extends AbstractEvent {

    private Long id;
    private String productName;
    private String productImage;
    private Integer stock;
}
