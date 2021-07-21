package com.example.rest.basics.Restfulwebservices.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserDAOService {
    public static List<User> userArrayList = new ArrayList<>();
    private int usercount=2;
    static {

        userArrayList.add(new User(1,"yasho"));
        userArrayList.add(new User(2,"Lalit"));


    }
    public List<User> GetAll() {
        System.out.println("Got Successfully");
        return userArrayList;
    }

    public User Save(User user) {
        if(user.getId()==null){
            user.setId(++usercount);
        }
        userArrayList.add(user);
        return user;
    }


    public User findOne(int id) {
        for (User user : userArrayList) {
            if (user.getId() == id) {
                return user;
            }
        }

        return null;
    }

}
