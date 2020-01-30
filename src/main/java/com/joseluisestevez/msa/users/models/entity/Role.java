package com.joseluisestevez.msa.users.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role implements Serializable {

	private static final long serialVersionUID = -5865792011511552261L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true, length = 30)
	private String name;

	// Relacion bidireccional, un ejemplo
	// @ManyToMany(fetch = FetchType.LAZY, mappedBy = "roles")
	// private Set<User> users;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// public Set<User> getUsers() {
	// return users;
	// }
	//
	// public void setUsers(Set<User> users) {
	// this.users = users;
	// }

}
