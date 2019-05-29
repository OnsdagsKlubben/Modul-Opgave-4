package org.dat18c.grabbit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.extras.springsecurity4.dialect.SpringSecurityDialect;

/**
 * ThymeLeafConfig
 */
@Configuration
public class ThymeLeafConfig {

    @Bean
    public SpringSecurityDialect springSecurityDialect()
    {
        return new SpringSecurityDialect();
    }

}