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
public class Placeorder {
    private drug drug;
       

    private int quantity;
    private double totalCost;
     private double totalSales = 0.0;
    public static ArrayList<Placeorder> orderItems = new ArrayList<>();
    public Placeorder(drug drug, int quantity, double totalCost) {
        this.drug = drug;
        this.quantity = quantity;
        this.totalCost = totalCost;
    this.totalSales=totalSales;
   
    }
   public static ArrayList<Placeorder> getorders() {
        return orderItems;
    }
    public drug getDrug() {
        return drug;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalCost() {
        return totalCost;
    }
    public double gettotalSales(){
    return totalSales;
    }
}

