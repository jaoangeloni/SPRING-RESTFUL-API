package com.jaoangeloni.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.jaoangeloni.workshopmongo.domain.User;
import com.jaoangeloni.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User gabriel = new User(null, "Gabriel Sales", "gabriel@gmail.com");
		User vini = new User(null, "Vini Bila", "vini@gmail.com");
		User bruna = new User(null, "Bruna Nunes", "bruna@gmail.com");
		
		userRepository.saveAll(Arrays.asList(gabriel, vini, bruna));
	}
	

}
