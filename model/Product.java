package com.tecdesoftware.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String brand;
    private int price;
    private String color;

    @Column(name = "image_path")
    private String imagePath;

    private String category;

    // Getters y Setters
}
