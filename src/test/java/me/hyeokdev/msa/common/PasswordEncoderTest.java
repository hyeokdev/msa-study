package me.hyeokdev.msa.common;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

class PasswordEncoderTest {

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Test
	void test() {
		System.out.println(passwordEncoder().encode("password"));
	}

}
