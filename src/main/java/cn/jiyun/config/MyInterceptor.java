package cn.jiyun.config;

import cn.jiyun.Interceptor.LoginInteceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyInterceptor implements WebMvcConfigurer {

    @Bean
    public LoginInteceptor loginIntecptor(){
        return  new LoginInteceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(this.loginIntecptor()).addPathPatterns("/**");
    }
}
