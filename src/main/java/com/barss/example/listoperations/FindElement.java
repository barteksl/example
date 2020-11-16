package com.barss.example.listoperations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//https://www.baeldung.com/java-collections
public class FindElement {

    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "Adam"));
        customers.add(new Customer(2, "Ola"));
        customers.add(new Customer(3, "Czesio"));

        Customer customer = findCustomerByName("Ola", customers);
        if (customer != null) {
            System.out.println(customer.toString());
        }
        customer = findCustomerByNameIterator("Czesio", customers);
        if (customer != null) {
            System.out.println(customer.toString());
        }
        customer = findCustomerByNameStream("Adam", customers);
        if (customer != null) {
            System.out.println(customer.toString());
        } else {
            System.out.println("Brak");
        }

    }

    // Basic looping
    public static Customer findCustomerByName(String name, List<Customer> customers) {
        for (Customer customer : customers) {
            if (name.equals(customer.getName())) {
                return customer;
            }
        }
        return null;
    }

    //Looping with Iteraor
    public static Customer findCustomerByNameIterator(String name, List<Customer> customers) {
        Iterator<Customer> iterator = customers.iterator();
        while (iterator.hasNext()) {
            Customer customer = iterator.next();
            if (name.equals(customer.getName())) {
                return customer;
            }
        }
        return null;
    }

    //Stream API
    public static Customer findCustomerByNameStream(String name, List<Customer> customers) {
        Customer customer = customers.stream()
                .filter(c -> name.equals(c.getName()))
                .findAny()
                .orElse(null);
        return customer;
    }

    public static class Customer {

        private int id;
        private String name;

        public Customer(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Customer {" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}

