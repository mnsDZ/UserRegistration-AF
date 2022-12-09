package com.example.demo.afUser;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;


@Configuration

public class AfUserConfig {

    @Bean
    CommandLineRunner commandLineRunner (AfUserRepository repository){
        return args -> {
            AfUser User1 = new AfUser(
                    1L,
                    "User1",
                    new SimpleDateFormat("yyyy-MM-dd").parse("1997-10-10"),
                    "France",
                    "0101010101",
                    "Male"
            );

            AfUser User2 = new AfUser(
                    "User2",
                    new SimpleDateFormat("yyyy-MM-dd").parse("2000-10-10"),
                    "France",
                    "0101222101",
                    "Female"
            );

            repository.saveAll(
                    List.of( User1, User2)
            );
        };
    }
}
