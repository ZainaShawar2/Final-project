/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryapp;

import java.util.ArrayList;

/**
 *
 * @author MSI LAPTOP
 */
public class Library {
    private ArrayList<Book> books; 
    private ArrayList<Student> students; 

    public Library(ArrayList<Book> books, ArrayList<Student> students) {
        this.books = books;
        this.students = students;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    
   
    
}
