package com.posts.api.model.entify;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@MappedSuperclass
@Getter
@Setter
@EqualsAndHashCode
public abstract class AbstractEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    @CreationTimestamp
    private Instant createDateTime;

    @Column
    @UpdateTimestamp
    private Instant updateDateTime;

}
