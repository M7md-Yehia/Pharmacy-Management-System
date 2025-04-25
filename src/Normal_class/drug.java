/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Normal_class;

import java.util.*;


/**
 *
 * @author Yousef Elnahas
 */


public class drug {
    private int drug_id;
    private String drugname;
    private String drugType;
    private int quantity;
    private int drugprice;
     public static int capacity;
           
public  int q=0;
    public static ArrayList<drug> drugs = new ArrayList<>();
    private static int count;

    public drug() {
        // Default constructor
    }

    public drug(int drug_id, String drugname, String drugType, int quantity, int drugprice) {
        this.drug_id = drug_id;
        this.drugname = drugname;
        this.drugType = drugType;
        this.quantity = quantity;
        this.drugprice = drugprice;
        this.capacity=capacity;
        drugs.add(this); // Add the new drug instance to the drugs list
    }

    public static ArrayList<drug> getDrugs() {
        return drugs;
    }

    public int getquantity() {
        return quantity;
    }

    public void setquantity(int quantity) {
        this.quantity = quantity;
    }

    public int getprice() {
        return drugprice;
    }

    public void setDrugPrice(int drugprice) {
        this.drugprice = drugprice;
    
    }
     public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

     
    public boolean addDrug( ) {
        for (drug d : drugs){
       q+= d.getquantity();
        }
        
        if (q >= capacity) {
            return true;
        }
        return false;
    }

    
    public int getDrugID() {
        return drug_id;
    }

    
    public void setDrugID(int drug_id) {
        this.drug_id = drug_id;
    }

    public String getDrugName() {
        return drugname;
    }

    public void setDrugName(String drugname) {
        this.drugname = drugname;
    }

    public String getDrugType() {
        return drugType;
    }

    public void setDrugType(String drugType) {
        this.drugType = drugType;
    }
 
    

    @Override
    public String toString() {
        return drugname;
    }
    
    
    public boolean isDuplicateID(int id) {
        for (drug d : drugs) {
            if (d.getDrugID() == id) {
                return true;
            }
        }
        return false;
    }
    
}
