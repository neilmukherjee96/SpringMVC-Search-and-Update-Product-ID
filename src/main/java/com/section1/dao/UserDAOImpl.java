package com.section1.dao;

import java.util.List;

import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.section1.model.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	EntityManager sf;

	public void addUser(User user) {
		sf.persist(user);

	}

	

	public List<User> getAllUsers() {

		@SuppressWarnings("unchecked")
		List<User> users = sf.createQuery("from User").getResultList();
		return users;
	}

	public void deleteUser(Integer id) {
		User user = getUserById(id);
		sf.remove(user);

	}

	public User getUserById(Integer id) {
		return sf.find(User.class, id);

	}

	@Transactional
	public void change(User user) {
		sf.persist(user);
	}

}
