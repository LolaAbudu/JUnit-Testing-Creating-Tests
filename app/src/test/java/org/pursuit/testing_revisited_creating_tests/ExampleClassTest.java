package org.pursuit.testing_revisited_creating_tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExampleClassTest {

    @Before
    public void setup(){}

    @After
    public void breakdown(){

    }

    @Test
    public void someTest(){
        int result = 1+1;

        Assert.assertEquals(2,result);
        Assert.assertNotEquals(3, result);
    }
}
