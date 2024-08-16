package com.codingshuttle.week1.Introductiontospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication							// This is the starting point of a springboot application, Only one annotation of this type should be present for an application.
public class IntroductiontospringApplication implements CommandLineRunner { 
									// When we implement CommandLineRunner SpringBoot automatically calls overriden run() method
									// Order of Execution in Main method -> run method in main (Starts SpringBoot application) -> run method()

	@Autowired
	CakeBaker Cake;
	public static void main(String[] args) {

		SpringApplication.run(IntroductiontospringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		Cake.bakeCake();
	}

}
