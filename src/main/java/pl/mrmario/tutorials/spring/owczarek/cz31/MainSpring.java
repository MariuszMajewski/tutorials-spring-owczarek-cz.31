package pl.mrmario.tutorials.spring.owczarek.cz31;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pl.mrmario.tutorials.spring.owczarek.cz31.api.UsersRepository;
import pl.mrmario.tutorials.spring.owczarek.cz31.domain.User;

/**
 * @author Artur Owczarek
 * 	MrMario108
 */
public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(LoggersConfiguration.class, RepositoriesConfiguration.class);

		UsersRepository userRep = context.getBean("usersRepository", UsersRepository.class);
		User janek = userRep.createUser("MrMario108");
	}
}