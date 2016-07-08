package com.tustanovskyy;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.tustanovskyy.entity.Location;
import com.tustanovskyy.entity.Post;
import com.tustanovskyy.entity.User;
import com.tustanovskyy.repository.PostRepository;
import com.tustanovskyy.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
@Slf4j
public class PicGoApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired PostRepository postRepository;

	public static void main(String[] args) throws Exception{
		ApplicationContext ctx = SpringApplication.run(PicGoApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {




		User user = new User();
		user.setEmail("email1");
		user.setFirstName("firstName");
		user.setLastName("lastName");
		Post post = new Post();
		double position[] = {12, 12};
		Location location = new Location();
		location.setPosition(position);
		post.setLocation(location);
		post.setText("asdasdas");
		post.setAuthor(user);
		// save a couple of customers
		postRepository.save(post);


		// fetch all customers
		log.info("Customers found with findAll():");
		log.info("-------------------------------");
		for (User user1 : userRepository.findAll()) {
			log.info(user1.toString());
		}
		System.out.println();



	}

}
