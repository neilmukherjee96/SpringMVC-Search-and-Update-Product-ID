package com.section1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.section1.dao.UserDAO;
import com.section1.model.User;
@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDao;
	@Override

	public void addUser(User user) {
		// TODO Auto-generated method stub
		 userDao.addUser(user);
		
		
	}

	@Override

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userDao.getAllUsers();
	}

	
	@Override

	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		userDao.deleteUser(id);
		
	}

	@Override
	public User getUserById(Integer id) {
		// TODO Auto-generated method stub
		return userDao.getUserById(id);
	}

	@Override
	public void change(User user) {
		// TODO Auto-generated method stub
		userDao.change(user);
		
	}

}
