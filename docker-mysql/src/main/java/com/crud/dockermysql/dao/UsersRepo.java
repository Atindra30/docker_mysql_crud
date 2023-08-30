package com.crud.dockermysql.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.dockermysql.model.Users;

public interface UsersRepo extends JpaRepository<Users, Integer>{
	
	
	

}
