package com.amigoscode.notifications;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationsRepository extends JpaRepository<Notification,Integer> {
}
