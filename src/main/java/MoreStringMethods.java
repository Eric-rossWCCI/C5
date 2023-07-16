package main.java;
public class MoreStringMethods {

    public void equality() {
        String s1 = new String("mother");
        String s2 = new String("Father");
        String s3 = new String("Mother");

        // show how double equals really works with objects
        // use string equals method to compare content of string
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("S 1 and 2 are equal");
        } else if (s1.equalsIgnoreCase(s3)) {
            System.out.println("s 1 and 3 are equal");
        }

    }

    public void getLength() {

        String word = "Yellow";
        // returns the number of characters in a string
        System.out.println(word.length());

    }

    public void casing() {
        // print the lower cased version of a string
        String upper = "ERIC";
        System.out.println(upper.toLowerCase());
    }

    public void isItHere() {
        String word = "SuperBowl";
        // does SuperBowl contain the word Bowl
        System.out.println(word.contains("Bowl"));
    }

    public void escaping() {    
        String quotes = "We want to print a string surrounded by quotes like so \"string\"";
        String newLine = "THis is how you use escape to create a \nnewline";
        String tabbing = "This is how you use escape to create the \ttabbed affect ";

        System.out.println(quotes);
        System.out.println(newLine);
        System.out.println(tabbing);

    }
}
