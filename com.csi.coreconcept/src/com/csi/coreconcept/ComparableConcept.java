package com.csi.coreconcept;

import java.util.ArrayList;
import java.util.Collections;

import org.omg.Messaging.SyncScopeHelper;
class Employee implements Comparable<Employee> {
	int empId;
	String empName;
	int empAge;

	public Employee(int empId, String empName, int empAge) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
	}
	private void Syso() {
		// TODO Auto-generated method stub
System.out.println("Hello");
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + "]";
	}

	public int compareTo(Employee e1) {
		if (e1.empAge == empAge) {
			return 0;
		} else if (e1.empAge < empAge) {
			return 1;
		} else {
			return -1;
		}
	}
}

public class ComparableConcept {

	public static void main(String[] args) {
		ArrayList<Employee> employeelist = new ArrayList<>();
		employeelist.add(new Employee(121, "Aruna", 21));
		employeelist.add(new Employee(143, "Vishal", 25));
		employeelist.add(new Employee(111, "Abhi", 12));
		
		Collections.sort(employeelist);
		employeelist.forEach(System.out::println);
	}
}