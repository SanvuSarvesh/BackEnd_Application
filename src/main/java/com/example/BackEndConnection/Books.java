package com.example.BackEndConnection;

import javax.persistence.*;

@Entity
@Table(name = "Books")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // to auto generate book id
    // user does not need to send book id from postman
    private  int id;
    private String name;
    private String writter;

    // to coneect with the auther class
    @ManyToOne
    @JoinColumn
    Author author;
    public Books() {
    }

    public Books(int id, String name, String writter) {
        this.id = id;
        this.name = name;
        this.writter = writter;
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

    public String getWritter() {
        return writter;
    }

    public void setWritter(String writter) {
        this.writter = writter;
    }
}
