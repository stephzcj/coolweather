package com.coolweather.android;

import com.coolweather.android.util.Log;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void testlog(){
        try {
            int a=6/0;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}