package com.felipeserejo.course.config;

import com.felipeserejo.course.domain.User;
import com.felipeserejo.course.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.lang.reflect.Array;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null, "Felipe", "emailFelipe@gmail.com", "senha1", "21998887766");
        User user2 = new User(null, "João", "emailJoão@gmail.com", "123213", "21932347837");
        User user3 = new User(null, "Maria", "emailMaria@gmail.com", "SOUuma.Senha", "21991112233");
        User user4 = new User(null, "Alex Green", "alex@gmail.com", "123456", "977777777");
        User user5 = new User(null, "Maria Brown", "maria@gmail.com", "654321", "988888888");

        userRepository.saveAll(Arrays.asList(user1, user2, user3, user4, user5));
    }
}
