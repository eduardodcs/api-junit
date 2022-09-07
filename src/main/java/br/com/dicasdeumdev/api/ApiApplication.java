package br.com.dicasdeumdev.api;

import br.com.dicasdeumdev.api.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);

		User user = new User(1, "Eduardo", "eduardo@gmail.com", "123123");
		System.out.println(user);
	}

}
