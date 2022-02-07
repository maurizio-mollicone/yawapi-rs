package it.mollik.yawapi.rs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class YawapiApplication {

	private static final Logger LOG = LoggerFactory.getLogger(YawapiApplication.class);


	@GetMapping("/")
	public String home() {
		LOG.info("Spring is here");
		return "Spring is here!";
	}

	
	public static void main(String[] args) {
		SpringApplication.run(YawapiApplication.class, args);
	}
}