package org.dat18c.grabbit.repository;

import org.dat18c.grabbit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * UserDetailsRepository
 * @author Nicklas List
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> 
{
    //Used for login authentication
    User findByEmail(String username);
}