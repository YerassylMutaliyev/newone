package lab5.iitu.repository;

import lab5.iitu.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Long> {
    Users findByUsername(String username);

    Users findByEmail(String email);

    Optional<Users> findUsersByUsername(String username);
}