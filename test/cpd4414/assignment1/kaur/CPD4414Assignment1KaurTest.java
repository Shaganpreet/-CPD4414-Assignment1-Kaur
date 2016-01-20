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
    public void testStringPower() {
        System.out.println("stringPower");
        String st = "";
        int i = 0;
        String expResult = "";
        String result = CPD4414Assignment1Kaur.stringPower(st, i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }
    @Test
    public void testEmptyStringShouldReturnEmptyString(){
        
    }
}
