/**
 * 16 mai 2022, com.example.demo.controller
 */
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.implementation.StudentServiceImpl;

/**
 * @author benpr
 *
 */
@RestController
@CrossOrigin
public class StudentController {
	
	@Autowired
	StudentServiceImpl service;
	
	@GetMapping("/")
	ResponseEntity<String> hello(){
		return new ResponseEntity<String>("hello World", HttpStatus.OK);
	}

}
