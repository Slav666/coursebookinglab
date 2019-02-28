package com.example.CourseBooking;

import com.example.CourseBooking.models.Booking;
import com.example.CourseBooking.models.Course;
import com.example.CourseBooking.models.Customer;
import com.example.CourseBooking.repositories.customerRepositories.BookingRepository;
import com.example.CourseBooking.repositories.customerRepositories.CourseRepository;
import com.example.CourseBooking.repositories.customerRepositories.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseBookingApplicationTests {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canSaveACustomer(){
	    Customer customer = new Customer("Bob", "Edinburgh", 30);
	    customerRepository.save(customer);
    }

    @Test
    public void canSaveACourse(){
	    Course course = new Course("Java", "Glasgow", 4);
	    courseRepository.save(course);

    }

    @Test
    public void canMakeABooking(){
        Customer customer = new Customer("Bob", "Edinburgh", 30);
        customerRepository.save(customer);

        Course course = new Course("Java", "Glasgow", 4);
        courseRepository.save(course);

        Booking booking = new Booking("10-10-77", customer, course);
        bookingRepository.save(booking);
    }
}
