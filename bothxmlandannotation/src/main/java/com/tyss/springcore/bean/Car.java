package com.tyss.springcore.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;
@Data
public class Car  implements Serializable{
	
	private String Company;
	@Autowired
	private Engine engine;
	

}
