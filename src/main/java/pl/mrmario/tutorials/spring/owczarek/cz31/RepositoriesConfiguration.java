package pl.mrmario.tutorials.spring.owczarek.cz31;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.mrmario.tutorials.spring.owczarek.cz31.api.Logger;
import pl.mrmario.tutorials.spring.owczarek.cz31.api.UsersRepository;
import pl.mrmario.tutorials.spring.owczarek.cz31.implementations.UsersRepositoryImpl;

@Configuration
public class RepositoriesConfiguration {
	
	@Autowired
	private Logger logger;
	
	@Bean
	public UsersRepository usersRepository() {
		UsersRepositoryImpl usersRepositoryImpl = new UsersRepositoryImpl();
		usersRepositoryImpl.setLogger(logger);
		return usersRepositoryImpl;
			

	}
}
