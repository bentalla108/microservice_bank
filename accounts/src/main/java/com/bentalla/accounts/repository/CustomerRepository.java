package com.bentalla.accounts.repository;

import com.bentalla.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CustomerRepository  extends JpaRepository<Customer , Long> {
    Optional<Customer> findByMobileNumber(String mobileNumber);
}
