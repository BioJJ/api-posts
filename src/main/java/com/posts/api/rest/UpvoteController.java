package com.posts.api.rest;

import com.posts.api.model.entify.Upvote;
import com.posts.api.model.repository.UpvoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/upvotes")
public class UpvoteController {

    @Autowired
    private UpvoteRepository upvoteRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Upvote salvar( @RequestBody Upvote upvote){
       return upvoteRepository.save(upvote);
   }

    @GetMapping
    public List<Upvote> Listar(@RequestParam(value = "post_id") Long postId){
        return upvoteRepository.findByPostsId(postId);
    }


}
