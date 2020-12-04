package com.example2.converter;

import com.example2.entity.User;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import java.util.Map;

@Component
public class QuerryParamsToUserConverter implements Converter<Map<String,String>, User> {
    private final String NAME = "name";
    private final String PASSWORD = "password";

    @Override
    public User convert(Map<String,String> source) {
        return new User(source.get(NAME),source.get(PASSWORD));
    }
}
