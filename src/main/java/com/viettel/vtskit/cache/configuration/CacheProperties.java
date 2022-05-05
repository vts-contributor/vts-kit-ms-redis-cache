package com.viettel.vtskit.cache.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.annotation.PostConstruct;

@ConfigurationProperties(prefix = "vtskit.redis")
public class CacheProperties {

    /**
     * Validate properties at here if necessary
     */
    private void validateProperties(){

    }

    @PostConstruct
    void init(){
        validateProperties();
    }

}
