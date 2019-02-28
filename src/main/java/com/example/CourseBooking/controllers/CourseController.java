package com.example.CourseBooking.controllers;

import com.example.CourseBooking.models.Course;
import com.example.CourseBooking.repositories.courseRepositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/rating/{rating}")
    public List<Course> getCoursesByRating(@PathVariable int rating){
        return courseRepository.findCoursesByRating(rating);
    }

    @GetMapping(value = "/customer/{customer_id}")
    public List<Course> coursesForAGivenCustomer(@PathVariable Long customer_id){
        return courseRepository.coursesForAGivenCustomer(customer_id);
    }
}
