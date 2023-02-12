package com.example.BackEndConnection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  // So that hibernate can identify whose attributes has for table creations
@Table(name = "user_info")  // this is just to give table name, by default table name is
// is equals to class name
public class User {
    @Id  // it is written on the attributes which has to become primary key
    private int id; // id will be primary key
    private  String name;
    private int age;
    private String mobNo;

    @Column(name = "country_name") // To give the column name and unique value
    private String country;

    @Column(name = "Email_Id", unique = true)
    private String emailId;


    // Always create default constructor
    public User() {
    }

    // Creating all args constructor
    public User(int id, String name, int age,String mobNo, String emailId, String country) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobNo =  mobNo;
        this.emailId =  emailId;
        this.country =  country;
    }

    // Creating getters and setters
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
