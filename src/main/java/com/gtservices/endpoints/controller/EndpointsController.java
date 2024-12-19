package com.gtservices.endpoints.controller;

import java.util.HashMap;
import java.util.Map;
import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EndpointsController {
	
	@GetMapping("/healthcheck")
	public Map<String , String> health(){
		
		Map<String, String> response = new HashMap<String, String>();
		response.put("status","Server is running smoot");
		return response;
	}

	
	@PostMapping("/echo")
	public Map<String, Object> echo(@RequestBody Map<String, Object> body){
		return body;
	}
	
	@GetMapping("/time")
	public Map<String, String> time(){
		Map<String, String> response = new HashMap<String, String>();
		
		response.put("Current Time", Instant.now().toString());
		
		return response;
	}
	
}
