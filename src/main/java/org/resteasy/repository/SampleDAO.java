package org.resteasy.repository;

import java.util.List;

import org.resteasy.model.Person;

public interface SampleDAO {
	
	List<Person> getAllPersons();
}
