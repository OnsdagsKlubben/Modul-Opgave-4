package org.dat18c.grabbit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Model klassen for vores database entity user.
 * @author Frederik Lundbeck Jørgensen
 */
@Entity
@Table(name = "users")
public class User
{
    //Fields

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "email")
    private String email;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "password")
    private String password;

    @Column(name = "user_role")
    private boolean adminRole;

    //Constructors

    public User() {}

    public User(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    //Getters & Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email.toLowerCase();
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public boolean getAdminRole() {
        return adminRole;
    }
    
    public void setAdminRole(boolean isAdmin) {
        this.adminRole = isAdmin;
    }
    
    //Methods

    @Override
    public String toString() {
        return "User [id=" + id + " firstName=" + firstName + ", lastName=" + lastName + "]";
    }
    
}