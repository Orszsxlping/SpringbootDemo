package cn.jiyun.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class User1Config {

    @Bean
    @ConfigurationProperties(prefix = "user1")
    public User1 getUser1(User1 user1){
        return user1;
    }
}
