package stmallphb.domain;

import java.util.*;
import lombok.*;
import stmallphb.domain.*;
import stmallphb.infra.AbstractEvent;

@Data
@ToString
public class DeliveryCompleted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String userId;
    private String productName;
    private String productId;
    private String qty;
    private String status;
    private String deliveryDate;
}
