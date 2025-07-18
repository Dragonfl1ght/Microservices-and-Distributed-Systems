package com.amigoscode.clients.notifications;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(
        value = "notifications"
)
public interface NotificationsClient {
    @PostMapping("api/v1/notifications")
    void sendNotification(NotificationsRequest notificationsRequest);

}
