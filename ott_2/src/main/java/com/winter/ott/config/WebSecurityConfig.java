package com.winter.ott.config;

import com.winter.ott.service.SecurityMemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.annotation.Resource;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Resource(name="securityMemberService")
    private SecurityMemberService securityMemberService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.headers().frameOptions().disable();
        http.httpBasic();

        http
                .authorizeRequests()
                .antMatchers("/", "/create", "/login**", "/logout**")
                .permitAll()
                .antMatchers("/boards/**", "/myboards", "/api/boards**", "api/login**", "/api/decks/**", "api/boards/**", "/api/boards/**", "/api/users**")
                .hasRole("USER");

        http
                .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/")
                .failureUrl("/login");

        http
                .logout()
                .logoutUrl("/logout")
                .invalidateHttpSession(true);

    }

    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
        auth.userDetailsService(securityMemberService).passwordEncoder(passwordEncoder());
    }
}