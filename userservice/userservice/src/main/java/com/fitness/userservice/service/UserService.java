package com.fitness.userservice.service;


import com.fitness.userservice.dto.RegisterRequest;
import com.fitness.userservice.dto.UserResponse;
import com.fitness.userservice.model.User;
import com.fitness.userservice.repositry.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
@Autowired
private UserRepository repository;
    public UserResponse register( RegisterRequest request) {
//        if (repository.existByEmail(request.getEmail())){
//            throw  new RuntimeException("Email alredy exist");
//        }

        User user =new User();
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());

            User saveUser=repository.save(user);
            UserResponse userResponse=new UserResponse();
            userResponse.setId(saveUser.getId());
            userResponse.setPassword(saveUser.getPassword());
            userResponse.getEmail(saveUser.getEmail());
            userResponse.getFirstName(saveUser.getFirstName());
            userResponse.getLastName(saveUser.getLastName());
            userResponse.getCreatedAt(saveUser.getCreatedAt());
            userResponse.getUpdateDat(saveUser.getUpdatedAt());

            return userResponse;


    }

    public UserResponse getUserProfile(String userId) {

        User user=repository.findById(userId)
                .orElseThrow(()-> new  RuntimeException("User is not exist"));


        User saveUser=repository.save(user);
        UserResponse userResponse=new UserResponse();
        userResponse.setId(user.getId());
        userResponse.setPassword(user.getPassword());
        userResponse.getEmail(user.getEmail());
        userResponse.getFirstName(user.getFirstName());
        userResponse.getLastName(user.getLastName());
        userResponse.getCreatedAt(user.getCreatedAt());
        userResponse.getUpdateDat(user.getUpdatedAt());

        return  userResponse;
    }
}
