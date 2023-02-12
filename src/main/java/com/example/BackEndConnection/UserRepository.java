package com.example.BackEndConnection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


// JpaRepository always takes two parameter
// 1. Entity name (can say table name)
// 2. Data type of primary key
// always one entity will have one table

@Repository
public interface UserRepository extends JpaRepository <User,Integer>{

}
