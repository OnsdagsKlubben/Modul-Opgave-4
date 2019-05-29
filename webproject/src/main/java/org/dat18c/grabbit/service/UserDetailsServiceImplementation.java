package org.dat18c.grabbit.service;

import java.util.Collection;
import java.util.Collections;

import org.dat18c.grabbit.model.User;
import org.dat18c.grabbit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * UserDetailsService
 * @author Frederik Lundbeck Jørgensen
 */
@Service
public class UserDetailsServiceImplementation implements UserDetailsService 
{
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) 
    {
        User user = userRepository.findByEmail(email);

        if (user == null) 
        {
            throw new UsernameNotFoundException(
              "No user found with email: " + email);
        }


        UserDetails userDetails = new UserDetails()
        {
            @Override
            public boolean isEnabled() 
            {
                return true;
            }
        
            @Override
            public boolean isCredentialsNonExpired() 
            {
                return true;
            }
        
            @Override
            public boolean isAccountNonLocked() 
            {
                return true;
            }
        
            @Override
            public boolean isAccountNonExpired() 
            {
                return true;
            }
        
            @Override
            public String getUsername() 
            {
                return user.getEmail();
            }
        
            @Override
            public String getPassword() 
            {
                return user.getPassword();
            }
        
            @Override
            public Collection<? extends GrantedAuthority> getAuthorities() 
            {
                if (!user.getAdminRole()) 
                {
                    return Collections.singleton(new SimpleGrantedAuthority("USER"));
                } 
                else 
                {
                    return Collections.singleton(new SimpleGrantedAuthority("ADMIN"));
                }
            }
        };
        return userDetails;
    }

}