package com.books.mvcOne.model;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.*;

@Table(name = "books")
@Entity
public class Books {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = SEQUENCE)
    private  Long id;

    private String name;

    private  Double price;

    private String author;



    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", Author='" + author + '\'' +
                '}';
    }

    public Books() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
