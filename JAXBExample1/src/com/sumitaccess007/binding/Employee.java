package com.sumitaccess007.binding;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="employee")
public class Employee implements Serializable{
private int empNo;
private String name;
private double salary;
public int getEmpNo() {
	return empNo;
}
public void setEmpNo(int empNo) {
	this.empNo = empNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
}
