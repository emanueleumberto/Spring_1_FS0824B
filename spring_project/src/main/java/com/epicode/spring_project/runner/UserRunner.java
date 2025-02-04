package com.epicode.spring_project.runner;

import com.epicode.spring_project.model.User;
import com.epicode.spring_project.service.UserService;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRunner implements CommandLineRunner {

    List<User> userList = new ArrayList<User>();

    // Dipendency Injection su Field - Proprietà
    @Autowired private UserService userService;
    /*private UserService userService;

    // Dipendency Injection su Costruttore
    @Autowired
    public UserRunner(UserService userService) {
        this.userService = userService;
    }*/

    // Dipendency Injection su Setter
    /*@Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }*/

    @Override
    public void run(String... args) throws Exception {
        System.out.println("UserRunner...");

        User userAdmin = userService.createAdminUser();
        //System.out.println(userAdmin);
        userList.add(userAdmin);

        for(int i=0; i<10; i++) {
            User fakeUser = userService.createFakeUser();
            //System.out.println(fakeUser);
            userList.add(fakeUser);
        }

        User customUser = userService.createCustomUser();
        customUser.setName("Francesca");
        customUser.setLastname("Neri");
        customUser.setAge(20);
        //System.out.println(customUser);
        userList.add(customUser);

        User customUserBuilder = userService.createCustomUser().builder().name("Mario").lastname("Rossi").age(55).build();
        //System.out.println(customUserBuilder);
        userList.add(customUserBuilder);

        userList.forEach(System.out::println);


    }
}
