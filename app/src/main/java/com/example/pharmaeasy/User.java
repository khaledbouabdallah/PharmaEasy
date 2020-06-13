package com.example.pharmaeasy;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {
    @PrimaryKey
    @NonNull
    private String Password;


    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
