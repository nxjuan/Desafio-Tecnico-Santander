package com.github.CatalogoDoSabio.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    @Column
    private String title;

    @Column
    private String author;

    @Column
    private String main_genre;

    @Column
    private String sub_genre;

    @Column
    private String type;

    @Column
    private String description;

    @Column
    private BigDecimal price;

    @Column
    private Date published_date;

    @Column
    private String publisher;
}
