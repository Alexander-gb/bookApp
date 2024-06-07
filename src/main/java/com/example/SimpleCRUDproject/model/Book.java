package com.example.SimpleCRUDproject.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Books")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String author;

}
