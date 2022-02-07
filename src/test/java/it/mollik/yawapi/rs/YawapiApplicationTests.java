package it.mollik.yawapi.rs;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.ActiveProfiles;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ActiveProfiles(value = "test")
public class YawapiApplicationTests {

	@Value("${yawapi.basic.auth.user:admin}")
	private String userName;
	
	@Value("${yawapi.basic.auth.password:12345678}")
	private String password;

	@Test
	public void contextLoads() {
		
	}

	@Autowired
	private TestRestTemplate restTemplate;


	@Test
	public void homeResponse() {
		String body = this.restTemplate.withBasicAuth(this.userName, this.password).getForObject("/", String.class);
		assertThat(body).isEqualTo("Spring is here!");
	}

	
}
