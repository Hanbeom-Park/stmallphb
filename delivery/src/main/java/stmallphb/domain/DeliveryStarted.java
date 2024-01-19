package stmallphb.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmallphb.domain.*;
import stmallphb.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String userId;
    private String productName;
    private String productId;
    private String qty;
    private String status;
    private String deliveryDate;

    public DeliveryStarted(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryStarted() {
        super();
    }
}
//>>> DDD / Domain Event
