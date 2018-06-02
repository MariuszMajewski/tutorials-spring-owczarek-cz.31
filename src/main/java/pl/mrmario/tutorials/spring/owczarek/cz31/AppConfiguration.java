package pl.mrmario.tutorials.spring.owczarek.cz31;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import pl.mrmario.tutorials.spring.owczarek.cz31.api.Logger;
import pl.mrmario.tutorials.spring.owczarek.cz31.api.UsersRepository;
import pl.mrmario.tutorials.spring.owczarek.cz31.implementations.DateLogger;
import pl.mrmario.tutorials.spring.owczarek.cz31.implementations.UsersRepositoryImpl;

@Configuration
@Import({LoggersConfiguration.class, RepositoriesConfiguration.class})
public class AppConfiguration {


}
