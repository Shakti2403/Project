package com.mindgate.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HrmsPortalApplication {

	public static void main(String[] args)
	{
		System.out.println("HRMS deployed Successfully");
		SpringApplication.run(HrmsPortalApplication.class, args);
	}

}
