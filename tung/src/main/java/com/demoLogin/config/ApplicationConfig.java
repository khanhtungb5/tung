package com.demoLogin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.demoLogin.repository.CustomerRepository;
import com.demoLogin.repository.CustomerRepositoryImpl;
import com.demoLogin.services.CustomerService;
import com.demoLogin.services.CustomerServiceImpl;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {
        "com.edu.phuxuan.cntt.k17.demoLogin"
})

public class ApplicationConfig {
    @Bean
    public InternalResourceViewResolver resolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setViewClass(JstlView.class);
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
    @Bean
    public CustomerService customerService(){
        return new CustomerServiceImpl();
    }

    @Bean
    public CustomerRepository customerRepository(){
        return new CustomerRepositoryImpl();
    }
    
}