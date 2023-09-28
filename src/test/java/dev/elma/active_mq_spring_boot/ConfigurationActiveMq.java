package dev.elma.active_mq_spring_boot;

import jakarta.jms.Topic;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationActiveMq {
    @Bean
    public ActiveMQQueue queue(){
        return new ActiveMQQueue("mine.queue");
    }

    @Bean
    public ActiveMQTopic topic(){
        return new ActiveMQTopic("messages.topic");
    }
}
