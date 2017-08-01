package com.turreta.springboot.springdata.sp;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer>
{
	@Procedure
	void addPerson(String name);
}
