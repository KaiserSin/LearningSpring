package com.artemchik.nikitathreehundredbucks.repos;

import com.artemchik.nikitathreehundredbucks.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
