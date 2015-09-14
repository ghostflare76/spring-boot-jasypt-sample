package demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@Configuration
@EnableEncryptableProperties
public class AppProperties {

	@Configuration
	@Profile({"opdev"})
	@PropertySource({"classpath:environment/user_opdev.properties"})
	static class profileOpdevPropertyConfig {
	}

	@Configuration
	@Profile({"oplive"})
	@PropertySource({"classpath:environment/user_oplive.properties"})
	static class profileOpLocalPropertyConfig {
	}

}
