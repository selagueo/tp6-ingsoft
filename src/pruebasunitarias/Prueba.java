package pruebasunitarias;

public class Prueba {

    public boolean noAgregarCantidadDeUnProductoAlCarritoMayorALaCantidadQueHayEnStock(int cantProducto, int stock) {
        return stock >= cantProducto;
    }

    public boolean elStockDelProductoDebeSerUnNumeroEntero(double stock) {
    //Se utiliza double como tipo de dato para poder hacer el test ya que si utilizamos int, no podremos ingresar numero decimales
        while (stock > 0) {
            stock = stock - 1;
        }
        return stock == 0;
    }
}
