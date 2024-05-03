package com.jaoangeloni.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaoangeloni.workshopmongo.domain.Post;
import com.jaoangeloni.workshopmongo.domain.User;
import com.jaoangeloni.workshopmongo.dto.UserDTO;
import com.jaoangeloni.workshopmongo.repository.PostRepository;
import com.jaoangeloni.workshopmongo.repository.UserRepository;
import com.jaoangeloni.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}


}
