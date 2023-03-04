package com.emlakburada.emlakburadaemail.service;

import com.emlakburada.emlakburadaemail.model.EmailDto;
import com.emlakburada.emlakburadaemail.domain.Email;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;

@Service
@Slf4j
public class EmailListener {
    private final EmailService emailService;

    @Autowired
    public EmailListener(EmailService emailService) {
        this.emailService = emailService;
    }

    @RabbitListener(queues = "${emlakburada.rabbitmq.queue}")
    public void receiveMessage(String message) throws MessagingException {
        EmailDto emailDto = new EmailDto(message);
        Email email = new Email();
        email.setEmailMessage(message.split(",")[0]);
        email.setId(Integer.parseInt(message.split(",")[1]));
        log.info(message);
        emailService.sendEmail(emailDto.getEmailMessage().split(",")[0]);
    }
}