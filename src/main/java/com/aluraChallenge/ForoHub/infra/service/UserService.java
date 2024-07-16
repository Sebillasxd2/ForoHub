package com.aluraChallenge.ForoHub.infra.service;


import com.aluraChallenge.ForoHub.domain.user.UserAddDTO;
import com.aluraChallenge.ForoHub.domain.user.UserDTO;
import com.aluraChallenge.ForoHub.domain.user.UserUpdatePasswordDTO;

public interface UserService {
    UserDTO getUser(Long id);
    UserDTO createUser(UserAddDTO userAddDTO);
    UserDTO updatePassword(UserUpdatePasswordDTO userUpdatePasswordDTO);
    void deleteUser(Long id);
}
