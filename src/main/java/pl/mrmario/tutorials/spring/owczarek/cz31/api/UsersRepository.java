package pl.mrmario.tutorials.spring.owczarek.cz31.api;

import pl.mrmario.tutorials.spring.owczarek.cz31.domain.User;

public interface UsersRepository {
	User createUser(String name);
	void setLogger(Logger logger);
}
