package com.posts.api.model.repository;

import com.posts.api.model.entify.Upvote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UpvoteRepository extends JpaRepository<Upvote, Long> {
    public List<Upvote> findByPostsId(Long id);
}
