package com.devbrat2k.java.memory.references.escaping;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerRecords {
	private Map<String, Customer> records;
	
	public CustomerRecords() {
		this.records = new HashMap<String, Customer>();
	}
	
	public void addCustomer(Customer c) {
		this.records.put(c.getName(), c);
	}


	public Map<String, Customer> getCustomers() {
		return this.records;
	}

	public Iterator<Customer> getCustomersInterator() {
		return this.records.values().iterator();
	}
	public Map<String, Customer> getUnmodifiedableCustomers() {
		return Collections.unmodifiableMap(this.records);
	}

	public Map<String, Customer> getUnmodifiedableCustomerswithJava17() {
		return Map.copyOf(this.records);
	}
}
