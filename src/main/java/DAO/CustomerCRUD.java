package DAO;

import Entites.Customer;
import DAO.CustomerRepository;
import jakarta.persistence.EntityNotFoundException;

import java.util.List;
import java.util.Optional;

public class CustomerCRUD {

    private final CustomerRepository customerRepository;


    public CustomerCRUD (CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    // Get all customers
    public List<Customer> getAllCustomer(){
        return customerRepository.findAll();
    }

    public Optional<Customer> getCustomerById(Long id) {

        return customerRepository.findById(id);
    }

    // create customer
    public Customer createCustomer(Customer customer) {

        return customerRepository.save(customer);
    }

    // Update customer
    public Customer updateCustomer( Long id, Customer updatCustomer){
        Customer existingCustomer = customerRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Customer with id:" + id + " not found"));

        existingCustomer.setFirstName(updatCustomer.getFirstName());
        existingCustomer.setLastName(updatCustomer.getLastName());
        existingCustomer.setAddress(updatCustomer.getAddress());
        existingCustomer.setEmail(updatCustomer.getEmail());
        existingCustomer.setPassword(updatCustomer.getPassword());

        return customerRepository.save(existingCustomer);
    }

    public  void deleteCustomer(Long id){

        Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Customer with id:" + id + " not found"));

        customerRepository.delete(customer);

    }

}