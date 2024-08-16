package com.codingshuttle.week1.Introductiontospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductiontospringApplication implements CommandLineRunner {

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
