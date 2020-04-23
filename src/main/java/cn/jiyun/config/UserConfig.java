package cn.jiyun.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@EnableConfigurationProperties(User.class)
public class UserConfig {

    @Bean
    public User getUser(User user){
        return user;
    }
}
