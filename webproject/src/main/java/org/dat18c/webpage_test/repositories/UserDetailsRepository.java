package org.dat18c.webpage_test.repositories;

import org.dat18c.webpage_test.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * UserDetailsRepository
 */
@Repository
public interface UserDetailsRepository extends JpaRepository<User, Integer> {
    User findByEmail(String username);
}