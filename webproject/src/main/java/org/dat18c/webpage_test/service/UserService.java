package org.dat18c.webpage_test.service;

import java.util.List;
import java.util.Optional;

import org.dat18c.webpage_test.model.User;
import org.dat18c.webpage_test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 * UserService
 */
@Service
public class UserService 
{
    @Autowired
    private UserRepository userRepository;
    
    public void saveUser(User user)
    {
        userRepository.saveAndFlush(user);
    }

    public List<User> findAllUsers()
    {
        return userRepository.findAll();
    }

    public User findUserById(int id)
    {
        Optional<User> optionalUser = userRepository.findById(id);

        if (!optionalUser.isEmpty()) 
        {
            return optionalUser.get();
        }
        return null;
    }

    public void deleteUserById(int id)
    {
        userRepository.deleteById(id);
    }
    
}