package com.delivery_kafka.DeliverMiicroService.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

public class KafkaConfig {

    @Bean
    public NewTopic topic(){


        return TopicBuilder
                .name(AppConstants.LOCATION_TOPIC_NAME)
//                .partitions()
//                .replicas()
                .build();
    }
}
