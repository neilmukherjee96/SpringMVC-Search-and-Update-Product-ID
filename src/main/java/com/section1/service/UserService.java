package com.section1.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.section1.model.User;




public interface UserService {
	public void addUser(User user);
	public List<User> getAllUsers();
	public void change(User user);
	public void deleteUser(Integer id);
	public User getUserById(Integer id);
	

}
