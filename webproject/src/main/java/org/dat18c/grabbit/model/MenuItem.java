package org.dat18c.grabbit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MenuItem
 */
@Entity
@Table(name = "menu_items")
public class MenuItem {

    //Fields

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private int price;

    @Column(name = "description")
    private String description;
    
    @Column(name = "picture_url")
    private String pictureURL;

    //Constructors

    public MenuItem() {}

    public MenuItem(String name, int price, String description, String pictureURL) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.pictureURL = pictureURL;
    }

    //Getters & Setters

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPictureURL() {
        return pictureURL;
    }

    public void setPictureURL(String pictureURL) {
        this.pictureURL = pictureURL;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //Methods
    
    @Override
    public String toString() {
        return "MenuItem [id=" + id + ", name=" + name + "]";
    }
}