package demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import demo.model.User;

@Component
public class UserService {

	@Autowired
	private User user;


	public User getUser() {
		return user;
	}
}
