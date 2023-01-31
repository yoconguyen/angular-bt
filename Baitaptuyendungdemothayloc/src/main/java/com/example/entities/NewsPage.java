package com.example.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "news_pages")
@Data
public class NewsPage{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title_job")
    private String title;

    @Column(name = "describe_job")
    private String describe;
}
