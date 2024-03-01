package com.compassuol.sp.challenge.msNotification.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.io.Serializable;
import java.util.Date;

@Document( "notifications")
@Data @AllArgsConstructor
@NoArgsConstructor
public class NotificationLog implements Serializable{
    @Id
    private String id;
    private String email;
    private String event;
    private Date date;
}
