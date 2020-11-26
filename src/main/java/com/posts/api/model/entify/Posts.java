package com.posts.api.model.entify;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Posts extends AbstractEntity {

    @Column(nullable = false, length = 500)
    private String post;

    @OneToMany
    @JsonIgnore
    private Set<Upvote> upvotes;


   // @Column
   // @JsonFormat(pattern = "dd/MM/yyyy")
    // private LocalDate dt;

   // @PrePersist
   // public void prePersist(){
    //    setDt(LocalDate.now());
  //  }

}
