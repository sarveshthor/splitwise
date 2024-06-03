package dev.sarvesh.Splitwise.controller;

import dev.sarvesh.Splitwise.dto.UserLoginResponseDTO;
import dev.sarvesh.Splitwise.dto.UserRegistrationDTO;
import dev.sarvesh.Splitwise.entity.User;
import dev.sarvesh.Splitwise.exception.InvalidUserRegistrationException;
import dev.sarvesh.Splitwise.mapper.EntityToDTO;
import dev.sarvesh.Splitwise.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController{

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<UserLoginResponseDTO> signUp(@RequestBody UserRegistrationDTO userRegistrationDTO){
        validateUserRegistrationRequestDTO(userRegistrationDTO);
        User savedUser = userService.signUp(userRegistrationDTO.getName(),
                userRegistrationDTO.getEmail(), userRegistrationDTO.getPassword());
        return ResponseEntity.ok(EntityToDTO.convertUserToLoginResponseDTO(savedUser));

    }

    private void validateUserRegistrationRequestDTO(UserRegistrationDTO userRegistrationDTO){
        //also validate if the email is proper
        //add a proper password validation as well(small, caps, digits , special characters, etc.)
        if(userRegistrationDTO.getEmail() == null
        || userRegistrationDTO.getName() == null ||
        userRegistrationDTO.getPassword() == null){
            throw new InvalidUserRegistrationException("User details cannot be null");
        }
    }
}
