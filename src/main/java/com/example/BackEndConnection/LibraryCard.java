package com.example.BackEndConnection;

import javax.persistence.*;

@Entity()
@Table(name = "Library_Card")
public class LibraryCard {

    @Id
    private int cardNo;
    private int fine;
    private String issueDate;

    @Enumerated(value = EnumType.STRING)  // To store the value in Database in string formate
    private CardStatus cardStatus;


    // Child class will have the foreign key of parent class through
    // which it connects the parent table
    // In general, In other word we can say primary key of the parent class will be foreign key
    // of child class, or any unique and not null column can behave like a foreign key
    // in child class.
    public LibraryCard() {
    }

    public LibraryCard(int cardNo, int fine, String issueDate) {
        this.cardNo = cardNo;
        this.fine = fine;
        this.issueDate = issueDate;
    }


    // it is always written in child class
    @OneToOne // Mapping relationship between two entities
    // first will denote current class
    // Second will denote with whom we have to connect the current table

    @JoinColumn // You are telling add a foreign key column, By default it will be
    // primary of parent table (or class) we can also tell the column name if we want
    // but make sure Column is unique and not null
    User user;

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }
}
