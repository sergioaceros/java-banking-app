package com.sergio.banking_app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergio.banking_app.Entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
