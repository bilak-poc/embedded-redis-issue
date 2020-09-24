package com.github.bilak.poc.embeddedredisissue;

import org.springframework.boot.autoconfigure.cache.RedisCacheManagerBuilderCustomizer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
public class CacheConfig {

  @Bean
  RedisCacheManagerBuilderCustomizer redisCacheManagerBuilderCustomizer(){
    return builder -> {

    };
  }
}
