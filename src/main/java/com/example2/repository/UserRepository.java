package com.example2.repository;

import com.example2.entity.Authorities;
import com.example2.entity.User;
import org.springframework.stereotype.Repository;
import java.util.Arrays;
import java.util.List;

@Repository
public class UserRepository {

    // simple repository
    public List<Authorities> getUserAuthorities(User user) {
        if (userValid(user)) return Arrays.asList(Authorities.READ,Authorities.WRITE);
        return null;
    }

    // simple validation
    public boolean userValid (User user) {
        return "Ivan".equals(user.getName()) && "12345".equals(user.getPassword());
    }
}