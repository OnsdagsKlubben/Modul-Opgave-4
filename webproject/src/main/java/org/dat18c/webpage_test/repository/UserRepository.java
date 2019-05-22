package org.dat18c.webpage_test.repository;

import org.dat18c.webpage_test.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * UserDetailsRepository
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> 
{
    //Used for login authentication
    User findByEmail(String username);
}