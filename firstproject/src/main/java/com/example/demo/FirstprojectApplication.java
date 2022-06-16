package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.User;
import com.example.demo.repo.UserRepository;

@SpringBootApplication
public class FirstprojectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(FirstprojectApplication.class, args);
		UserRepository ur=context.getBean(UserRepository.class);
		
		
	//Insert user to Db	
		
//		User u2=new User();
//		u2.setCity("mumbai");
//		u2.setName("Virat");
//		u2.setStatus("cricketer");
//		
//		User uu=ur.save(u2);
		
		
		
//		Optional<User> u4=ur.findById(2);
//		
//		System.out.println(u4);
//		User u5=u4.get();
//		u5.setCity("Ghazipur");
//		ur.save(u5);
//		
//		ur.deleteById(2); 
//		
//		
		
		User u=ur.getsy("aditya");
//		u.forEach(a->{System.out.println(a);});
//		
		
		System.out.println(u);
		
		
		
	}

}
