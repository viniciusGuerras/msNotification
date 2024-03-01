package com.compassuol.sp.challenge.msNotification.domain.service;

import com.compassuol.sp.challenge.msNotification.domain.exceptions.MessageConversionException;
import com.compassuol.sp.challenge.msNotification.domain.model.NotificationLog;
import com.compassuol.sp.challenge.msNotification.domain.repository.NotificationRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class NotificationService {

    private final NotificationRepository repository;

    @Transactional
    public void save(String log){
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            NotificationLog notification = objectMapper.readValue(log, NotificationLog.class);
            repository.insert(notification);
        }
        catch (JsonProcessingException ex){
            throw new MessageConversionException("parsing error");
        }
    }

}
