/**
 * 
 */
package com.springboot.model;

import java.io.Serializable;

/**
 * @author Junaid.Khan
 *
 */
public class Student implements Serializable{

	
	private static final long serialVersionUID = 1L;

	private String id;
	private String firstName;
	private String lastName;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	
}
