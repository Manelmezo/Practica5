/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package practica.pkg5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author manel
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
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
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        int x = 0;
        int y = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.suma(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
            if (result !=expResult){
        
        fail("The test case is a prototype.");
        }   
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        int x = 0;
        int y = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.resta(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
            if (result !=expResult){
        
        fail("The test case is a prototype.");
        }   
    }

    /**
     * Test of multplicacion method, of class Calculadora.
     */
    @Test
    public void testMultplicacion() {
        System.out.println("multplicacion");
        int x = 0;
        int y = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.multplicacion(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
            if (result !=expResult){
        
        fail("The test case is a prototype.");
        }   
    }

    /**
     * Test of division method, of class Calculadora.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        int x = 2;
        int y = 1;
        Calculadora instance = new Calculadora();
        int expResult = 2;
        int result = instance.division(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
            if (result !=expResult){
        
        fail("The test case is a prototype.");
        }   
    }
    
}
