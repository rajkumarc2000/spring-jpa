package com.example.springjpa;

import java.util.List;
import java.util.Optional;

import com.example.springjpa.entity.User;
import com.example.springjpa.service.UserRepoInterface;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserRepoCommandLineRunner implements CommandLineRunner{

@Autowired
private UserRepoInterface userDao;

private static final org.slf4j.Logger logger = LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);

    @Override
    public void run(String... args) throws Exception {
       User user = new User("Satish", "Principal Architect");
        userDao.save(user);
        logger.info("user created with ID" + user.getId());

        Optional<User> foundUser = userDao.findById(1L);
        logger.info("user found " + foundUser);

        List<User> users = userDao.findAll();
        logger.info("users found" + users);



    }
    
}