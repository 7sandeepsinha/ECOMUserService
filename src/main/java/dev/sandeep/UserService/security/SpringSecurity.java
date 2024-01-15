package dev.sandeep.UserService.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurity {

//    @Order(1)
//    @Bean
//    public SecurityFilterChain filteringCriteria(HttpSecurity http) throws Exception {
//        http.cors().disable();
//        http.csrf().disable();
////        http.authorizeHttpRequests(authorize -> authorize.requestMatchers("/auth/*").permitAll());
////        http.authorizeHttpRequests(authorize -> authorize.requestMatchers("/order/*").authenticated());
//        http.authorizeHttpRequests(authorize -> authorize.anyRequest().permitAll());
//        return http.build();
//    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
