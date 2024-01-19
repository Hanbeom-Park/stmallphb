package stmallphb.domain;

import java.util.*;
import lombok.*;
import stmallphb.domain.*;
import stmallphb.infra.AbstractEvent;

@Data
@ToString
public class Ordered extends AbstractEvent {

    private Long id;
    private String userId;
    private String productName;
    private Long productId;
    private Integer qty;
    private String status;
    private Date orderDate;
    private String address;
}
