package com.hemanth.AllinOneProgram.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class SecurityConfig
{
    @Bean
    public UserDetailsService userDetailsService() {

        List<UserDetails> users = new ArrayList<>();
        users.add(User.withUsername("Hemanth").password("{noop}root").roles("ADMIN").build());
        users.add(User.withUsername("ram").password("{noop}pass").roles("USER").build());
        users.add(User.withUsername("sam").password("{noop}pass").roles("USER").build());

        return new InMemoryUserDetailsManager(users);

    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(configurer->
                configurer.requestMatchers(HttpMethod.GET,"/details")
                        .hasRole("ADMIN")
                        .requestMatchers(HttpMethod.POST,"/users")
                        .hasRole("ADMIN")
                        .requestMatchers(HttpMethod.POST,"/add/mail")
                        .hasRole("ADMIN"));
        http.httpBasic();
        http.csrf().disable();
        return http.build();
    }

}
