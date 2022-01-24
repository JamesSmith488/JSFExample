package com.sparta.jsfexample.services;

import com.sparta.jsfexample.entities.User;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class UserService {

    @Inject
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String validation() {
        if (user.getName().equals("James") && user.getPassword().equals("1234")) {
            return "welcome";
        }else {
            return "error";
        }
    }

}