package com.example.photo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class PhotoApplication implements CommandLineRunner {

	@Autowired
	PhotoRepository photoRepository;
	
	/*@GetMapping(value="/")
	public String myMethod() {
		return "<h1>Welcome to Full stack Development </h1>";
	}*/
	
	public static void main(String[] args) {
		SpringApplication.run(PhotoApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		User u1 = new User("1","Ramesh Muthusamy","rameshsoft1@gmail.com");
		User u2 = new User("2","Senthil","rameshsoft2@gmail.com");
		User u3 = new User("3","Vinoth","rameshsoft3@gmail.com");
		
		 
		photoRepository.save(u1);
		photoRepository.save(u2);
		photoRepository.save(u3);
		
		
		List<User> users = photoRepository.findAll();
		
		System.out.println("********************");
		
		for(User u:users) {
			System.out.println(u);
		}
		
		
		
	}

	

}
