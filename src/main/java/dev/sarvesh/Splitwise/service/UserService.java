package dev.sarvesh.Splitwise.service;

import dev.sarvesh.Splitwise.dto.UserRegistrationDTO;
import dev.sarvesh.Splitwise.entity.User;

public interface UserService {

    User signUp(String name, String email, String password);
}
