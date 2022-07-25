package com.example.relationalDBcampus.repository;

import com.example.relationalDBcampus.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
