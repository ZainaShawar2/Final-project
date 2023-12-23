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
public class Book implements Display,Serializable {

    private String title;
    private Author a1;
    private Date d1;
    private String genre;
    private int edition;
    private int no;
    private boolean isLoaned;

    public Book() {
        
    }
     

    public Book(String title, Author a1, Date d1, String genre, int edition, int no, boolean isLoaned) {
        this.title = title;
        this.a1 = a1;
        this.d1 = d1;
        this.genre = genre;
        this.edition = edition;
        this.no = no;
        this.isLoaned = false;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getA1() {
        return a1;
    }

    public void setA1(Author a1) {
        this.a1 = a1;
    }

    public Date getD1() {
        return d1;
    }

    public void setD1(Date d1) {
        this.d1 = d1;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public boolean isIsLoaned() {
        return isLoaned;
    }

    public void setIsLoaned(boolean isLoaned) {
        this.isLoaned = isLoaned;
    }

    @Override
    public String getInfo() {
        return "title : " + this.getTitle() + ", Auther name: =" + this.getA1().getName() + ", Date : " + this.getD1().getDay()
                + "/" + this.getD1().getMonth() + "/" + this.getD1().getYear() + ", genre=" + this.getGenre()
                + ", edition=" + this.getEdition() + ", no of book: " + this.getNo() + ", isLoaned: " + isLoaned;
    }

    @Override
    public boolean inLoan() {
        return isLoaned;
    }

}
