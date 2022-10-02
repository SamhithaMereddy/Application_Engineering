/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author samhitha
 */
public class DetailsHistory {
    
    private ArrayList<Details> history;
    
    public DetailsHistory(){
    
        this.history = new ArrayList<Details>();
    }

    public ArrayList<Details> getHistory() {
        return history;
    }
    public void setHistory(ArrayList<Details> history) {
        this.history = history;
    }
    
    public Details addNewDetails(){
        
    Details newDetails=new Details();
    history.add(newDetails);
    return newDetails;
    }
     public void deleteDetails(Details ds){
        history.remove(ds);
    }
}
