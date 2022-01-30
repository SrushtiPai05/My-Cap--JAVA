package com.emp.pck;

public class EmployeeDetail {

	
	private String name;
	private int yoj;
	private double salary;
	private String adress;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYoj() {
		return yoj;
	}
	public void setYoj(int yoj) {
		this.yoj = yoj;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public EmployeeDetail(String name, int yoj, double salary, String adress) {
		super();
		this.name = name;
		this.yoj = yoj;
		this.salary = salary;
		this.adress = adress;
	}
	public EmployeeDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EmployeeDetail [name=" + name + ", yoj=" + yoj + ", salary="
				+ salary + ", adress=" + adress + "]";
	}
}




