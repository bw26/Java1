package com.xpanxion.assignments.student;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class JavaOne {

    //
    // Constructors
    //

    public JavaOne() {}

    //
    // Public methods
    //

    public void ex1() {
        System.out.println(" ex1.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Your name in upper case is: "+name.toUpperCase());
    }

    public void ex2() {
        System.out.println(" ex2.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String words = input.nextLine().replace(" ", "");
        int count = 0;
        for(int i = 0; i < words.length();i++){
            if(words.charAt(i) == Character.toUpperCase(words.charAt(i))) count++;
        }
        System.out.println("Number of uppercase letters: "+count);
    }

    public void ex3() {
        System.out.println(" ex3.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String[] words = input.nextLine().split(" ");
        String res = "";
        for(int i = 0; i<words.length;i++){
            res = (i%2==0) ? res+words[i].toUpperCase() : res+words[i];
            if(i!= words.length-1)res+=" ";
        }
        System.out.println(res);
    }

    public void ex4() {
        System.out.println(" ex4.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = input.next();
        int left = 0;
        int right = word.length()-1;
        while(left < right){
            if (word.charAt(left)!=word.charAt(right)){
                System.out.println("NO");
                return;
            }
            left++;
            right--;
        }
        System.out.println("YES");
    }

    public void ex5() {
        System.out.println(" ex5.");
        Scanner input = new Scanner(System.in);
        while(true){
            int vowels = 0, consonants = 0;
            System.out.print("Enter a string: ");
            String word = input.nextLine().replace(" ","").replaceAll("[-+.^:,]","").toLowerCase();
            if(word.equals("quit")) break;
            for(int i = 0; i<word.length();i++) {
                if(word.charAt(i)!='a'&&word.charAt(i)!='e'&&word.charAt(i)!='i'&&word.charAt(i)!='o'&&word.charAt(i)!='u'){
                    consonants++;
                }
                else vowels++;
            }
            System.out.println("Number of vowels: " + vowels);
            System.out.println("Number of consonants: " + consonants);
        }
    }

    public void ex6() {
        System.out.println(" ex6.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        System.out.println("Result: " + (num1+num2));
    }

    public void ex7() {
        System.out.println(" ex7.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter operation (add, sub, mul, div): ");
        String op = input.next();
        while(true){
            switch (op){
                case "add":
                    System.out.println("Result: " + (num1+num2));
                    return;
                case "sub":
                    System.out.println("Result: " + (num1-num2));
                    return;
                case "mul":
                    System.out.println("Result: " + (num1*num2));
                    return;
                case "div":
                    System.out.println("Result: " + (num1/num2));
                    return;
                default:
                    System.out.println("Invalid operation");
            }
        }
    }

    public void ex8() {
        System.out.println(" ex8.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter price per square feet: ");
        double sum = 0;
        double price = Double.parseDouble(input.nextLine());
        while(true){
            System.out.print("Enter room dimensions (width x height): ");
            String dim = input.nextLine();
            if(dim.equals("done")) break;
            String[] dimensions = dim.replace(" ","").split("x");
            int area = 1;
            for(String s:dimensions){
                area*=Integer.parseInt(s);
            }
            sum+=(area*price);
        }
        System.out.println("Total cost: $"+sum);
    }

    public void ex9() {
        System.out.println(" ex9.");
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        int random = ran.nextInt(5 - 1 + 1) + 1;
        while(true){
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            if(num == random){
                System.out.println("You guessed it!!!");
                break;
            }
            else System.out.println("Try again...");
        }
    }

    public void ex10() {
        System.out.println(" ex10.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String[] words = input.nextLine().split(" ");
        for(String s : words){
            for(int i = 0; i<s.length();i++){
                System.out.print(" ".repeat(i));
                System.out.println(s.charAt(i));
            }
        }
    }

    //
    // Private helper methods
    //
}
