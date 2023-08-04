package com.example.demo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		User douglas = new User("1", "Douglas Machado", "douglas@hotmail.com");
		User junior = new User("2", "Junior Santos", "junior@hotmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(douglas, junior));
		return ResponseEntity.ok().body(list);
	}
}
