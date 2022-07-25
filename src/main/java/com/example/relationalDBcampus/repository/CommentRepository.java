package com.example.relationalDBcampus.repository;

import com.example.relationalDBcampus.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
