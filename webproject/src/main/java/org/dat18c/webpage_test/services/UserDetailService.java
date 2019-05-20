package org.dat18c.webpage_test.services;

import java.util.Collection;
import java.util.Collections;

import org.dat18c.webpage_test.models.User;
import org.dat18c.webpage_test.repositories.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * UserDetailsService
 */
@Service
public class UserDetailService implements UserDetailsService 
{
    @Autowired
    private UserDetailsRepository userDetailsRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException 
    {
        User user = userDetailsRepository.findByEmail(email);

        if (user == null) {
            throw new UsernameNotFoundException("User not found!");
        }

        UserDetails userDetails = new UserDetails(){
    
            private static final long serialVersionUID = 1L;

            @Override
            public boolean isEnabled() {
                return true;
            }
        
            @Override
            public boolean isCredentialsNonExpired() {
                return true;
            }
        
            @Override
            public boolean isAccountNonLocked() {
                return true;
            }
        
            @Override
            public boolean isAccountNonExpired() {
                return true;
            }
        
            @Override
            public String getUsername() {
                return user.getEmail();
            }
        
            @Override
            public String getPassword() {
                return user.getPassword();
            }
        
            @Override
            public Collection<? extends GrantedAuthority> getAuthorities() {

                if (!user.getAdminRole()) {
                    return Collections.singleton(new SimpleGrantedAuthority("USER"));
                } 
                else {
                    return Collections.singleton(new SimpleGrantedAuthority("ADMIN"));
                }
            }
        };
        return userDetails;
    }

}