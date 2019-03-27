package com.example.java_framework.hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void count_user_2() {
        // Prepare data
        userRepository.save(new User("N1", 10));
        userRepository.save(new User("N2", 20));

        // Act
        int actual = (int) userRepository.count();
        assertEquals(2, actual);
    }

    @Test
    public void default_value_0() {
        // Act
        int actual = (int) userRepository.count();
        assertEquals(0, actual);
    }

}