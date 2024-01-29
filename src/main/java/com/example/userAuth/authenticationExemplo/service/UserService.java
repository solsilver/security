package com.example.userAuth.authenticationExemplo.service;

import com.example.userAuth.authenticationExemplo.model.User;
import com.example.userAuth.authenticationExemplo.model.dto.UserInputDTO;
import com.example.userAuth.authenticationExemplo.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;
    public User saveuser(UserInputDTO userInputDTO) {
        User user = modelMapper.map(userInputDTO, User.class);
        userRepository.save(user);
        return user;
    }
}
