package com.event.goldenglitz.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="user_details")
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;
    private String email;
    private String password;

    
    public UserDetails() {
    }


    public UserDetails(Long uid, String email, String password) {
        this.uid = uid;
        this.email = email;
        this.password = password;
    }

    
}
