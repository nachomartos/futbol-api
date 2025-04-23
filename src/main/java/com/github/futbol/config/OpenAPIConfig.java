package com.github.futbol.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI().info(new Info().title("Futbol API").version("1.0.0")
				.description("API REST para gestionar equipos de futbol")
				.contact(new Contact().name("Juan Perez").email("jperez@example.com")
						.url("https://github.com/nachomartos/futbol-api"))
				.license(new License().name("MIT License").url("https://opensource.org/licenses/MIT")));
	}
}