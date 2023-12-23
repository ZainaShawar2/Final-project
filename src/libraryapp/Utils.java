/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author MSI LAPTOP
 */
public class Utils {
     
    // takes list of books -> convert it to binray data (save it on a file)
    public static void serializeBooks(ArrayList<Book> books) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("books.dat"); // file it self
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream); // mainpluation
            
            objectOutputStream.writeObject(books); // store the list in the file
            System.out.println("Books collection serialized successfully");
            objectOutputStream.close();
        } catch (IOException e) {
            System.out.println("Error during serialization " + e.getMessage());
        }
    }
    
    // takes a binary file -> convert it to list of books
    public static ArrayList<Book> deserializeBooks() {
        
        ArrayList<Book> books = new ArrayList<>(); // intial empty list
        File file = new File("books.dat"); // there is a file, its name is books.dat

        if (!file.exists()) {
            return books;
        }
        // file: contains books object
        try {
            // it takes either file name OR file object
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            // casting
            books = (ArrayList<Book>) objectInputStream.readObject(); // fill the list with data
            System.out.println("Books collection deserialized successfully.");

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization " + e.getMessage());
        }
        return books; // return a new list of books (contains data)
    }
}
