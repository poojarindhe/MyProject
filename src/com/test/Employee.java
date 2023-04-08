package com.test;

import java.util.Objects;
import java.util.Scanner;

public class Employee
{	
	
	private int eid;
	private String ename;
	private int eage;
	private int esalary;
	
	
	
	public Employee(int eid, String ename, int eage, int esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eage = eage;
		this.esalary = esalary;
	}
	public int getEid() 
	{
		return eid;
	}
	public void setEid(int eid) 
	{
		this.eid = eid;
	}
	public String getEname() 
	{
		return ename;
	}
	public void setEname(String ename)
	{
		this.ename = ename;
	}
	public int getAge()
	{
		return eage;
	}
	public void setAge(int age)
	{
		this.eage = age;
	}
	public int getSalary() 
	{
		return esalary;
	}
	public void setSalary(int salary) 
	{
		this.esalary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", esalary=" + esalary + "]";
	}
	
	
	

}