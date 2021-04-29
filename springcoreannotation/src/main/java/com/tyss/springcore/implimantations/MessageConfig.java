package com.tyss.springcore.implimantations;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfig {
	
	public MessageBean getmsg() {
		MessageBean bean = new MessageBean();
		bean.setMsg("now you  ");
		
		
		
	}

}
