package com.amigoscode.clients.notifications;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NotificationsRequest {
    private Integer toCustomerId;
    private String toCustomerEmail;
    private String message;
}
