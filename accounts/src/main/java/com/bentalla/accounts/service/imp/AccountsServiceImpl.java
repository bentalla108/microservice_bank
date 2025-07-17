package com.bentalla.accounts.service.imp;

import com.bentalla.accounts.dto.CustomerDto;
import com.bentalla.accounts.entity.Customer;
import com.bentalla.accounts.mapper.CustomerMapper;
import com.bentalla.accounts.repository.AccountsRepository;
import com.bentalla.accounts.repository.CustomerRepository;
import com.bentalla.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {
    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;
    /**
     * @param customerDto - CustomerDto Object
     */
    @Override
    public void createAccount(CustomerDto customerDto) {
        Customer customer = CustomerMapper.toCustomer(customerDto , new Customer());
        Optional<Customer>  optionalCustomer = customerRepository.findByMobileNumber(customerDto.getMobileNumber());

       if (optionalCustomer.isPresent()) {
           throw  new RuntimeException("Customer with mobile number " + customerDto.getMobileNumber() + " already exists");
       }
        customerRepository.save(customer);

    }
}
