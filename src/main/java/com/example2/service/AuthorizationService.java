package com.example2.service;

import com.example2.entity.Authorities;
import com.example2.entity.User;
import com.example2.exceptions.InvalidCredentials;
import com.example2.exceptions.UnauthorizedUser;
import com.example2.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorizationService {
    UserRepository userRepository;

    public AuthorizationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Authorities> getAuthorities(User user) {
        if (isEmpty(user.getName()) || isEmpty(user.getPassword())) throw new InvalidCredentials("Username or password is empty");

        List<Authorities> userAuthorities = userRepository.getUserAuthorities(user);

        if (isEmpty(userAuthorities)) throw new UnauthorizedUser("Unknown user " + user.getName());

        return userAuthorities;
    }

    boolean isEmpty (String str) {
        return str == null || str.isEmpty();
    }
    boolean isEmpty (List<?> obj) {
        return obj == null || obj.isEmpty();
    }
}
