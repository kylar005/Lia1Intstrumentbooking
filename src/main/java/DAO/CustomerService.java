package DAO;

import Entites.Customer;
import repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void saveMockCustomers() {
        // Mock data for Customer
        Customer customer1 = new Customer(1, "Kalle", "Anka", "Disney Street 1", "kalle.anka@gmail.com", "kalle123");
        Customer customer2 = new Customer(2, "Musse", "Pigg", "Disney Street 2", "Musse.Pigg@gmail.com", "Musse123");
        Customer customer3 = new Customer(3, "Mimmi", "Pigg", "Disney Street 2", "Mimmi.Pigg@fmail.com", "Mimmi123");
        Customer customer4 = new Customer(4, "Kylar", "Eriksson", "Java Street 1", "Kylar.eriksson@gmail.com", "Kylar123");
        Customer customer5 = new Customer(5, "Ramlah", "Awale", "Java Street 2", "Ramlah.awale@gmail.com", "Ramlah123");
        customerRepository.save(customer1);
        customerRepository.save(customer2);
        customerRepository.save(customer3);
        customerRepository.save(customer4);
        customerRepository.save(customer5);
    }
}
