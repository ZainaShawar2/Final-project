/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryapp;

import java.io.Serializable;

/**
 *
 * @author MSI LAPTOP
 */
public class Person implements Serializable{

    private int id;
    private String name;
    private Date d1;
    private String address;

    public Person(int id, String name, Date d1, String address) {
        this.id = id;
        this.name = name;
        this.d1 = d1;
        this.address = address;
    }

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

    public Date getD1() {
        return d1;
    }

    public void setD1(Date d1) {
        this.d1 = d1;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInfo() {
        return "id=" + this.getId() + ", name=" + this.getName() + ", date: =" + this.getD1().getDay()
                + "/" + this.getD1().getMonth() + "/" + this.getD1().getYear() + ", address=" + this.getAddress();
    }

}
