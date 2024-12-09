package com.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("data.properties")
public class ConfigurationBean {
	public PropertySourcesPlaceholderConfigurer getPlaceholder() {
		System.out.println("In Placeholde");
		PropertySourcesPlaceholderConfigurer placeholder= new PropertySourcesPlaceholderConfigurer();
		
		return placeholder;
		
	}

}
