package com.employeeApplication.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "employee_tbl")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	@Column(name = "emp_name")
	private String ename;
	@Column(name = "emp_gender")
	private String gender;
	@Column(name = "emp_dept")
	private String department;
//	@ElementCollection
//	@OrderColumn(name = "pos")
//	private String[] hobbies;
	
	private ArrayList<Boolean> hobbies;
//	@JsonProperty("hobbies")
//	private String hobbies;
	
	
	

}
