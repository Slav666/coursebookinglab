package com.example.CourseBooking.components;

import com.example.CourseBooking.models.Booking;
import com.example.CourseBooking.models.Course;
import com.example.CourseBooking.models.Customer;
import com.example.CourseBooking.repositories.bookingRepositories.BookingRepository;
import com.example.CourseBooking.repositories.courseRepositories.CourseRepository;
import com.example.CourseBooking.repositories.customerRepositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Customer customer1 = new Customer("Bob", "Edinburgh", 30);
        Customer customer2 = new Customer("Bill", "Glasgow", 20);
        Customer customer3 = new Customer("Ben", "Edinburgh", 17);
        customerRepository.save(customer1);
        customerRepository.save(customer2);
        customerRepository.save(customer3);

        Course course1 = new Course("Python", "Edinburgh", 5);
        Course course2 = new Course("C++", "Edinburgh", 4);
        Course course3 = new Course("Javascript", "Glasgow", 1);
        courseRepository.save(course1);
        courseRepository.save(course2);
        courseRepository.save(course3);

        Booking booking1= new Booking("10-01-18",customer1, course1);
        Booking booking2= new Booking("13-07-17",customer1, course2);
        Booking booking3= new Booking("16-06-16",customer1, course3);
        Booking booking4= new Booking("10-09-19",customer2, course3);
        bookingRepository.save(booking1);
        bookingRepository.save(booking2);
        bookingRepository.save(booking3);
        bookingRepository.save(booking4);
    }

}
