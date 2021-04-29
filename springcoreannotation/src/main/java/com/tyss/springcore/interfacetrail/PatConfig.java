package com.tyss.springcore.interfacetrail;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({ AnimalConfig.class })
@Configuration
public class PatConfig {
	@Bean
	public Pat getPetObject() {
		Pat pat = new Pat();
		pat.setName("sweety");
		return pat;

	}

}
