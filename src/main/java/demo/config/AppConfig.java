package demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import demo.model.User;

@Configuration

public class AppConfig {

	@Autowired
	private Environment environment;

	@Bean
	public User defaultUser() {
		User user = new User();
		user.setUserId(environment.getRequiredProperty("default.user.id"));
		user.setPassword(environment.getRequiredProperty("default.user.password"));
		return user;
	}
}
