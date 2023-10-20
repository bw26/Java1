package com.xpanxion.assignments.shared;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    private ArrayList<String> history = new ArrayList<String>();
    public void run() {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("Enter first number: ");
            String line = input.nextLine();
            if(line.equals("done"))break;
            int num1 = Integer.parseInt(line.replace("\n",""));
            System.out.print("Enter second number: ");
            line=input.nextLine();
            if(line.equals("done"))break;
            int num2 = Integer.parseInt(line.replace("\n",""));
            System.out.print("Enter operation (add, sub, mul, div): ");
            String op = input.nextLine();
            if(op.equals("done"))break;
            switch (op){
                case "add":
                    this.history.add(num1+" + "+num2+" = "+(num1+num2));
                    System.out.println("Result: " + (num1+num2));
                    break;
                case "sub":
                    this.history.add(num1+" - "+num2+" = "+(num1-num2));
                    System.out.println("Result: " + (num1-num2));
                    break;
                case "mul":
                    this.history.add(num1+" * "+num2+" = "+(num1*num2));
                    System.out.println("Result: " + (num1*num2));
                    break;
                case "div":
                    this.history.add(num1+" / "+num2+" = "+(num1/num2));
                    System.out.println("Result: " + (num1/num2));
                    break;
                default:
                    System.out.println("Invalid operation");
            }
        }
        for(String s : this.history){
            System.out.println(s);
        }
    }
}
