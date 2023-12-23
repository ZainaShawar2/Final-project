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
public class Author extends Person implements Serializable{

    public Author(int id, String name, Date d1, String address) {
        super(id, name, d1, address);
    }

    @Override
    public String getInfo() {
        return super.getInfo(); 
    }
    
    
}
