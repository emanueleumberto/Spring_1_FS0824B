package com.epicode.spring_project.configuration;

import com.epicode.spring_project.model.User;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import java.util.Locale;

@Configuration
@PropertySource("application.properties")
public class UserConfiguration {

    @Value("${user.admin.name}") private String adminName;
    @Value("${user.admin.lastname}") private String adminLastname;
    @Value("${user.admin.age}") private int adminAge;

    @Bean("AdminUserBean")
    @Scope("singleton")
    public User adminUser() {
        return new User(adminName, adminLastname, adminAge);
    }

    @Bean("FakeUserBean")
    @Scope("prototype")
    public User fakeUser() {
        Faker fake = Faker.instance(new Locale("it-IT"));
        User u = new User();
        u.setName(fake.name().firstName());
        u.setLastname(fake.name().lastName());
        u.setAge(fake.number().numberBetween(18, 70));
        return u;
    }

    @Bean("CustomUserBean")
    @Scope("prototype")
    public User customUser() {
        return new User();
    }

}
