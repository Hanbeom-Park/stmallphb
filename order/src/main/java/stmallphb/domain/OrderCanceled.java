package stmallphb.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmallphb.domain.*;
import stmallphb.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private String userId;
    private String productName;
    private Long productId;
    private Integer qty;
    private String status;
    private Date orderDate;
    private String address;

    public OrderCanceled(Order aggregate) {
        super(aggregate);
    }

    public OrderCanceled() {
        super();
    }
}
//>>> DDD / Domain Event
