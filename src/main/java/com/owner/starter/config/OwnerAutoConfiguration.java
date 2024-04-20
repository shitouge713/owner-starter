package com.owner.starter.config;

import com.owner.starter.bean.MyAnimals;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OwnerAutoConfiguration {

    @Bean(name="myAnimals")
    public MyAnimals myAnimals() {
        return new MyAnimals();
    }
}
