package com.example.springjpa;

import com.example.springjpa.entity.User;
import com.example.springjpa.service.UserDAOService;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner{

@Autowired
private UserDAOService userDao;

private static final org.slf4j.Logger logger = LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);

    @Override
    public void run(String... args) throws Exception {
       User user = new User("Rajkumar", "Director");
        userDao.insert(user);
        logger.info("user created with ID" + user.getId());

    }
    
}