/**
 * 
 */
package com.example.demo.model;

import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * @author benpr
 *
 */
@Data
@Component
public class Student {
	
	private int id;
	private String firstname, name;
	
}
