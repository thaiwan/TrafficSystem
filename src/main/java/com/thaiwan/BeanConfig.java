package com.thaiwan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages = {"com.thaiwan"})
public class BeanConfig {
    private Environment env;

    @Autowired
    public BeanConfig(Environment env) {
        this.env = env;
    }
}
