package com.compassuol.sp.challenge.msNotification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
@EnableMongoRepositories()
public class  MsNotificationApplication {


	public static void main(String[] args) {
		SpringApplication.run(MsNotificationApplication.class, args);
	}

}
