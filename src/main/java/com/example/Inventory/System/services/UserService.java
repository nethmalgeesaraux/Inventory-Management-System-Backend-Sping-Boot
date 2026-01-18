package com.example.Inventory.System.services;

import com.example.Inventory.System.dtos.LoginRequest;
import com.example.Inventory.System.dtos.RegisterRequest;
import com.example.Inventory.System.dtos.Response;
import com.example.Inventory.System.dtos.UserDTO;
import com.example.Inventory.System.models.User;

public interface UserService {
    Response registerUser(RegisterRequest registerRequest);

    Response loginUser(LoginRequest loginRequest);

    Response getAllUsers();

    User getCurrentLoggedInUser();

    Response getUserById(Long id);

    Response updateUser(Long id, UserDTO userDTO);

    Response deleteUser(Long id);

    Response getUserTransactions(Long id);
}
