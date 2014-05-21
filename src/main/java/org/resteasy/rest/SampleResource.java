package org.resteasy.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.resteasy.model.Person;
import org.resteasy.repository.SampleDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

//@Produces
@Service
@Path("/person")
@Api(value="/person",description="person api")
public class SampleResource {
	
	@Autowired
	private SampleDAO sampleDAO;
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value="message print",response=Person.class)
	public List<Person> printPerson() {
		return sampleDAO.getAllPersons();
	}

}
