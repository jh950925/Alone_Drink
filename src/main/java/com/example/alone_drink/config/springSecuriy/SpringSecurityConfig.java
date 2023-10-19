package com.example.alone_drink.config.springSecuriy;

import jakarta.servlet.DispatcherType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SpringSecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf().disable().cors().disable()
                .authorizeHttpRequests(request -> request
                        .dispatcherTypeMatchers(DispatcherType.FORWARD).permitAll()
                        // 예외 파일 처리
                        .requestMatchers("/status", "/images/**", "/api/auth/joinPage","api/auth/loginPage").permitAll()
                        .anyRequest().authenticated()	// 어떠한 요청이라도 인증필요
                )
                .formLogin(login -> login	// form 방식 로그인 사용
                        .loginPage("/loginPage") // 만들어둔 로그인 화면으로 이동
                        .loginProcessingUrl("/api/auth/login") // 로그인 submit 받을 url
                        .usernameParameter("userId") // submit할 ID   -> 화면에서 id 파라미터로 보내야함
                        .passwordParameter("password") // submit할 PW -> 화면에서 password 파라미터로 보내야함 
                        .defaultSuccessUrl("/view/dashboard", true) // 성공시 화면 이동
                        .permitAll()
                )
                .logout(withDefaults());	// 로그아웃은 기본설정으로 (/logout으로 인증해제)

        return http.build();
    }

}
