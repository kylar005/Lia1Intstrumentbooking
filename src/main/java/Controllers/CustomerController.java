package Controllers;

import DAO.CustomerCRUD;
import Entites.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ customers")
public class CustomerController {

    private CustomerCRUD crudCustomer;

    public CustomerController(CustomerCRUD crudCustomer){
        this.crudCustomer = crudCustomer;
    }

    // Get all customers
    @GetMapping
    public List<Customer> GetAllCustomer() {

        return crudCustomer.getAllCustomer();
    }

    // Create all customers



    // Update all customers for mapping




    // delete all customers



}