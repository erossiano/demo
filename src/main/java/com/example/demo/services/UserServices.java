package com.example.demo.services;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserServices {

    private UserRepository userRepository;
    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers(){
        return this.userRepository.findAll();
    }

    public User getUser(Long id){
        Optional<User> user = this.userRepository.findById(id);
        return user.orElse(null);
    }
    public User createUser(User user){
        return this.userRepository.save(user);
    }

    public User updateUser(Long id, User user){
        Optional<User> dbData = this.userRepository.findById(id);

        if(dbData.isPresent()){
            User e = dbData.get();
            e.setEmail(user.getEmail());
            e.setImage(user.getImage());
            e.setOuth0Id(user.getOuth0Id());
            this.userRepository.save(e);
            return e;
        }

        return null;
    }

    public Boolean deleteUser(Long id){
        try{
            this.userRepository.deleteById(id);
            return true;
        }catch (Exception e) {
            return false;
        }
    }

    public User findUserByEmail(String email){
        return this.userRepository.findByEmail(email);
    }
    public User getOrCreateUser(Map<String, Object> userData){
        String email = (String) userData.get("email");

        User user = findUserByEmail(email);
        if(user==null){
            String name = (String) userData.get("name");
            String image = (String) userData.get("picture");
            String outh0Id = (String) userData.get("sub");

            User newUser = new User(email = email, image = image, outh0Id = outh0Id);
            return createUser(newUser);
        }

        return user;
    }



}
