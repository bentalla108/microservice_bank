package com.bentalla.accounts.repository;

import com.bentalla.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository  extends JpaRepository<Customer , Long> {
}
