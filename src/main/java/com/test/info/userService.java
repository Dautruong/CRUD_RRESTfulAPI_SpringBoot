package com.test.info;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

@Transactional
public class UserService {
	@Autowired
	private UserRepository userRepo;
	 public List<User> listAll() {
	        return userRepo.findAll();
	    }
	     
	    public void save(User user) {
	    	userRepo.save(user);
	    }
	    
	    public User get(Integer id) {
	        return userRepo.findById(id).get();
	    }
	     
	    public void delete(Integer id) {
	    	userRepo.deleteById(id);
	    }
}
