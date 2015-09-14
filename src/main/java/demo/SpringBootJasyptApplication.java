package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication

public class SpringBootJasyptApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJasyptApplication.class, args);
    }
}
