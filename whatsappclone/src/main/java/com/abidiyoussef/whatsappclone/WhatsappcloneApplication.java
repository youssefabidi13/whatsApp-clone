package com.abidiyoussef.whatsappclone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class WhatsappcloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhatsappcloneApplication.class, args);
	}

}
