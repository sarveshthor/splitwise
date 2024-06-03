package dev.sarvesh.Splitwise.mapper;

import dev.sarvesh.Splitwise.dto.UserLoginResponseDTO;
import dev.sarvesh.Splitwise.entity.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntityToDTO {

    public static UserLoginResponseDTO convertUserToLoginResponseDTO(User user){
        UserLoginResponseDTO userLoginResponseDTO = new UserLoginResponseDTO();
        userLoginResponseDTO.setId(user.getId());
        userLoginResponseDTO.setName(user.getName());
        userLoginResponseDTO.setEmail(user.getEmail());
        return userLoginResponseDTO;
    }
}
