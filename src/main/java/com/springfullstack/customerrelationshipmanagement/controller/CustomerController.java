package com.springfullstack.customerrelationshipmanagement.controller;

import com.springfullstack.customerrelationshipmanagement.entity.Customer;
import com.springfullstack.customerrelationshipmanagement.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        super();
        this.customerService = customerService;
    }

//    Handler method to Handle list customers
    @GetMapping("/customers")
    public String listCustomers(Model themodel){
       themodel.addAttribute("customers", customerService.getAllCustomers());
       return "customers";
    }

    @GetMapping("/customers/new")
    public String showFormForAdd(Model theModel) {

        // create student object to hold student form data
        Customer customer = new Customer();

        theModel.addAttribute("customer", customer);

        return "create_customer";
    }

    @PostMapping("/customers")
    public String saveCustomer(@ModelAttribute("customer") Customer customer){
        customerService.saveCustomer(customer);
        return "redirect:/customers";
    }

    @GetMapping("/customers/edit/{id}")
    public String editCustomerForm(@PathVariable Long id, Model theModel){
        theModel.addAttribute("customer", customerService.getCustomerById(id));
        return "edit_customer";
    }

    @PostMapping("/customers/{id}")
    public String updateCustomer(@PathVariable Long id,
                                 @ModelAttribute("customer") Customer customer,
                                 Model theModel){

        //get customer from database by id
        Customer existingCustomer = customerService.getCustomerById(id);
        existingCustomer.setId(id);
        existingCustomer.setFirstName(customer.getFirstName());
        existingCustomer.setLastName(customer.getLastName());
        existingCustomer.setEmail(customer.getEmail());
        existingCustomer.setCompany(customer.getCompany());

        //save updated customer object
        customerService.updateCustomer(existingCustomer);
        return "redirect:/customers";
    }

    //delete handler method
    @GetMapping("/customers/{id}")
    public String deleteCustomer(@PathVariable Long id){

        customerService.deleteCustomeById(id);
        return "redirect:/customers";
    }

    @GetMapping("/customers/search")
    public String listCustomers(@RequestParam(name = "search", required = false) String search,
                                Model theModel) {
        List<Customer> searchResults;

        if (search != null && !search.isEmpty()) {
            // Split the search term into first name and last name
            String[] names = search.split("\\s+", 2);

            // If both first name and last name are provided, use the custom query method
            if (names.length == 2) {
                searchResults = customerService.searchCustomersByFirstNameAndLastName(names[0], names[1]);
            } else {
                // If only one name is provided or no name at all, use the existing searchCustomers method
                searchResults = customerService.searchCustomers(search);
            }
        } else {
            // If no search term is provided, get all customers
//            searchResults = customerService.getAllCustomers();
            return "redirect:/customers";
        }

        theModel.addAttribute("customers", searchResults);
        return "search_customer";
    }

}
