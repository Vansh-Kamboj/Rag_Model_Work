package com.Ncert_project_backend.controller;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringConfiguration {


     @Bean
     public PasswordEncoder passwordEncoder(){
         return  new BCryptPasswordEncoder();
     }
     @Bean
     public UserDetailsService userDetailsService() {
    UserDetails userDetails  = User
            .withUsername("ravi")
            .password(passwordEncoder().encode("password"))
            .roles("user")
            .build();
    UserDetails tryDetails  = User
            .withUsername("tryit")
            .password(passwordEncoder().encode("password"))
            .roles("tryit")
            .build();
    UserDetails adminDetails  = User
                 .withUsername("admin")
                 .password(passwordEncoder().encode("password"))
                 .roles("admin")
                 .build();

       return  new InMemoryUserDetailsManager(userDetails, adminDetails,tryDetails );

      }
     
//   Code for Implementing the Spring Security 
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws  Exception{

         httpSecurity.csrf().disable()
                 .authorizeHttpRequests()
                 .requestMatchers("/Chats/findall")
                 .permitAll()
                 .requestMatchers("/Chats/save")
                 .permitAll()
                 .requestMatchers("Chats/findans")
                 .permitAll()
                 .requestMatchers("like/upans")
                 .permitAll()
                 
//                 .requestMatchers("/Chats/public")
//                 .permitAll()
//                
                 .anyRequest()
                 .authenticated()
                 .and()
                 .formLogin();
           return  httpSecurity.build();
    }
     
}
