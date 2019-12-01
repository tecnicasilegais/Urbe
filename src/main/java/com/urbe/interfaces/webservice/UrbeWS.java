package com.urbe.interfaces.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.urbe"})
public class UrbeWS
{
	public static void main(String[] args)
	{
		SpringApplication.run(UrbeWS.class, args);
	}
}
