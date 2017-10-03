package gr.hiber.springdemo.service;

import java.util.List;

import gr.hiber.springdemo.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void delelteCustomer(int theId);

}
