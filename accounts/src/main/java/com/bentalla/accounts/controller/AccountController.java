package com.bentalla.accounts.controller;

import com.bentalla.accounts.constants.AccountsConstants;
import com.bentalla.accounts.dto.CustomerDto;
import com.bentalla.accounts.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(path = "/api/account" , produces = {MediaType.APPLICATION_JSON_VALUE})
public class AccountController {
    @PostMapping("create")
    public ResponseEntity<ResponseDto>createAccount(@RequestBody CustomerDto customerDto) {
  return ResponseEntity.
                status(HttpStatus.CREATED).body(new ResponseDto(
                  AccountsConstants.STATUS_201,
                  AccountsConstants.MESSAGE_201
          ));
    }
}
