package stmallphb.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import stmallphb.OrderApplication;
import stmallphb.domain.OrderCanceled;
import stmallphb.domain.Ordered;

@Entity
@Table(name = "Order_table")
@Data
//<<< DDD / Aggregate Root
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userId;

    private String productName;

    private Long productId;

    private Integer qty;

    private String status;

    private Date orderDate;

    private String address;

    @PostPersist
    public void onPostPersist() {
        Ordered ordered = new Ordered(this);
        ordered.publishAfterCommit();
    }

    @PostUpdate
    public void onPostUpdate() {
        OrderCanceled orderCanceled = new OrderCanceled(this);
        orderCanceled.publishAfterCommit();
    }

    public static OrderRepository repository() {
        OrderRepository orderRepository = OrderApplication.applicationContext.getBean(
            OrderRepository.class
        );
        return orderRepository;
    }

    //<<< Clean Arch / Port Method
    public static void notifyToWaitingUsers(
        InventoryIncreases inventoryIncreases
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        
        repository().findById(inventoryIncreases.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void updateStatus(DeliveryStarted deliveryStarted) {
        //implement business logic here:

        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryStarted.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void updateStatus(DeliveryCompleted deliveryCompleted) {
        //implement business logic here:

        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryCompleted.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void updateStatus(DeliveryCanceled deliveryCanceled) {
        //implement business logic here:

        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryCanceled.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void updateStatus(DeliveryCollected deliveryCollected) {
        //implement business logic here:

        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryCollected.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
