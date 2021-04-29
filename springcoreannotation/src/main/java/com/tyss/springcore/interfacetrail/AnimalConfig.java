package com.tyss.springcore.interfacetrail;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AnimalConfig {
	@Bean
	@Primary
	public Animal getDog() {
		return new Dog();
	}

	@Bean
	public Animal getCat() {
		return new Cat();
	}

}
