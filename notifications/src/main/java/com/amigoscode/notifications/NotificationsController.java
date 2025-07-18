package com.amigoscode.notifications;

import com.amigoscode.clients.notifications.NotificationsRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/notifications")
@AllArgsConstructor
@Slf4j
public class NotificationsController {
    private NotificationsService notificationsService;
    @PostMapping
    public void sendNotification(@RequestBody NotificationsRequest notificationsRequest){
        log.info("New notification... {}", notificationsRequest);
        notificationsService.send(notificationsRequest);

    }
}
