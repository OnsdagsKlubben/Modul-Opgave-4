package org.dat18c.webpage_test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Order
 */
@Entity
@Table(name = "orders")
public class Order {

    //Fields

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "user_id")
    private int userID;

    @Column(name = "menu_item_id")
    private int menuItemID;

    //Constructors

    public Order() {}

    public Order(int userID, int menuItemID) {
        this.userID = userID;
        this.menuItemID = menuItemID;
    }

    //Getters & Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getMenuItemID() {
        return menuItemID;
    }

    public void setMenuItemID(int menuItemID) {
        this.menuItemID = menuItemID;
    }

    //Methods

    @Override
    public String toString() {
        return "Order [id=" + id + ", menuItemID=" + menuItemID + ", userID=" + userID + "]";
    }
}