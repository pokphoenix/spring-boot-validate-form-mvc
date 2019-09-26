package com.poktest.spring.validate.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
public class MVCConfig implements WebMvcConfigurer {

//  if found error java.lang.ClassNotFoundException: javax.servlet.jsp.jstl.core.Config
//  much add dependency
//  <dependency>
//			<groupId>javax.servlet.jsp.jstl</groupId>
//			<artifactId>javax.servlet.jsp.jstl-api</artifactId>
//			<version>1.2.1</version>
//	</dependency>
    @Bean
    public InternalResourceViewResolver resolver(){

        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setViewClass(JstlView.class);
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
