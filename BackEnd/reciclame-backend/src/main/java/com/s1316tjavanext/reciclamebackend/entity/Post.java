package com.s1316tjavanext.reciclamebackend.entity;

import com.s1316tjavanext.reciclamebackend.entity.enums.Category;
import com.s1316tjavanext.reciclamebackend.entity.enums.Status;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

/**
 * @author jdmon on 20/02/2024
 * @project reciclame-backend
 */
@Entity
@Table(name = "posts")
@Data
@SQLDelete(sql = "UPDATE posts SET  deleted = true WHERE id =?")
@Where(clause = "deleted=false")
public class Post {
    @Id
    //@GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String title;
    private String description;
    private int favorite;
    //private Profile profile;
    //Image
    private Category category;
    private LocalDate date;
    private Status status;
    @OneToMany
    private ArrayList<Comment> comments;
    private boolean deleted = Boolean.FALSE;


}
