package stmallphb.infra;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import stmallphb.config.kafka.KafkaProcessor;
import stmallphb.domain.*;

@Service
public class SearchOrderHistoryViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private SearchOrderHistoryRepository searchOrderHistoryRepository;
    //>>> DDD / CQRS
}