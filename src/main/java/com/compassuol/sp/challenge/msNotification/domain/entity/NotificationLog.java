package com.compassuol.sp.challenge.msNotification.domain.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

import java.time.LocalDate;
@Document( "notifications")
@Data @AllArgsConstructor
@NoArgsConstructor
public class NotificationLog implements Serializable{
    @Id
    private String id;
    private String email;
    private String event;
    private LocalDate date;
}
