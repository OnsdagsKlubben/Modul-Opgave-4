package org.dat18c.grabbit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.extras.springsecurity4.dialect.SpringSecurityDialect;

/**
 * ThymeLeafConfig. 
 * Denne klasse er en konfigurations klasse til ThymeLeaf.
 * @author Frederik Lundbeck Jørgensen & Søren Carlsen
 */
@Configuration
public class ThymeLeafConfig {

    @Bean
    public SpringSecurityDialect springSecurityDialect()
    {
        return new SpringSecurityDialect();
    }

}