package com.pageprice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@Document(collection = "Products")
@CompoundIndex(def = "{'titulo': 'text'}")  // Índice de texto para busca
public class ProductModel {
    @Id
    private String id;
    @TextIndexed
    private String title;

    private String author;
    private String publisher;
    private String isbn;
    private String imageUrl;
    private List<String> genre;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Construtores
    public ProductModel() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }
}
