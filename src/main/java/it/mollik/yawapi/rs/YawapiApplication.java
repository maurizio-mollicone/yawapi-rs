package it.mollik.yawapi.rs;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class YawapiApplication {

	@GetMapping("/")
	String home() {
		return "Spring is here!";
	}

	public static void main(String[] args) {
		SpringApplication.run(YawapiApplication.class, args);
	}
}