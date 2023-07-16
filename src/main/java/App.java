package main.java;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // to call the non static method of the branching class, we must create an
        // instance(object) of that class
        Branching branching = new Branching();
        // branching.breakStatementDemo();
        // branching.continueDemo();
        // branching.returnDemo();
        // MoreStringMethods moreStringMethods = new MoreStringMethods();
        // moreStringMethods.equality();
        // moreStringMethods.getLength();
        // moreStringMethods.casing();
        // moreStringMethods.isItHere();
        // moreStringMethods.escaping();
        // App app = new App();
        // app.getInput();

        CollectionsDemo collectionsDemo = new CollectionsDemo();
        collectionsDemo.looping();
        collectionsDemo.iterating();
        collectionsDemo.sets();
        collectionsDemo.queues();
        collectionsDemo.maps();

    }

    public void getInput() {
        Scanner input = new Scanner(System.in);

        System.out.println("Can you provide a string value?");
        System.out.println(input.nextLine());
        System.out.println("Can you provide a number this time?");
        int numberEntered = input.nextInt();
        input.nextLine();
        System.out.println("Here is the number you entered " + numberEntered);
        input.close();

    }

    public String usernaming(String input){
        if(input.length() > 7 && input.contains("code")){
            return "Good job on the username selection";
        }else if(input.length() < 8){
            return "Sorry, your username doesn't meet the length requirements";
        }

        return "";

    }

    // create a method that takes a list and returns it size
    public int returnSize(List<Integer> ints) {

        return ints.size();
    }

}
