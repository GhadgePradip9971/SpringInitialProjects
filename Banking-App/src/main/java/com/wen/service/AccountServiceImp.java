package com.wen.service;

import org.springframework.stereotype.Service;

import com.web.dto.AccountDto;
import com.web.entity.Account;
import com.web.mapper.AccountMapper;
import com.web.repository.IAccountRepository;
@Service
public class AccountServiceImp implements IAccountService {
	
private IAccountRepository  accountRepo;


	public AccountServiceImp(IAccountRepository accountRepo) {
	
	this.accountRepo = accountRepo;
}

	@Override
	public AccountDto createAccount(AccountDto account) {
Account account=AccountMapper.mapToAccount(AccountDto);
Account savedAccount=accountRepo.save(account);
return AccountMapper.mapToAccountDto(savedAccount);
	}

}
