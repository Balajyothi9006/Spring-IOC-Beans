package com.example.SpringProductCatalog.Entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "products")

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pname;
    private String pdescription;
    private Double price;
    private String category;

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return pname;
    }

    public void setName(String name) {
        this.pname = name;
    }

    public String getDescription() {
        return pdescription;
    }

    public void setDescription(String description) {
        this.pdescription = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Product(Long id, String name, String description, Double price, String category) {
        this.id = id;
        this.pname = name;
        this.pdescription = description;
        this.price = price;
        this.category = category;

    }
// Getters and Setters
}

