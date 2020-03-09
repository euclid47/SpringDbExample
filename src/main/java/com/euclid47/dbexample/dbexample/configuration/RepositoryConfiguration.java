package com.euclid47.dbexample.dbexample.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.euclid47.dbexample.dbexample.models"})
@EnableJpaRepositories(basePackages = {"com.euclid47.dbexample.dbexample.repository"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}
