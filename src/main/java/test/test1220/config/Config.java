package test.test1220.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.Date;

@Configuration
public class Config {
    @Bean
    public Date get(){
        return new Date();
    }
}
