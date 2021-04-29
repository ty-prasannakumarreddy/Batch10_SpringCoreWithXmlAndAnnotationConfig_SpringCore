package com.tyss.springcore.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EngineConfig {
	@Bean
	public Engine getEngine() {
		Engine engine = new Engine();
		engine.setCc(1000);
		engine.setType("SUV");
		return engine;
	}
	

}
