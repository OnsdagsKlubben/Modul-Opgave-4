package org.dat18c.grabbit.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Model klassen for vores database entity orders
 * @author Frederik Lundbeck Jørgensen
 */
@Entity
@Table(name = "orders")
public class Order {

    //Fields

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "menu_item_id")
    private int menuItemId;

    @Column(name = "create_time")
    private Timestamp createTime;

    //Constructors

    public Order() {}

    public Order(int userId, int menuItemId) {
        this.userId = userId;
        this.menuItemId = menuItemId;
    }

    //Getters & Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userID) {
        this.userId = userID;
    }

    public int getMenuItemId() {
        return menuItemId;
    }

    public void setMenuItemId(int menuItemID) {
        this.menuItemId = menuItemID;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    //Methods

    @Override
    public String toString() {
        return "Order [id=" + id + ", menuItemID=" + menuItemId + ", userID=" + userId + "]";
    }
}