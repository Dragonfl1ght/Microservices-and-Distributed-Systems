package com.amigoscode.notifications;

import com.amigoscode.clients.notifications.NotificationsRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class NotificationsService {
    private final NotificationsRepository notificationsRepository;
    public void send(NotificationsRequest notificationsRequest){
        notificationsRepository.save(
                Notification.builder()
                        .toCustomerEmail(notificationsRequest.getToCustomerEmail())
                        .toCustomerId(notificationsRequest.getToCustomerId())
                        .sender("Amigoscode")
                        .message(notificationsRequest.getMessage())
                        .sentAt(LocalDateTime.now())
                        .build()
        );
    }
}
