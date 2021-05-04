package com.pointel.test;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@PostMapping(value = "/textMsg", produces = {MediaType.APPLICATION_JSON_VALUE})
	public String textMsg(String msg) {
		
		return  "{" +"\"fulfillmentText\": \"This is basith\"" +"}";
	}
	
}
