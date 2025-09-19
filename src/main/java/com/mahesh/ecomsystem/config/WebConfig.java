package com.mahesh.ecomsystem.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOriginPatterns("*")  // works with credentials
                .allowedMethods("*")         // GET, POST, PUT, DELETE, OPTIONS
                .allowedHeaders("*")         // Allow all headers
                .allowCredentials(true);     // Allow Authorization header / cookies
    }
}

