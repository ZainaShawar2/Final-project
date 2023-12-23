/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryapp;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author MSI LAPTOP
 */
public class Student extends Person {

    private String major;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    public Student(String major, ArrayList<Book> borrowedBooks, int id, String name, Date d1, String address) {
        super(id, name, d1, address);
        this.major = major;
        this.borrowedBooks = borrowedBooks;
    }

    public Student(String major, int id, String name, Date d1, String address) {
        super(id, name, d1, address);
        this.major = major;
    }

    public void loanBook(Book book) {
        if (borrowedBooks.size() < 3) {

            borrowedBooks.add(book);

            LocalDate dueDate = LocalDate.now().plusDays(5);

            System.out.println("Book '" + book.getTitle() + "' borrowed.");
            System.out.println("Due Date: " + dueDate);

        } else {
            System.out.println("Cannot borrow more than 3 books.");
        }
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
    
    public int getNubmerOfLoanedBooks() {
        return this.borrowedBooks.size();
    }

    public void addLoadnedBook(Book book) {
        this.borrowedBooks.add(book);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", major= " + this.getMajor();
    }


}
