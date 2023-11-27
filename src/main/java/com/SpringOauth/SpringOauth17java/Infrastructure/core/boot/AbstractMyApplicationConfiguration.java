package com.SpringOauth.SpringOauth17java.Infrastructure.core.boot;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import io.swagger.v3.oas.annotations.tags.Tag;

@EnableAutoConfiguration
@EnableWebSecurity
@ComponentScan(basePackages = "com.SpringOauth.SpringOauth17java.**")
@Tag(name = "",description = "")
public class AbstractMyApplicationConfiguration {

}
