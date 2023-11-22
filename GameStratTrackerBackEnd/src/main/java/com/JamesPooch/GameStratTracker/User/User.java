package com.JamesPooch.GameStratTracker.User;

import java.util.List;

import com.JamesPooch.GameStratTracker.UserGame.UserGame;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Integer userId;

    @Size(min = 8, max = 25, message = "Username length must be between 8 and 25 characters")
    @Column(name = "username")
    private String username;
    @Size(min = 8, max = 25, message = "Password length must be between 8 and 25 characters")
    @Column(name = "password")
    private String password;
    @Email(message = "Email must be valid")
    @Column(name = "email")
    private String email;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="user_game_id", referencedColumnName = "user_id")
    private List<UserGame> userGame;
        
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getUserId() {
        return userId;
    }
    

}
