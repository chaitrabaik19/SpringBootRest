package com.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeopleController {

	@Autowired
	PeopleRepository repo;

	/* including CORS to enable the headers from other origin */
	@CrossOrigin(origins = "*")

	/* Using GET mapping for finding all records */
	@GetMapping("app/people")
	public List<People> getPeopleRecord() {

		List<People> PeopleList = new ArrayList<>();
		PeopleList = (List<People>) repo.findAll();
		return PeopleList;
	}

	// Using GET mapping for fetching a single record
	@GetMapping("app/people/{user_id}")
	public Optional<People> getPeopleRecord(@PathVariable int user_id) {
		Optional<People> p = null;
		if (user_id != 0) {
			p = repo.findById(user_id);
		}
		return p;
	}

	// Using POST mapping for creating a new record
	@PostMapping("app/people")
	public People addRecord(People p) {
		if (p != null) {
			repo.save(p);
		}
		return p;

	}

	/*
	 * Using DELETE maaping for delete a record from datastore, end point will be
	 * (https.../people/{id})
	 */
	@DeleteMapping("app/people/{user_id}")
	public Optional<People> deleteRecord(@PathVariable int user_id) {
		Optional<People> p = repo.findById(user_id);
		repo.deleteById(user_id);
		return p;
	}
	
	/* Using PUT mapping for update the particular record */	
	@PutMapping("app/people")
   public People updateRecord(People record) {
		if(record!=null)
		 repo.save(record);
		return record;
	}
	

}
