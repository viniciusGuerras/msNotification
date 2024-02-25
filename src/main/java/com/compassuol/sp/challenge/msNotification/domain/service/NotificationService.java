package com.compassuol.sp.challenge.msNotification.domain.service;

import com.compassuol.sp.challenge.msNotification.domain.entity.NotificationLog;
import com.compassuol.sp.challenge.msNotification.domain.repository.NotificationRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class NotificationService {

    private final NotificationRepository repository;

    @Transactional
    public void save(String log){
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            NotificationLog notification = objectMapper.readValue(log, NotificationLog.class);
            notification.setDate(LocalDate.now());
            repository.insert(notification);
        }
        catch (JsonProcessingException ex){
            throw new RuntimeException("erro");
        }
    }

}
