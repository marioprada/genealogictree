/**
 * 
 */
package com.marioprada.spring.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

/**
 * @author mprada
 *
 */
@Configuration
@EnableAutoConfiguration
@EnableConfigServer
public class ApplicationConfigServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ApplicationConfigServer.class, args);
	}

}
