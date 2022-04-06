package ua.yaremechko.test.proxyband.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ua.yaremechko.test.proxyband.model.User;
import ua.yaremechko.test.proxyband.repository.UserRepository;

@RestController
public class UserCotroller {

	@Autowired
	private UserRepository repository;
	
	@PostMapping("/addUser")
	public String saveUser(@RequestBody User user) {
		repository.save(user);
		return "Added user with id : " + user.getId();
	}
	
	@GetMapping("/findAllUsers")
	public List<User> getUsers() {
		return repository.findAll();
	}
	
	@PutMapping("/updateUser")
	public String updateUser(@RequestBody User user) {
		repository.save(user);
		return "Updated user with id : " + user.getId();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable int id) {
		repository.deleteById(id);
		return "User deleted with id : " + id;
	}
}
