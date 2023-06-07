package ejerciciosClaseOcho;

public class NoHayStockException extends Exception {
	private final Producto producto;
	
	public Producto getProducto() {
		return this.producto;
	}
	
	public NoHayStockException(Producto producto) {
		this.producto = producto;
	}
}
