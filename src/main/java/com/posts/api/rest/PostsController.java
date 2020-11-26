package com.posts.api.rest;

import com.posts.api.model.repository.PostsRepository;
import com.posts.api.model.entify.Posts;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/api/posts")
public class PostsController {

   private final PostsRepository respository;

   @Autowired
   public PostsController(PostsRepository respository){
       this.respository = respository;
   }


   @PostMapping
   @ResponseStatus(HttpStatus.CREATED)
   public Posts salvar(@RequestBody Posts posts){
       return respository.save(posts);
   }


   @GetMapping("{id}")
   public Posts BuscarId(@PathVariable Long id){
    return respository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
   }

   @GetMapping
    public List<Posts> Listar(){
       return respository.findAll();
   }


}
