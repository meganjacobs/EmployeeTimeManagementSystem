package com.adp3.security;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configurable
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private String USER_ROLE = "user";
    private String ADMIN_ROLE = "admin";

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("Super")
                .password(encoder().encode("Password.ADP3"))
                .roles("ADMIN","USER")
                .and()
                .withUser("User")
                .password(encoder().encode("Password"))
                .roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.POST,"/employee_time_management/leaveReport/create").hasRole(ADMIN_ROLE)
                .antMatchers(HttpMethod.GET,"/employee_time_management/leaveReport/read", "/employee_time_management/leaveReport/getAll").hasRole(USER_ROLE)
                .antMatchers(HttpMethod.PUT,"/employee_time_management/leaveReport/update").hasRole(ADMIN_ROLE)
                .antMatchers(HttpMethod.DELETE,"/employee_time_management/leaveReport/delete").hasRole(ADMIN_ROLE)
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.GET,"/employee_time_management/employeeRole/read", "/employee_time_management/leaveReport/getAll").hasRole(USER_ROLE)
                .antMatchers(HttpMethod.DELETE,"/employee_time_management/employeeRole/delete").hasRole(ADMIN_ROLE)
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.POST,"/employee_time_management/employeeSalary/create").hasRole(ADMIN_ROLE)
                .antMatchers(HttpMethod.GET,"/employee_time_management/employeeSalary/read", "/employee_time_management/employeeSalary/getAll").hasRole(ADMIN_ROLE)
                .antMatchers(HttpMethod.PUT,"/employee_time_management/employeeSalary/update").hasRole(ADMIN_ROLE)
                .antMatchers(HttpMethod.DELETE,"/employee_time_management/employeeSalary/delete").hasRole(ADMIN_ROLE)
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.POST,"/employee_time_management/Store/create").hasRole(ADMIN_ROLE)
                .antMatchers(HttpMethod.GET,"/employee_time_management/Store/read", "/employee_time_management/Store/getAll").hasRole(ADMIN_ROLE)
                .antMatchers(HttpMethod.PUT,"/employee_time_management/Store/update").hasRole(ADMIN_ROLE)
                .antMatchers(HttpMethod.DELETE,"/employee_time_management/Store/delete").hasRole(ADMIN_ROLE)
                .and()

                .csrf().disable()
                .formLogin().disable();
    }

    @Bean
    public PasswordEncoder encoder(){
         return new BCryptPasswordEncoder();
    }
}
