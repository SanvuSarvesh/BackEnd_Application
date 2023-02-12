package com.example.BackEndConnection;

import javax.persistence.*;

@Entity
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String booksWritten;
    private String country;
    private int age;

    public Author() {
    }

    public Author(int id, String name, String booksWritten, String country, int age) {
        this.id = id;
        this.name = name;
        this.booksWritten = booksWritten;
        this.country = country;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBooksWritten() {
        return booksWritten;
    }

    public void setBooksWritten(String booksWritten) {
        this.booksWritten = booksWritten;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
