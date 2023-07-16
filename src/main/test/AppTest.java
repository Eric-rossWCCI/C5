package main.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import main.java.App;

public class AppTest {

    @Test
    public void testReturnSize() {
        // invoke the returnSize method with a list and make sure it returns the
        // correct value
        List<Integer> integers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        App app = new App();
        
        Assert.assertEquals(5, app.returnSize(integers));

    }


    @Test
    public void testUsernameInput_failsBothRequirements(){
        App app = new App();
        Assert.assertEquals("", app.usernaming("eric"));
        
    }
    @Test
    public void testUsernameInput_passes(){
        App app = new App();
        Assert.assertEquals("Good job on the username selection", app.usernaming("ericcode"));
        
    }


    @Test
    public void testUsernameInput_failsDueToLength(){
        App app = new App();
        Assert.assertEquals("Sorry, your username doesn't meet the length requirements", app.usernaming("code"));
    }
}
