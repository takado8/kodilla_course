package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {
    @Bean
    public Board createBoard(){
        return new Board(new TaskList(), new TaskList(), new TaskList());
    }
}
