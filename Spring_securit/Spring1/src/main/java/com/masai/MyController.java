package com.masai;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/welcome")
	public ResponseEntity<String> welcome(){
	return new ResponseEntity<String>("Welcome to Masai App without security",HttpStatus.
	ACCEPTED);
	}
	
	@GetMapping("/welcomep")
	public ResponseEntity<String> welcomep(){
	return new ResponseEntity<String>("Welcome to Masai App without security",HttpStatus.
	ACCEPTED);
	}
	
	@GetMapping("/admin")
	public ResponseEntity<String> admin(){
	return new ResponseEntity<String>("Welcome to admin",HttpStatus.
	ACCEPTED);
	}
}
