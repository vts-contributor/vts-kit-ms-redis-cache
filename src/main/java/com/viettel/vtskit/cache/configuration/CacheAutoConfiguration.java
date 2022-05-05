package com.viettel.vtskit.cache.configuration;

import com.viettel.vtskit.cache.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(CacheProperties.class)
public class CacheAutoConfiguration {

    private CacheProperties cacheProperties;

    @Bean
    public CacheService cacheService(){
        return new CacheService();
    }

    @Autowired
    public void setCacheProperties(CacheProperties cacheProperties) {
        this.cacheProperties = cacheProperties;
    }
}
