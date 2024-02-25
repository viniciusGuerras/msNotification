package com.compassuol.sp.challenge.msNotification.rabbitMq;


import com.compassuol.sp.challenge.msNotification.domain.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class RabbitConsumer {

        private static final Logger LOGGER = LoggerFactory.getLogger(RabbitConsumer.class);

        private final NotificationService service;

        @RabbitListener(queues = {"${rabbitmq.queue.name}"})
        public void consume(String message){
            LOGGER.info(String.format("Received message -> %s", message));
            service.save(message);
    }
}
