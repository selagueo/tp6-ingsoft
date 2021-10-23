
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

    @Test
    public void testNoAgregarCantidadDeUnProductoAlCarritoMayorALaCantidadQueHayEnStock() {
        System.out.println("noAgregarCantidadDeUnProductoAlCarritoMayorALaCantidadQueHayEnStock");
        int cantProducto = 5;
        int stock = 10;
        Prueba instance = new Prueba();
        boolean expResult = true;
        boolean result = instance.noAgregarCantidadDeUnProductoAlCarritoMayorALaCantidadQueHayEnStock(cantProducto, stock);
        assertEquals(expResult, result);
    }

    @Test
    public void testElStockDelProductoDebeSerUnNumeroEntero() {
        System.out.println("elStockDelProductoDebeSerUnNumeroEntero");
        Integer stock = 5;
        Prueba instance = new Prueba();
        boolean expResult = true;
        boolean result = instance.elStockDelProductoDebeSerUnNumeroEntero(stock);
        assertEquals(expResult, result);
    }

    @Test
    public void testElPrecioUnitarioDelProductoNoPuedeSerNegativo() {
        System.out.println("elPrecioUnitarioDelProductoNoPuedeSerNegativo");
        Integer precio = 35;
        Prueba instance = new Prueba();
        boolean expResult = false;
        boolean result = instance.elPrecioUnitarioDelProductoNoPuedeSerNegativo(precio);
        assertEquals(expResult, result);
    }

    @Test
    public void testDescontarUnaUnidadAlCarritoAlEliminarUnProducto() {
        System.out.println("descontarUnaUnidadAlCarritoAlEliminarUnProducto");
        int cantProdCarrito = 4;
        Prueba instance = new Prueba();
        int expResult = 3;
        int result = instance.descontarUnaUnidadAlCarritoAlEliminarUnProducto(cantProdCarrito);
        assertEquals(expResult, result);
    }

    @Test
    public void testDescontarMontoDelSubtotalDelCarritoAlEliminarUnProducto() {
        System.out.println("descontarMontoDelSubtotalDelCarritoAlEliminarUnProducto");
        double subtotalCarrito = 500.0;
        double precioProducto = 50.0;
        Prueba instance = new Prueba();
        double expResult = 450.0;
        double result = instance.descontarMontoDelSubtotalDelCarritoAlEliminarUnProducto(subtotalCarrito, precioProducto);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testElStockNoPuedeSerUnNumeroNegativo() {
        System.out.println("elStockNoPuedeSerUnNumeroNegativo");
        int stock = 2;
        Prueba instance = new Prueba();
        boolean expResult = true;
        boolean result = instance.elStockNoPuedeSerUnNumeroNegativo(stock);
        assertEquals(expResult, result);
    }

    @Test
    public void testElPrecioUnitarioDelProductoNoPuedeSerCero() {
        System.out.println("elPrecioUnitarioDelProductoNoPuedeSerCero");
        double precio = 500.0;
        Prueba instance = new Prueba();
        boolean expResult = false;
        boolean result = instance.elPrecioUnitarioDelProductoNoPuedeSerCero(precio);
        assertEquals(expResult, result);
    }

    @Test
    public void testNoSeCrearaElDetalleDeLaFacturaSiNoExisteElCampoCantidadYProducto() {
        System.out.println("noSeCrearaElDetalleDeLaFacturaSiNoExisteElCampoCantidadYProducto");
        Integer cantidad = null;
        Integer producto = null;
        Prueba instance = new Prueba();
        String expResult = "No se creo el detalle de factura";
        String result = instance.noSeCrearaElDetalleDeLaFacturaSiNoExisteElCampoCantidadYProducto(cantidad, producto);
        assertEquals(expResult, result);
    }

    @Test
    public void testElProductoAgregadoAlCarritoDebeTenerUnNombre() {
        System.out.println("elProductoAgregadoAlCarritoDebeTenerUnNombre");
        String producto = null;
        Prueba instance = new Prueba();
        String expResult = "No se puede agregar un producto sin nombre";
        String result = instance.elProductoAgregadoAlCarritoDebeTenerUnNombre(producto);
        assertEquals(expResult, result);
    }

    @Test
    public void testAlRealizarLaCompraSeDebeRestarLaCantidadDeLosProductosDelStockDisponible() {
        System.out.println("alRealizarLaCompraSeDebeRestarLaCantidadDeLosProductosDelStockDisponible");
        String estadoDeCompra = "Realizada";
        Integer stockProducto = 125;
        Integer cantidadProducto = 3;
        Prueba instance = new Prueba();
        Integer expResult = 122;
        Integer result = instance.alRealizarLaCompraSeDebeRestarLaCantidadDeLosProductosDelStockDisponible(estadoDeCompra, stockProducto, cantidadProducto);
        assertEquals(expResult, result);
    }

    @Test
    public void testSumarPrecioProductoAlSubtotal() {
        System.out.println("sumarPrecioProductoAlSubtotal");
        Integer producto = 1;
        Double precioProducto = 30.00;
        Double subtotal = 330.00;
        Prueba instance = new Prueba();
        Double expResult = 360.00;
        Double result = instance.sumarPrecioProductoAlSubtotal(producto, precioProducto, subtotal);
        assertEquals(expResult, result);
    }

    @Test
    public void testAgregarAlCarritoCheckearDesc() {
        System.out.println("agregarAlCarritoCheckearDesc");
        String producto = "Celular";
        String descripcion = null;
        Prueba instance = new Prueba();
        String expResult = "No se puede agregar al carrito";
        String result = instance.agregarAlCarritoCheckearDesc(producto, descripcion);
        assertEquals(expResult, result);
    }
    
}
