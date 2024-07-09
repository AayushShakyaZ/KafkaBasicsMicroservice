package com.MicroServiceEndUser.Enduser.config;


import com.MicroServiceEndUser.Enduser.constants.AppConstants;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

    @KafkaListener(topics = AppConstants.LOCATION_UPDATE_TOPICS, groupId = "")
    public void updatedLocation(String value){


        System.out.println(value);
    }
}
