/**
 * 
 */
package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.exception.InvalidFieldException;
import com.springboot.model.Student;

import io.micrometer.common.util.StringUtils;

/**
 * @author Junaid.Khan
 *
 */

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@PostMapping
	public String saveStudentInfo(@RequestHeader("student-auth-key") String authorization,
			@RequestBody Student student) {
		
		if(StringUtils.isBlank(student.getLastName())) {
			throw new InvalidFieldException("Last Name is required field");
			
		}
		return String.format("Authorization %s is valid, and Data is saved", authorization);
	}

	@GetMapping
	public String getInter() {
		String a=null;
		if(StringUtils.isBlank(a)) {
			throw new InvalidFieldException("Last Name is required field");
			
		}
		return "method called";
	}
	
}
