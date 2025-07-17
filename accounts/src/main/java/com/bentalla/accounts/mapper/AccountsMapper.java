package com.bentalla.accounts.mapper;

import com.bentalla.accounts.dto.AccountsDto;
import com.bentalla.accounts.entity.Accounts;

public class AccountsMapper {

    public static AccountsDto toAccountsDto(Accounts accounts , AccountsDto accountsDto) {
        accountsDto.setAccountNumber(accounts.getAccountNumber());
        accountsDto.setAccountType(accounts.getAccountType());
        accountsDto.setBranchAddress(accounts.getBranchAddress());
        return accountsDto;
    }

    public static Accounts toAccounts(AccountsDto accountsDto , Accounts accounts) {

       accounts.setAccountNumber(accountsDto.getAccountNumber());
       accounts.setAccountType(accountsDto.getAccountType());
       accounts.setBranchAddress(accountsDto.getBranchAddress());
       return accounts;
    }

}
