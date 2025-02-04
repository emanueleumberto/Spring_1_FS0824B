package com.epicode.spring_project.service;

import com.epicode.spring_project.model.User;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired @Qualifier("AdminUserBean") ObjectProvider<User> userAdminProvider;
    @Autowired @Qualifier("FakeUserBean") ObjectProvider<User> userFakeProvider;
    @Autowired @Qualifier("CustomUserBean") ObjectProvider<User> userCustomProvider;

    public User createAdminUser() {
        return userAdminProvider.getObject();
    }

    public User createFakeUser() {
        return userFakeProvider.getObject();
    }

    public User createCustomUser() {
        return userCustomProvider.getObject();
    }

}
