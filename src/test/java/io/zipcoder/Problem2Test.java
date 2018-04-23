package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem2Test {

    @Test
    public void sequenceTest(){
        //given
        int n = 150;

        //when
        String actual = Problem2.fibonacciIteration(n);
        String expected = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sequenceTesTwo(){
        //given
        int n = 50;

        //when
        String actual = Problem2.fibonacciIteration(n);
        String expected = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34";

        //then
        Assert.assertEquals(expected, actual);
    }


}
