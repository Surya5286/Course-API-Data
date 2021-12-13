package com.example.springbootquickstart.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
	
	/* The Framework sees the Embedded Derby Database in the Classpath and assumes that to be the database to connect to.
	 * No Connection information needs to be updated. 
	*/
	
}
