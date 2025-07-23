package com.amigoscode.notifications;

import lombok.Getter;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.management.Query;

@Getter
@Configuration
public class NotificationsConfig {
    @Value("${rabbitmq.exchanges.internal}")
    private String internalExchange;
    @Value("${rabbitmq.queue.notification}")
    private String notificationsQueue;
    @Value("${rabbitmq.routing-keys.internal-notification}")
    private String internalNotificationsRoutingKey;

    @Bean
    public TopicExchange internalTopicExchange(){
        return new TopicExchange(this.internalExchange);
    }
    @Bean
    public Queue notificationsQueue(){
        return new Queue(this.notificationsQueue);
    }
    @Bean
    public Binding internalToNotififcationsBinding(){
        return BindingBuilder
                .bind(notificationsQueue())
                .to(internalTopicExchange())
                .with(this.internalNotificationsRoutingKey);
    }
}
