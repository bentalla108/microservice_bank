package com.bentalla.accounts.service;

import com.bentalla.accounts.dto.CustomerDto;

public interface IAccountsService {
    /**
     *
     * @param customerDto - CustomerDto Object
     *
     */
    void createAccount(CustomerDto customerDto);


}
