package com.tcs.ascend.CustomerManagement_DT20195828044;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Autowired
	CustomerService service;

	@CrossOrigin
	@PostMapping("/2232registerCustomer")
	public ResponseEntity<String> createCustomer(@RequestBody Customer cust) {
		return new ResponseEntity<String>(service.createCustomer(cust), HttpStatus.OK);
	}

	@CrossOrigin
	@GetMapping("/2232viewAllCustomers")
	public ResponseEntity<String> getCustomers() {
		return new ResponseEntity<String>(service.getCustomers().toString(), HttpStatus.OK);
	}

	@CrossOrigin
	@GetMapping("/2232viewCustomerById/{id}")
	public ResponseEntity<String> getCustomer(@PathVariable int id) {
		return new ResponseEntity<String>(service.getCustomer(id).toString(), HttpStatus.OK);
	}

	@CrossOrigin
	@PutMapping("/2232updateCustomer")
	public ResponseEntity<String> updateCustomer(@RequestBody Customer st) {
		return new ResponseEntity<String>(service.updateCustomer(st), HttpStatus.OK);

	}

	@CrossOrigin
	@DeleteMapping("/2232deleteCustomer/{id}")
	public ResponseEntity<String> deletCustomer(@PathVariable int id) {
		return new ResponseEntity<String>(service.deletCustomer(id), HttpStatus.OK);

	}

}
