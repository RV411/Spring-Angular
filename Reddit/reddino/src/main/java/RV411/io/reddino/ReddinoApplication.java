package RV411.io.reddino;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class ReddinoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReddinoApplication.class, args);
	}

}
