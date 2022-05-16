package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Address;
import com.example.demo.entity.City;
import com.example.demo.entity.User;
import com.example.demo.repos.AddressRepository;
import com.example.demo.services.AddressService;

@SpringBootApplication
public class SpringJpaEntityGraphApplication {

	public static void main(String[] args) {
		  ConfigurableApplicationContext  ctx = 
				  SpringApplication.run(SpringJpaEntityGraphApplication.class, args);
		  
		  AddressService service = ctx.getBean(AddressService.class);
		 // service.task1();
		  //service.task2();
		  service.task3();
		  
		  ctx.close();
	}

	@Bean
	public CommandLineRunner runner() {
		return new CommandLineRunner() {
			
			@Autowired
			AddressRepository repo;
			
			@Override
			public void run(String... args) throws Exception {
				City hyderabad = new City(960,"Hyderabad");
				City nampalli = new City (460,"Nampalli");
				
				User priya =  new User(700,"Priya",45678);
				User rusata = new User(701,"rusata",90876);
				
				Address address1 = new Address(101,"Ms.",nampalli,rusata);
				Address address2 = new Address(102,"Dr.",hyderabad,priya);
				
				this.repo.save(address1);
				this.repo.save(address2);
				
				
			}
		};
	}
}
