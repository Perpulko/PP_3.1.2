package ru.kata.spring.boot_security.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.entityes.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String name);
//    List<User> getAllUsers();
//
//    User getUserById(int id);
//
//    void save(User user);
//
//    void update(User user);
//
//    void delete(int id);
}
