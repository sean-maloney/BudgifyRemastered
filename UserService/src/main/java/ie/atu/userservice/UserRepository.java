package ie.atu.userservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    // Method to find a user by username
    User findByUsername(String username);

    // Method to check if a username already exists in the database
    boolean existsByUsername(String username);
}

