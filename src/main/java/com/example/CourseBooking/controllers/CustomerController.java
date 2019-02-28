package com.example.CourseBooking.controllers;

import com.example.CourseBooking.models.Customer;
import com.example.CourseBooking.repositories.customerRepositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/course/{course_id}")
    public List<Customer> customersForAGivenCourse(@PathVariable Long course_id){
        return customerRepository.customersForAGivenCourse(course_id);
    }

}
