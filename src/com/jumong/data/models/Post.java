package com.jumong.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.xml.stream.events.Comment;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Document("Posts")
public class Post {
    @Id
    private String id;
    private String title;
    private String content;
    private LocalDateTime dateCreated;
    @DBRef
    private List<View> views;
    @DBRef
    private List<Comment> comments;
}
