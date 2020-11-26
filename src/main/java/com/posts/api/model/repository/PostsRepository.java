package com.posts.api.model.repository;

import com.posts.api.model.entify.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {

}
