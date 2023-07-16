package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeSet;

import javax.print.attribute.HashAttributeSet;

public class CollectionsDemo {

    // create instance variable to be used throughout demo methods
    List<String> words = Arrays.asList("I", "have", "collections", "you", "have", "collections");

    // create a method that iterates and loops through a list. Return list with
    // "Added" concatenated to every list item

    public List<String> looping(){
        // create empty list of strings to house updated strings
        List<String> updatedWords = new ArrayList<>();
        for(String s: words){
                updatedWords.add(s+"Added");
        }
        // use the built in foreach method to loop through items
        // words.forEach(word -> updatedWords.add(word + "Added"));
        // return list of updated words
        return updatedWords;
    }


    public void iterating(){
        // created new list from original list to remove direct backing of non resizable array
        List<String> newWords = new ArrayList<>(words);
        // create iterator (java.util) to allow looping
       Iterator<String> wordsIterator =  newWords.iterator();

       wordsIterator.hasNext();
        // returns the next method
        String item = wordsIterator.next();
        // System.out.println(item);

        // removes the last item returned by next method
        wordsIterator.remove();
       
    }


    public void sets(){
        // create a HashSet from the words collection
        HashSet<String> s = new HashSet<>(words);

        System.out.println(s);

        // create linkedHashSet that preserves insertion order
        LinkedHashSet<String> ls = new LinkedHashSet<>(words);
        System.out.println("LinkedHashSet " + ls);

        // create TreeSet 
        TreeSet<String> treeSet = new TreeSet<String>(words);
        System.out.println("TreeSet "+ treeSet);

    }


    public void queues(){

        // so let's use our collection instance variable to create a Priority
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(words);

        // print and remove each item
        System.out.println("Priority "+ priorityQueue.poll());
        System.out.println("Priority "+ priorityQueue.poll());
        System.out.println("Priority "+ priorityQueue.poll());
        System.out.println("Priority "+ priorityQueue.poll());
        System.out.println("Priority "+ priorityQueue.poll());
        System.out.println("Priority "+ priorityQueue.poll());


        // create a linkedList from our words collection
        LinkedList<String> linkedList = new LinkedList<>(words);

        // while this list is not empty, iterate/loop again
        while(!linkedList.isEmpty()){
            System.out.println(linkedList.remove());
        }
    }


    public void maps(){
        // create a hashMap
        HashMap<Integer, Long> speedDial = new HashMap<Integer, Long>();

        // let's add my wife to this speedDIal map
        speedDial.put(1, 5555555555L);
        System.out.println(speedDial);
        // retrieve the value tied to key 1
        System.out.println(speedDial.get(1));
        

    }
}
