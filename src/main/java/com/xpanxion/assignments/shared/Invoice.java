package com.xpanxion.assignments.shared;

import java.util.ArrayList;

public class Invoice extends Base{
    private ArrayList<Product> products;
    public Invoice(int id){
        super(id);
        this.products = new ArrayList<Product>();
    }
    public void addProduct(Product prod){
        this.products.add(prod);
    }

    public double getTotalCost(){
        double totalCost = 0;
        for(Product p : this.products){
            totalCost += p.getCost();
        }
        return totalCost;
    }

}
