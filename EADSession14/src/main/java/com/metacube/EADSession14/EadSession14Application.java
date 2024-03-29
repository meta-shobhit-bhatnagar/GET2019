package com.metacube.EADSession14;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude=HibernateJpaAutoConfiguration.class)
@EnableJpaRepositories ("com.metacube.EADSession14.repository")
public class EadSession14Application {

	public static void main(String[] args) {
		SpringApplication.run(EadSession14Application.class, args);
	}

}
