package com.tyss.springcore.annotation;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;
@Data

public class EmployeeTwo  implements Serializable{
	
	private int id;
	private String ename;
	@Autowired
	@Qualifier(value="test")
	private Deportment deportment;

}
