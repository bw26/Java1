package com.xpanxion.assignments.student;

import com.xpanxion.assignments.shared.*;

import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.*;
import java.util.stream.Collectors;

public class JavaTwo {

    //
    // Constructors
    //

    public JavaTwo() {}

    //
    // Public methods
    //

    public void ex1() {
        System.out.println(" ex1.");
        Scanner input = new Scanner(System.in);
        ArrayList<Person> personList = new ArrayList<Person>();
        while(true){
            System.out.print("Enter Person: ");
            String line = input.nextLine();
            if(line.equals("done"))break;
            String[] args = line.replace(",","").split(" ");
            personList.add(new Person(Integer.parseInt(args[0]), args[1], args[2]));
        }
        for(Person p : personList) {
            System.out.println(p);
        }
    }

    public void ex2() {
        System.out.println(" ex2.");
        Scanner input = new Scanner(System.in);
        HashMap<Integer,Person> personMap= new HashMap<Integer,Person>();
        personMap.put(1,new Person(1,"Peter", "Jones"));
        personMap.put(2,new Person(2,"John", "Smith"));
        personMap.put(3,new Person(3,"Mary", "Jane"));
        System.out.print("Enter a person id: ");
        while(true){
            try{
                int id = input.nextInt();
                if(personMap.get(id) == null) System.out.println("No such person exists.");
                else System.out.println(personMap.get(id));
                break;
            }catch(InputMismatchException e){
                System.out.println("Not a number");
            }
        }
    }

    public void ex3() {
        System.out.println(" ex3.");
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }

    public void ex4() {
        System.out.println(" ex4.");
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }

    public void ex5() {
        System.out.println(" ex5.");
        var repository = new Repository();
        var p = repository.getPerson();
        System.out.println(p);
    }

    public void ex6() {
        System.out.println(" ex6.");
        Calculator calc = new Calculator();
        calc.run();
    }

    public void ex7() {
        System.out.println(" ex7.");
        var personList = Arrays.asList(
                new Person(1, "Peter", "Jones"),
                new Person(2, "John", "Smith"),
                new Person(3, "Sue", "Anderson")
        );

        // TODO: YOUR CODE HERE...
        List<Person> newPersonList = personList.stream().map(person -> new Person(person.getId(), person.getFirstName(),"xxx")).toList();

        for (Person p : newPersonList) {
            System.out.println(p);
        }
    }

    public void ex8() {
        System.out.println(" ex8.");
        var personList = Arrays.asList(
                new Person(1, "Charlie", "Jones"),
                new Person(2, "Zoey", "Smith"),
                new Person(3, "Adam", "Anderson")
        );

        // TODO: Your code here
        personList = personList.stream().sorted((p1,p2) -> p1.getFirstName().compareTo(p2.getFirstName())).toList();

        for (Person p : personList) {
            System.out.println(p);
        }
    }

    public void ex9() {
        System.out.println(" ex9.");
        var personList = Arrays.asList(
                new Person(1, "Charlie", "Jones"),
                new Person(2, "Zoey", "Smith"),
                new Person(3, "Adam", "Anderson")
        );

        // TODO: Your code here
        List<Person> filteredList = personList.stream().filter(person -> person.getLastName().equals("Smith")).toList();

        for (Person p : filteredList) {
            System.out.println(p);
        }
    }

    public void ex10() {
        System.out.println(" ex10.");
        LinkedList<Cat> catQueue = new LinkedList<Cat>();
        catQueue.add(new Cat("Alice"));
        catQueue.add(new Cat("Bob"));
        catQueue.add(new Cat("Charlie"));
        catQueue.add(new Cat("Dan"));
        while(!catQueue.isEmpty()){
            System.out.println(catQueue);
            catQueue.remove(0);
        }
    }

    //
    // Private helper methods
    //
}
