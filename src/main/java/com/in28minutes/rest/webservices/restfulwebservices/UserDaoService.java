package com.in28minutes.rest.webservices.restfulwebservices;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    static int count=0;

    static{
        users.add(new User("Sergio", LocalDate.now().minusYears(26),++count));
        users.add(new User("Kevin", LocalDate.now().minusYears(27),++count));
        users.add(new User("Manuel", LocalDate.now().minusYears(15),++count));
    }
    public List<User> retrieveAllUsers(){
        return users;
    }

    public User retrieveOneUser(int id){

        List<User> userRetrieved = new ArrayList<>();
            for (User user : users) {
                if (user.getId() == id) {
                    userRetrieved.add(user);
                }

            }
        return userRetrieved.get(0);
    }

    public User saveUser(User user){

        user.setId(++count);
        users.add(user);
        return user;
    }

    public void deleteOneUser(int id){

        for (User user : users) {
            if (user.getId() == id) {
                users.remove(id);
            }
        }

    }

}
