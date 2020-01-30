package com.joseluisestevez.msa.users;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.joseluisestevez.msa.users.models.entity.Role;
import com.joseluisestevez.msa.users.models.entity.User;

@EntityScan({"com.joseluisestevez.msa.users"})
@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {
	@Override
	public void configureRepositoryRestConfiguration(
			RepositoryRestConfiguration config) {
		config.exposeIdsFor(User.class, Role.class);
	}
}
