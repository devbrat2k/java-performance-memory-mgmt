package com.devbrat2k.java.memory.references.escaping.readOnly;

import com.devbrat2k.java11.virtualProgramming.customer.implementation.ReadonlyCustomer;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerRecordsReadonly implements Iterable<CustomerInterface>{

        private Map<String, CustomerInterface> records;

        public CustomerRecordsReadonly() {
            this.records = new HashMap<>();
        }

        public void addCustomer(ReadonlyCustomer c) {
            this.records.put(c.getName(), c);
        }

        public ReadonlyCustomer findCustomerByName(String name) {
            return new ReadonlyCustomer(records.get(name));
        }

        public Map<String, CustomerInterface> getCustomers() {
            return this.records;
        }

        @Override
        public Iterator<CustomerInterface> iterator() {
            return this.records.values().iterator();
        }
        public Map<String, CustomerInterface> getUnmodifiedableCustomers() {
            return Collections.unmodifiableMap(this.records);
        }

        public Map<String, CustomerInterface> getUnmodifiedableCustomerswithJava17() {
            return Map.copyOf(this.records);
        }


}

