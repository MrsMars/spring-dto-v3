package com.aoher;

import com.aoher.runner.InsertNewTeam;
import com.aoher.runner.UpdateNewTeam;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        final Class<?>[] runner = new Class<?>[] {
                App.class,
                InsertNewTeam.class,
                UpdateNewTeam.class
        };
        SpringApplication.run(runner, args);
    }
}
