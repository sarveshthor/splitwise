package dev.sarvesh.Splitwise.service;

import dev.sarvesh.Splitwise.entity.User;
import dev.sarvesh.Splitwise.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Override
    public User signUp(String name, String email, String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        User user = new User();
        user.setEmail(email);
        user.setName(name);
        user.setPassword(encoder.encode(password));
        return userRepository.save(user);
    }
}
