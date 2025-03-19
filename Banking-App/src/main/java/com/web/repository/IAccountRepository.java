package com.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.entity.Account;

public interface IAccountRepository extends JpaRepository<Account, Long> {

}
