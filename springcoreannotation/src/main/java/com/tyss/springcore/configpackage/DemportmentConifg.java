package com.tyss.springcore.configpackage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.tyss.springcore.annotation.Deportment;

@Configuration
public class DemportmentConifg {
	@Bean("dev")
	public Deportment getdept() {
		Deportment dept  = new Deportment();
		dept.setDname("development");
		dept.setDno(10);
		return dept;
	}
	@Bean("hr")
	//@Primary
	public Deportment getdepthr() {
		Deportment dept  = new Deportment();
		dept.setDname("Hr");
		dept.setDno(20);
		return dept;
	}

	@Bean("test")
	public Deportment getdeptTest() {
		Deportment dept  = new Deportment();
		dept.setDname("testing");
		dept.setDno(30);
		return dept;
	}


}
