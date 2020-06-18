package com.javatechie.consul.api;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@ConfigurationProperties
@Data
public class MyConfig {
	
	
	private String username;
	private String password;

}
