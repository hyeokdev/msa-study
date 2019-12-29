package me.hyeokdev.msa.accounts.service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import me.hyeokdev.msa.accounts.model.Account;
import me.hyeokdev.msa.accounts.model.AccountRole;
import me.hyeokdev.msa.accounts.repository.AccountRepository;

@Service
public class AccountService implements UserDetailsService {
	
	@Autowired
	AccountRepository accountRepository;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	public List<Account> getList() {
		return accountRepository.findAll();
	}
	
	public Account join(Account account) {
		account.setPassword(passwordEncoder.encode(account.getPassword()));
		account.setRoles(Collections.singleton(AccountRole.USER));
		return accountRepository.save(account);
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Account account = accountRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException(username));
		return new User(account.getUsername(), account.getPassword(), authorities(account.getRoles()));
	}
	
	public Collection<? extends GrantedAuthority> authorities(Set<AccountRole> roles) {
		return roles.stream()
				.map(role -> new SimpleGrantedAuthority("ROLE_"+role.name()))
				.collect(Collectors.toSet());
	}

}
