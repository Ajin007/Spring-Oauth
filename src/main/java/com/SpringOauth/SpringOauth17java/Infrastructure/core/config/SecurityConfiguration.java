package com.SpringOauth.SpringOauth17java.Infrastructure.core.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/*	
 * <p>Here the security extends websecurityconfigurerAdapter so that we can control the http calls whether to permit 
 * all or not lik that  </p>
 * <p>
 * 	 @EnableMethodSecurity is used instead of this @EnableGlobalMethodSecurity(prePostEnabled = true)

    This annotation is used to enable Spring Security's method-level security.
    The prePostEnabled = true parameter enables Spring Security's pre and post annotations such as @PreAuthorize, @PostAuthorize, etc.
    It allows you to use annotations to control access to methods based on certain conditions or roles.
 * </p>
 */

@SuppressWarnings("deprecation")
@Configuration
@EnableMethodSecurity
@ConditionalOnProperty("Springpro.security.basicauth.enable")
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	@Override
	public void configure(HttpSecurity Http) throws Exception{
		
		
	}
	
}
