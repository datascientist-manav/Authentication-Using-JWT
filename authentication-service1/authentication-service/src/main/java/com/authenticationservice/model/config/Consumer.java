package com.authenticationservice.model.config;

import com.authenticationservice.controller.UserAlreadyExistException;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.authenticationservice.model.UserDao;
import com.authenticationservice.model.CustomMessage;
import com.authenticationservice.service.JwtUserDetailsService;





@Component

public class Consumer {
	@Autowired
	JwtUserDetailsService jwtservice;


    @RabbitListener(queues = MQConfig.QUEUE)
    public void consumeMessageFromQueue(CustomMessage custommessage ) throws UserAlreadyExistException {
        System.out.println("Message recieved from queue : " +custommessage );
        UserDao login=new UserDao();
        login.setUsername(custommessage.getEmail());
        login.setPassword(custommessage.getPassword());
        jwtservice.save(login);
    }
}


