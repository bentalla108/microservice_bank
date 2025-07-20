package com.bentalla.cards;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Card microservice REST API Documentation",
				description = "Bank Card microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Mor Talla Mbaye (Bentalla)",
						email = "tallambaye108@gmail.com",
						url = "https://www.bentalla.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.bentalla.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description =  "Bank Card microservice REST API Documentation",
				url = "https://www.bentalla.com/swagger-ui.html"
		)
)
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}

}
