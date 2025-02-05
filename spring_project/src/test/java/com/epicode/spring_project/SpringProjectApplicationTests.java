package com.epicode.spring_project;

import com.epicode.spring_project.model.User;
import com.epicode.spring_project.service.UserService;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
class SpringProjectApplicationTests {

	@Autowired SpringProjectApplication app;
	@Autowired private UserService userService;
	private User user;

	@BeforeAll
    static void beforeTest() {
		System.out.println("BeforeAll");
	}

	@AfterAll
	static void afterTest() {
		System.out.println("AfterAll");
	}

	@BeforeEach
	void initUser() {
		System.out.println("BeforeEach");
		user = userService.createCustomUser();
		user.setName("Mario");
		user.setLastname("Rossi");
		user.setAge(55);
	}

	@AfterEach
	void clearUser() {
		System.out.println("AfterEach");
		user = null;
	}

	@Test
	@Disabled
	void userTestAge() {
		assertEquals(55, user.getAge());
	}

	@Test
	void userTestName() {
		assertEquals("Mario", user.getName());
	}

	@Test
	void userTestLastname() {
		assertEquals("Rossi", user.getLastname());
	}

	@Test
	void contextLoads() {
		// Verifico che l'applicazione è avviata
		assertThat(app).isNotNull();
	}

	@Test
	void myTest() {
		assert true;
	}

	@Test
	void adminTest() {
		User admin = userService.createAdminUser();
		assertEquals("Giuseppe", admin.getName());
	}

	@ParameterizedTest
	@CsvSource({"20, Mario", "40, Giuseppe", "60, Antonio"})
	void fakeUserTest(int age, String name) {
		User user = userService.createFakeUser();
		assertTrue(user.getAge()>age);
	}



}
