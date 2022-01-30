package com.emp.pck;
import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
      List<EmployeeDetail> employees=new ArrayList<EmployeeDetail>();
		
		employees.add(new EmployeeDetail("Robert", 1994, 60000, "64C-Walls Street"));
		employees.add(new EmployeeDetail("Sam", 2000, 70000, "68D-Walls Street"));
		employees.add(new EmployeeDetail("Jhon", 1999, 80000, "26B-Walls Street"));
		
		System.out.printf("%6s %20s %11s %16s", "NAME", "YEAR OF JOINING", "SALARY", "ADDRESS");
		System.out.println();
		System.out.println();
		//System.out.println("-------------------------------------------------------------");
		for(EmployeeDetail employee: employees)
		{
			System.out.format("%7s %13s %18s %20s", employee.getName(), employee.getYoj(), employee.getSalary(), employee.getAdress());
			System.out.println();
		}
	}

	}


