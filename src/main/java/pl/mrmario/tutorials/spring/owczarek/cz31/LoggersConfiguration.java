package pl.mrmario.tutorials.spring.owczarek.cz31;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import pl.mrmario.tutorials.spring.owczarek.cz31.api.Logger;
import pl.mrmario.tutorials.spring.owczarek.cz31.implementations.DateLogger;

@Configuration
public class LoggersConfiguration {
	@Bean
	@Scope("singleton")
	public Logger logger() {
		return new DateLogger();
	}
}
