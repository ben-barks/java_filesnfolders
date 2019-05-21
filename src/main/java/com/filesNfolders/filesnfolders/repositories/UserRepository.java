package com.filesNfolders.filesnfolders.repositories;

import com.filesNfolders.filesnfolders.folders.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
