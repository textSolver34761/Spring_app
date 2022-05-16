/**
 * 16 mai 2022, com.example.demo.service.implementation
 */
package com.example.demo.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

/**
 * @author benpr
 *
 */

@Component
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	Student student;

	@Override
	public void toto() {
		student.setFirstname("toto");
		student.setName("Toto");
		student.setId(0);
	}

}
