package com.compassuol.sp.challenge.msNotificiation.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class NotificationLog implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "event")
    private String event;

    @Column(name = "date")
    private Date date;
}
