package com.example.CourseBooking.repositories.customerRepositories;

import com.example.CourseBooking.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    List<Customer> customersForAGivenCourse(Long course_id);
}
