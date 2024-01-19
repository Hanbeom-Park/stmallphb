package stmallphb.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import stmallphb.infra.AbstractEvent;

@Data
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String userId;
    private String productName;
    private String productId;
    private String qty;
    private String status;
    private String deliveryDate;
}
