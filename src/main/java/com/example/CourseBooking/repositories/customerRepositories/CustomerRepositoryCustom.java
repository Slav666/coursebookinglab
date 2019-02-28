package com.example.CourseBooking.repositories.customerRepositories;

import com.example.CourseBooking.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    List<Customer> getCustomersByCourseId(Long course_id);
}
