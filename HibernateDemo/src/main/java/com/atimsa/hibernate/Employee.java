package com.atimsa.hibernate;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int empId;
	String name;
	String departmentId;
	
	@OneToMany
	private List<Department> dept;

	public Employee() {

	}

	Employee(String name, String departmentId) {
		this.name = name;
		this.departmentId = departmentId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public List<Department> getDept() {
		return dept;
	}

	public void setDept(List<Department> dept) {
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public String toString() {
		return empId + " " + name + " " + departmentId;

	}

}
