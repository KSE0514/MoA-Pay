package com.moa.store.global.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("https://localhost:8765", "http://localhost:8765", "https://localhost", "http://localhost",
                        "http://localhost:5173", "https://localhost:5173", "https://moapay-7e24e.web.app",
                        "https://j11c201.p.ssafy.io", "https://j11c201.p.ssafy.io/api", "http://j11c201.p.ssafy.io", "http://j11c201.p.ssafy.io/store", "https://j11c201.p.ssafy.io/store",
                        "https://moapay-samsungmall-clone.web.app")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS")
                .allowedHeaders("*")
                .maxAge(3600);
    }
}