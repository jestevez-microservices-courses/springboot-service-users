package com.joseluisestevez.msa.users.models.entity.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.joseluisestevez.msa.users.models.entity.User;

@RepositoryRestResource(path = "users")
public interface UserDao extends PagingAndSortingRepository<User, Long> {

	// https://docs.spring.io/spring-data/jpa/docs/2.2.4.RELEASE/reference/html/#jpa.query-methods
	// see Table 3. Supported keywords inside method names Keyword Sample
	// Por defecto seria /users/search/findByUsername?username=user_one
	// cambiado a /users/search/find-username?username=user_one
	@RestResource(path = "find-username")
	User findByUsername(@Param("username") String username);

	User findByUsernameAndEmail(@Param("username") String username,
			@Param("email") String email);

	// https://docs.spring.io/spring-data/jpa/docs/2.2.4.RELEASE/reference/html/#jpa.query-methods.at-query
	@Query("select u from User u where u.username=?1")
	User searchByCustomQuery(String username);

	@Query(value = "SELECT * FROM USERS WHERE USERNAME = ?1", nativeQuery = true)
	User searchByNativeQuery(String username);
}
