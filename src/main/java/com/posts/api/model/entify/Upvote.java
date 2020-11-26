package com.posts.api.model.entify;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Upvote extends AbstractEntity {

    @Column
    private String username;

    @ManyToOne(fetch = FetchType.EAGER)
    private Posts posts;
}
