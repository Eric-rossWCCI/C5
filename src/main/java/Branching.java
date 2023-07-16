package main.java;
import java.util.Arrays;
import java.util.List;

public class Branching {
    // create a list of integers using Arrays static method asList
    List<Integer> integers = Arrays.asList(1, 5, 6, 8, 3, 4);

    public void breakStatementDemo() {
        // create int to represent total
        int total = 0;

        // construct for each loop to iterate through items (integers)
        for (Integer i : integers) {
            System.out.println(i);
            // new total equals current total plus current integer
            total = total + i;
            // when total exceeds 10, break from loop
            if (total > 10) {
                break;
            }
        }

        /*
         * create a traditional for loop that counts from zero to five by 1.
         * break out of the loop when the count is greater than 3;
         */
    }

    public void continueDemo() {
        // loop through integers and print every one that is less than 5
        for(Integer i: integers){
            if(i >= 5){
                continue;
            }
            System.out.println(i);
        }

        /*
             *  now I want you guys to take the following list of strings 
             *  and use the continue to skip the print statement if string
             *  doesn't equal help
             *  List<String> strings = Arrays.asList("here", "we", "help", "go");
             */

    }

    public void returnDemo(){
        // make the call to that method
        System.out.println(provideString(2));

    }

    private String provideString(int number){
        // return a string to calling method/code
        if(number == 1){
            return "number is one";
        }
        return upperCasing("Returned string");
    }
    
    // method that takes a string and returns the Capitalized version of it
    private String upperCasing(String lowerCasedString){
        return lowerCasedString.toUpperCase();
    }
}
