package com.compassuol.sp.challenge.msNotificiation.domain.repository;

import com.compassuol.sp.challenge.msNotificiation.domain.entity.NotificationLog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends MongoRepository<NotificationLog, Long> {
}
