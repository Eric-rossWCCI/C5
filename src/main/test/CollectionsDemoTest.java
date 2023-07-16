package main.test;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import main.java.CollectionsDemo;

public class CollectionsDemoTest {

    @Test
    public void testLooping() {
        // create list that we'll use to compare the result of invoking the looping method
        List<String> words = Arrays.asList("IAdded", "haveAdded", "collectionsAdded", "youAdded", "haveAdded", "collectionsAdded");
        CollectionsDemo collectionsDemo = new CollectionsDemo();
        List<String> result = collectionsDemo.looping();
        Assert.assertEquals(words, result);
    }
}

/*
 * update method to return a list and to remove all items from local variable list
 * Write test to verify that this method returns an empty list
 */
