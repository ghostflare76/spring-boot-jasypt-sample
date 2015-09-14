package demo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import demo.SpringBootJasyptApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBootJasyptApplication.class)
@ActiveProfiles({"opdev"})
public class UserServiceTest {

	@Autowired
	private UserService userService;

	@Test
	public void testGetUser() {
		System.out.println(userService.getUser());
	}
}
