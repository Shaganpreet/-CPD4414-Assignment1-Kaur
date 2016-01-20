/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd4414.assignment1.kaur;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0663932
 */
public class CPD4414Assignment1KaurTest {
    
    public CPD4414Assignment1KaurTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class CPD4414Assignment1Kaur.
     */
   

    /**
     * Test of stringPower method, of class CPD4414Assignment1Kaur.
     */
  
    @Test
      public void testLessThanOneShouldReturnNull(){
          System.out.println("testLessThanOneShouldReturnNull");
            String st = "";
        int i = 0;
        String expResult = null;
        String result = CPD4414Assignment1Kaur.stringPower(st, i);
        assertEquals(expResult, result);
        
    }
    
      @Test
  
    public void testStringAndOneShouldReturnString(){
          System.out.println("testStringAndOneShouldReturnString");
             String st = "hello";
        int i = 1;
        String expResult = "hello";
        String result = CPD4414Assignment1Kaur.stringPower(st, i);
        assertEquals(expResult, result);
        
    }
        
    @Test
    public void testStringAndTwoShouldReturnStringDoubled()
    {
        System.out.println("testStringAndTwoShouldReturnStringDoubled");
        String st = "bobbob";
        int i = 2;
        String result = "bobbob";
        String result1 = CPD4414Assignment1Kaur.stringPower(st,i);
        assertEquals(result,result1);
        
    }
    }


