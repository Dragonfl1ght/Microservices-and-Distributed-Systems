package com.amigoscode.notifications;

import com.amigoscode.amqp.RabbitMQMessageProducer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(
        scanBasePackages = {
                "com.amigoscode.notifications",
                "com.amigoscode.amqp"
        }
)
public class NotificationsApplication {
    public static void main(String[] args) {
        SpringApplication.run(NotificationsApplication.class, args);
    }
//    @Bean
//    CommandLineRunner commandLineRunner(
//            RabbitMQMessageProducer producer,
//            NotificationsConfig notificationsConfig
//            ){
//        return args -> {
//            producer.publish("foo",
//                    notificationsConfig.getInternalExchange(),
//                    notificationsConfig.getInternalNotificationsRoutingKey()
//                    );
//        };
//    }
}
