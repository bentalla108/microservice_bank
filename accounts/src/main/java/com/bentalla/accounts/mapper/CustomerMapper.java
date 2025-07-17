package com.bentalla.accounts.mapper;

import com.bentalla.accounts.dto.CustomerDto;
import com.bentalla.accounts.entity.Customer;

public class CustomerMapper {
    public static CustomerDto toCustomerDto (Customer customer , CustomerDto customerDto) {
       customerDto.setEmail(customer.getEmail());
       customerDto.setName(customer.getName());
       customerDto.setMobileNumber(customer.getMobileNumber());
       return customerDto;
    }

    public static Customer toCustomer (CustomerDto customerDto , Customer customer) {
        customer.setName(customerDto.getName());
        customer.setEmail(customerDto.getEmail());
        customer.setMobileNumber(customerDto.getMobileNumber());
        return customer;
    }
}
