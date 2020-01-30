package com.joseluisestevez.msa.users.models.entity.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.joseluisestevez.msa.users.models.entity.User;

public interface UserDao extends PagingAndSortingRepository<User, Long> {

	// https://docs.spring.io/spring-data/jpa/docs/2.2.4.RELEASE/reference/html/#jpa.query-methods
	// see Table 3. Supported keywords inside method names Keyword Sample
	User findByUsername(@Param("username") String username);

	User findByUsernameAndEmail(@Param("username") String username,
			@Param("email") String email);

	// https://docs.spring.io/spring-data/jpa/docs/2.2.4.RELEASE/reference/html/#jpa.query-methods.at-query
	@Query("select u from User u where u.username=?1")
	User searchByCustomQuery(String username);

	@Query(value = "SELECT * FROM USERS WHERE USERNAME = ?1", nativeQuery = true)
	User searchByNativeQuery(String username);
}
