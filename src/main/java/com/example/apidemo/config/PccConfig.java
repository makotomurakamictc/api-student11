package com.example.apidemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.gemfire.cache.config.EnableGemfireCaching;
import org.springframework.data.gemfire.config.annotation.EnableEntityDefinedRegions;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;

@EnableGemfireCaching
@EnableEntityDefinedRegions(basePackages = "com.example.apidemo.entity")
@EnableGemfireRepositories(basePackages = "com.example.apidemo.repository.gem")
@Profile("cloud")
@Configuration
public class PccConfig {
}
