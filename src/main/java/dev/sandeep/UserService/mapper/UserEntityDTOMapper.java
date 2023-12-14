package dev.sandeep.UserService.mapper;

import dev.sandeep.UserService.dto.UserDto;
import dev.sandeep.UserService.model.User;

public class UserEntityDTOMapper {
    public static UserDto getUserDTOFromUserEntity(User user){
        UserDto userDto = new UserDto();
        userDto.setEmail(user.getEmail());
        userDto.setRoles(user.getRoles());
        return userDto;
    }
}
