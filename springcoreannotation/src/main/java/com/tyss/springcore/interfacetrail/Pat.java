package com.tyss.springcore.interfacetrail;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class Pat {
	private String name;
	@Autowired
	private Animal animal;

}
