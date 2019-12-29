package me.hyeokdev.msa.accounts.controller;

import javax.validation.Valid;

import org.hibernate.hql.internal.ast.DetailedSemanticException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.hyeokdev.msa.accounts.model.Account;
import me.hyeokdev.msa.accounts.service.AccountService;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@GetMapping
	public ResponseEntity list() {
		return ResponseEntity.ok(accountService.getList());
	}
	
	@PostMapping
	public ResponseEntity join(@RequestBody Account account) {
		accountService.join(account);
		return ResponseEntity.ok(account);
	}
	
	/*
	@PutMapping("/{id}")
	public ResponseEntity update(@PathVariable String id, @RequestBody @Valid Account account) {
		return accountService.update(account);
	}
	*/
}
