package pruebasunitarias;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class PruebaTest {
    
    public PruebaTest() {
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
     * Test of noAgregarCantidadDeUnProductoAlCarritoMayorALaCantidadQueHayEnStock method, of class Prueba.
     */
    @Test
    public void testNoAgregarCantidadDeUnProductoAlCarritoMayorALaCantidadQueHayEnStock() {
        System.out.println("noAgregarCantidadDeUnProductoAlCarritoMayorALaCantidadQueHayEnStock");
        int cantProducto = 5;
        int stock = 10;
        //Se utiliza una cantidad de producto mayor al stock para que el resultado de la prueba sea falsa
        Prueba instance = new Prueba();
        boolean expResult = true;
        boolean result = instance.noAgregarCantidadDeUnProductoAlCarritoMayorALaCantidadQueHayEnStock(cantProducto, stock);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of elStockDelProductoDebeSerUnNumeroEntero method, of class Prueba.
     */
    @Test
    public void testElStockDelProductoDebeSerUnNumeroEntero() {
        System.out.println("elStockDelProductoDebeSerUnNumeroEntero");
        double stock = 10;
        //Se utiliza un stock no entero para que el resultado de la prueba sea falso
        Prueba instance = new Prueba();
        boolean expResult = true;
        boolean result = instance.elStockDelProductoDebeSerUnNumeroEntero(stock);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
