package com.example.c4q.buzzfeed;

import android.graphics.drawable.Drawable;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


/**
 * Created by c4q on 11/18/17.
 */

public class TestClass {

    @Test
    public void addShouldWorkForCustomTest(){
        assertEquals(5,CustomMath.add(2,3));
    }
    @Test
    public void TestAdapter(){
        List<Quiz> quizTest= new ArrayList<>();
        CustomAdapter adapter=new CustomAdapter(quizTest);
        assertNotNull(adapter);
    }
}
