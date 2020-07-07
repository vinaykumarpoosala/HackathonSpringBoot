package com.tcs.ascend.CustomerManagement_DT20195828044;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired
	CustomerRepo repo;

	public String createCustomer(Customer cust) {
		repo.save(cust);
		return "Customer with ssnid: " + cust.getSsnId() + " is registered successfully";
	}

	public Customer getCustomer(int id) {

		return repo.findById(id).get();
	}

	public List<Customer> getCustomers() {
		return (List<Customer>) repo.findAll();
	}

	public String deletCustomer(int id) {
		String responseMessage = "";
		Optional<Customer> ct = repo.findById(id);

		if (!ct.isPresent())
			responseMessage = "No customer exists with id: " + id + " for deletion";

		else {
			repo.deleteById(id);
			responseMessage = "Customer with id: " + id + " is deleted successfully";
		}
		return responseMessage;

	}

	public String updateCustomer(Customer cust) {
		Optional<Customer> ct = repo.findById(cust.getCustomerId());
		String responseMessage = "";
		if (ct.isPresent()) {
			Customer tempCust = ct.get();
			if (tempCust.getSsnId().equals(cust.getSsnId())) {
				repo.save(cust);
				responseMessage = "Customer with id: " + cust.getCustomerId() + " updated successfully";
			} else {
				responseMessage = "Customer updation failed for id: " + cust.getCustomerId() + " and ssn: "
						+ cust.getSsnId();

			}

		} else {

			responseMessage = "Customer updation failed for id: " + cust.getCustomerId() + " and ssn: "
					+ cust.getSsnId();

		}

		return responseMessage;
	}
}
