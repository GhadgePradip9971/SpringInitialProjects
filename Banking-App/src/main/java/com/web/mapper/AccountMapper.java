package com.web.mapper;

import com.web.dto.AccountDto;
import com.web.entity.Account;

public class AccountMapper {

	
	public static Account mapToAccount(AccountDto accountDto) {
		
		Account account=new Account(
				accountDto.getId(),
				accountDto.getAccountHolderName(),
				accountDto.getBalance()
				);
		return account;
		
		
	}
	public static AccountDto mapToAccountDto(Account account) {
		AccountDto accountDto=new AccountDto(
				account.getId(),
				account.getAccountHolderName(),
				account.getBalance());
		return accountDto;
	}
	
	
	
}
