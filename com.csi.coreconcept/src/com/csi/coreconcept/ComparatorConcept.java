package com.csi.coreconcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Customer
{
	int customerId;
	String customerName;
	int customerAge;
	String customerAddress;
	double customerSalary;
	public Customer(int customerId, String customerName, int customerAge, String customerAddress,
			double customerSalary) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAge = customerAge;
		this.customerAddress = customerAddress;
		this.customerSalary = customerSalary;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAge=" + customerAge
				+ ", customerAddress=" + customerAddress + ", customerSalary=" + customerSalary + "]";
	}
}
class NameComparator implements Comparator<Customer>
{
	public int compare(Customer o1, Customer o2)
	{
		return o1.customerName.compareTo(o2.customerName);
	}
}
class AgeComparator implements Comparator<Customer>
{
	public int compare(Customer o1, Customer o2)
	{
		if(o1.customerAge==o2.customerAge)
		{
			return 0;
		}else if (o1.customerAge>o2.customerAge)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
class SalaryComparator implements Comparator<Customer>
{
	public int compare(Customer o1, Customer o2)
	{
		if(o1.customerSalary==o2.customerSalary)
		{
			return 0;
		}else if (o1.customerSalary>o2.customerSalary)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
public class ComparatorConcept 
{
	public static void main(String[] args) 
	{
		ArrayList<Customer> customerlist=new ArrayList<>();
		customerlist.add(new Customer(111, "Aruna",26,"Pune",124320.54));
		customerlist.add(new Customer(110, "Vishal",27,"Indapur",167350.54));
		customerlist.add(new Customer(114, "Abhi",22,"Pune",589440.76));
		customerlist.add(new Customer(141, "Apeksha",28,"Goa",123450.45));
		customerlist.add(new Customer(132, "Aparna",29,"Kharadi",653542.54));
		System.out.println("/n Age Sorting");
		Collections.sort(customerlist, new AgeComparator());
		customerlist.forEach(cc->System.out.println(cc));
		System.out.println("/n Name Sorting");
		Collections.sort(customerlist, new NameComparator());
		customerlist.forEach(cc->System.out.println(cc));
		System.out.println("/n Salary Sorting");
		Collections.sort(customerlist, new SalaryComparator());
		customerlist.forEach(cc->System.out.println(cc));	
	}

}
