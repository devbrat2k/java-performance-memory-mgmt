package com.devbrat2k.java.memory.references.escaping.readOnly;

import com.devbrat2k.java11.virtualProgramming.customer.implementation.ReadonlyCustomer;

public class Main {

	public static void main(String[] args) {
		CustomerRecordsReadonly records = new CustomerRecordsReadonly();

		records.addCustomer(new ReadonlyCustomer("John"));
		records.addCustomer(new ReadonlyCustomer("Simon"));
				
		for (CustomerInterface next : records.getCustomers().values())
		{
			System.out.println(next);
		}

		CustomerInterface c = records.findCustomerByName("John");

		((ReadonlyCustomer)c).setName("JohnNew");

		for (CustomerInterface next : records.getCustomers().values())
		{
			System.out.println(next);
		}

	}
	
}
