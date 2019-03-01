package dosispi.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * 
 * 
 * @author Meryem
 *
 */


@EntityScan("com")
@EnableJpaRepositories(basePackages="service")
@Configuration
@EnableAutoConfiguration
@ComponentScan({"service","controller"})
@SpringBootApplication

public class SprintV01Application {

	public static void main(String[] args) {
		//Starting the whole SPRING Application: SprintV01Application
		SpringApplication.run(SprintV01Application.class, args);
	}

}
