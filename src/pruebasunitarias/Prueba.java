package pruebasunitarias;

public class Prueba {

    public boolean noAgregarCantidadDeUnProductoAlCarritoMayorALaCantidadQueHayEnStock(int cantProducto, int stock) {
        return stock >= cantProducto;
    }

    public boolean elStockDelProductoDebeSerUnNumeroEntero(Integer stock) {
        //Se utiliza Integer como tipo de dato para poder hacer el test ya que si utilizamos int, no podremos ingresar numero decimales
        while (stock > 0) {
            stock = stock - 1;
        }
        return stock == 0;
    }

    public boolean elPrecioUnitarioDelProductoNoPuedeSerNegativo(Integer precio) {
        return precio < 0;
    }

    public int descontarUnaUnidadAlCarritoAlEliminarUnProducto(int cantProdCarrito) {
        return (cantProdCarrito - 1);
    }

    public double descontarMontoDelSubtotalDelCarritoAlEliminarUnProducto(double subtotalCarrito, double precioProducto) {
        return (subtotalCarrito - precioProducto);
    }

    public boolean elStockNoPuedeSerUnNumeroNegativo(int stock) {
        return stock >= 0;
    }

    public boolean elPrecioUnitarioDelProductoNoPuedeSerCero(double precio) {
        return precio == 0;
    }

    public String noSeCrearaElDetalleDeLaFacturaSiNoExisteElCampoCantidadYProducto(Integer cantidad, Integer producto) {
        if (cantidad == null || producto == null) {
            return "No se creo el detalle de factura";
        } else {
            return "Se creo el detalle de la factura";
        }
    }

    public String elProductoAgregadoAlCarritoDebeTenerUnNombre(String producto) {
        if (producto == null) {
            return "No se puede agregar un producto sin nombre";
        } else {
            return "Se agrego el producto al carrito";
        }
    }

    public Integer alRealizarLaCompraSeDebeRestarLaCantidadDeLosProductosDelStockDisponible(String estadoDeCompra, Integer stockProducto, Integer cantidadProducto) {

        if (estadoDeCompra == "Realizada") {
            return (stockProducto = stockProducto - cantidadProducto);
        }
        return 0;

    }

    public Double sumarPrecioProductoAlSubtotal(Integer producto, Double precioProducto, Double subtotal) {
        if (producto != null) {
            return subtotal + precioProducto;
        }
        return subtotal;
    }

    public String agregarAlCarritoCheckearDesc(String producto, String descripcion) {
        if (descripcion == null) {
            return "No se puede agregar al carrito";
        } else {
            return "Se agrego el producto al carrito";
        }
    }
}
