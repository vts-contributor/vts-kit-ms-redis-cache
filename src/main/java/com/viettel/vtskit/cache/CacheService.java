package com.viettel.vtskit.cache;

import com.viettel.vtskit.cache.configuration.ConstantConfiguration;
import com.viettel.vtskit.cache.configuration.CacheProperties;
import org.springframework.beans.factory.annotation.Autowired;

public class CacheService {

    private CacheProperties cacheProperties;

    public String exampleFunction(String name){
        return String.format(ConstantConfiguration.GREETING_MESSAGE, name);
    }

    @Autowired
    public void setCacheProperties(CacheProperties cacheProperties) {
        this.cacheProperties = cacheProperties;
    }
}
