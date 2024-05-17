package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "book")
public class Book{
        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        private Long id;
        private String title;
        private Integer pages;
        private String author;
}