package com.epicode.spring_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProjectApplication {

		public static void main(String[] args) {

			SpringApplication.run(SpringProjectApplication.class, args);
		System.out.println("Run...");

		/*AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(UserConfiguration.class);
		User u = (User) appContext.getBean("AdminUserBean");
		System.out.println(u);
		appContext.close();*/


	}

}
