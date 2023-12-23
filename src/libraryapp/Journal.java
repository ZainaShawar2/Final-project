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
public class Journal extends Book implements Serializable{
    private String conferenceName;
    private int conferenceNO; 

    

    public Journal(String conferenceName, int conferenceNO, String title, Author a1, Date d1, String genre, int edition, int no, boolean isLoaned) {
        super(title, a1, d1, genre, edition, no, isLoaned);
        this.conferenceName = conferenceName;
        this.conferenceNO = conferenceNO;
    }

    public String getConferenceName() {
        return conferenceName;
    }

    public void setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
    }

    public int getConferenceNO() {
        return conferenceNO;
    }

    public void setConferenceNO(int conferenceNO) {
        this.conferenceNO = conferenceNO;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+ " Conference name: "+ this.getConferenceName()+ " conference no : "+ this.getConferenceNO(); 
    }

    @Override
    public boolean inLoan() {
        return super.inLoan(); 
    }
    
    
}
