package com.hunter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Movie movies() {
		return new MovieService();
	}
	/*
	 * this is same as the following bean definition in XML
	 * 
	 * <bean id="movies" class="com.hunter.MovieService"/>
	 */
	@Bean
	public movieLib library() {
		return  new DvdLib();
	}
}
