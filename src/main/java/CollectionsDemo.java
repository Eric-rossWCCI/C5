package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

import javax.print.attribute.HashAttributeSet;

public class CollectionsDemo {

    // create instance variable to be used throughout demo methods
    List<String> words = Arrays.asList("I", "have", "collections", "you", "have", "collections");

    // create a method that iterates and loops through a list. Return list with
    // "Added" concatenated to every list item

    public List<String> looping() {
        // create empty list of strings to house updated strings
        List<String> updatedWords = new ArrayList<>();
        for (String s : words) {
            updatedWords.add(s + "Added");
        }
        // optionally you could use the built in foreach method to loop through items.
        // uncomment the next line to try it out
        // words.forEach(word -> updatedWords.add(word + "Added"));

        // return list of updated words
        return updatedWords;
    }

    public void iterating() {
        // created new list from original list to remove direct backing of non resizable
        // array
        List<String> newWords = new ArrayList<>(words);
        // create iterator (java.util) to allow looping
        Iterator<String> wordsIterator = newWords.iterator();
        while (wordsIterator.hasNext()) {
            // returns the next item in wordsIterator
            String item = wordsIterator.next();
            System.out.println(item);

            // removes the last item returned by next method
            // this act of removing item from collection while looping is only possible
            // through iterators
            wordsIterator.remove();
        }

    }

    public void sets() {
        // create a HashSet from the words collection
        HashSet<String> s = new HashSet<>(words);
        // print to demonstrate duplication removal and loss of order
        System.out.println(s);

        // create linkedHashSet that preserves insertion order
        LinkedHashSet<String> ls = new LinkedHashSet<>(words);
        System.out.println("LinkedHashSet " + ls);

        // create TreeSet
        TreeSet<String> treeSet = new TreeSet<String>(words);
        // print to demonstrate default natural ordering
        System.out.println("TreeSet " + treeSet);

    }

    // queues are used implement FIFO structures
    // PriorityQueues uses priority to determine who is next out instead of
    // insertion order
    public void queues() {

        // so let's use our collection instance variable to create a Priority
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(words);

        // print and remove each item
        System.out.println("Priority " + priorityQueue.poll());
        System.out.println("Priority " + priorityQueue.poll());
        System.out.println("Priority " + priorityQueue.poll());
        System.out.println("Priority " + priorityQueue.poll());
        System.out.println("Priority " + priorityQueue.poll());
        System.out.println("Priority " + priorityQueue.poll());

        // create a linkedList from our words collection
        LinkedList<String> linkedList = new LinkedList<>(words);

        // while this list is not empty, iterate/loop again
        while (!linkedList.isEmpty()) {
            System.out.println(linkedList.remove());
        }
    }

    public void maps() {
        // create a hashMap
        HashMap<Integer, Long> speedDial = new HashMap<Integer, Long>();

        // let's add my wife to this speedDIal map
        speedDial.put(1, 5555555555L);
        System.out.println(speedDial);
        // retrieve the value tied to key 1
        System.out.println(speedDial.get(1));

        // Create a map that takes a String, List<String>
        HashMap<String, List<String>> strMap = new HashMap<String, List<String>>();

        strMap.put("commonWordCollection", words);
        strMap.put("commonWordCollection2", words);
        // demonstrate an attempt to retrieve an item from map that doesn't exist
        System.out.println("key doesn't exist result " + strMap.get("string"));

        // retrieve all keys from map using keySet
        Set<String> keys = strMap.keySet();
        // print keys
        System.out.println(keys);

        // loop through the values contained in a map
        for (List<String> listOStrings : strMap.values()) {
            listOStrings.contains("have");
        }

        // loop through a map using enhanced for loop
        for (Map.Entry<String, List<String>> entry : strMap.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            System.out.println("Key value pair: " + key + " " + value);
        }

        /*
         * create method called returnMapString... return value whose length is
         * less than 4. Return one string
         */

        /*
         * exercise 2... return a concatenation of the key and value whose value length
         * is less than 4
         */

        /*
         * Return the key(s) that start with the letter M
         */

        /*
         * Create class to represent contact info... i.e name, FAKE phone mumber, fake
         * email address.
         * Create user input for this state
         * Add to contacts map. Key = Name and the value = contactInfo object.
         * print out the contents of the map.
         * 
         * test the method that takes in the user input from the input method and
         * creates the class and returns it.
         */

    }
}
