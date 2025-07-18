package com.bentalla.accounts.controller;

import com.bentalla.accounts.constants.AccountsConstants;
import com.bentalla.accounts.dto.CustomerDto;
import com.bentalla.accounts.dto.ResponseDto;
import com.bentalla.accounts.entity.Customer;
import com.bentalla.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api" , produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
public class AccountController {
    IAccountsService accountsService;
    @PostMapping("/create")
    public ResponseEntity<ResponseDto>createAccount(@RequestBody CustomerDto customerDto) {
        accountsService.createAccount(customerDto);
        return ResponseEntity.
                status(HttpStatus.CREATED).body(new ResponseDto(
                  AccountsConstants.STATUS_201,
                  AccountsConstants.MESSAGE_201
          ));
    }

    @GetMapping("/fetch")
    public ResponseEntity<CustomerDto>getAccounts(@RequestParam String mobileNumber) {
        CustomerDto customerDto = accountsService.fetchAccount(mobileNumber);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(customerDto);
    }
}
