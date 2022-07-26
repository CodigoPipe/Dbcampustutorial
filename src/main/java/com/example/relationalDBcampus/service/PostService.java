package com.example.relationalDBcampus.service;

import com.example.relationalDBcampus.entity.Comment;
import com.example.relationalDBcampus.entity.Post;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PostService {

    Post createPost(Post post);

    Post createComment(Comment comment);

    void deleteComment(Comment comment);

    void deletePost(Post post);

    List<Post> findAllPost();

}
