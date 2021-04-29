package com.tyss.springcore.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Employee implements Serializable {
	public Employee() {
		
	}
	 private int eid;
	 
	 private String ename;
	 

}
