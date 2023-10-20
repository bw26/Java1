package com.xpanxion.assignments.shared;

public class Product extends Base{
    private String name;
    private double cost;
    public Product(int id, String name, double cost){
        super(id);
        this.name = name;
        this.cost = cost;
    }
    public double getCost(){
        return this.cost;
    }
}
