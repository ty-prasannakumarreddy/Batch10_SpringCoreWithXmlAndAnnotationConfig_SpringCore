package com.tyss.springcore.implimantations;

import java.io.Serializable;

import lombok.Data;
@Data
public class MessageBean implements Serializable {
	public MessageBean() {
		System.out.println("Instantiation Phase");
		
	}
	private String msg;
	
	public void init() {
		
	}

}
