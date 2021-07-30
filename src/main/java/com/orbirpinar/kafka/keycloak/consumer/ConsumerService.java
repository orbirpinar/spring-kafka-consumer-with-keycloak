package com.orbirpinar.kafka.keycloak.consumer;


import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ConsumerService {


    @KafkaListener(topics = "${kafka.topic}",groupId = "${kafka.group-id}")
    public void listen(ConsumerRecord<?, ?> data) {
      log.info("USER ID --> {}",data.value().toString());
    }
}
