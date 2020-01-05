package me.hyeokdev.msa.accounts.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import me.hyeokdev.msa.accounts.model.Account;

public interface AccountRepository extends JpaRepository<Account, String>{

	Optional<Account> findByUsername(String username);

}
