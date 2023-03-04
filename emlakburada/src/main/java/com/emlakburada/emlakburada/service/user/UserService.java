package com.emlakburada.emlakburada.service.user;

import com.emlakburada.emlakburada.model.request.UserRequest;
import com.emlakburada.emlakburada.model.response.UserResponse;

import java.util.List;

public interface UserService {
    List<UserResponse> getAll();
    UserResponse getUserById(Integer id);
    UserResponse add(UserRequest userRequest);
    UserResponse update(UserRequest userRequest);
    void deleteById(Integer id);
}