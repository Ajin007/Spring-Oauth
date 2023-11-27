package com.SpringOauth.SpringOauth17java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.tags.Tag;

/*
 * @author AjinRoch
 * 
 */
@Tag(name="Initial call of the project",description = "Here it is the starting file of this project")
@SpringBootApplication
public class SpringOauth17javaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringOauth17javaApplication.class, args);
	}

}
