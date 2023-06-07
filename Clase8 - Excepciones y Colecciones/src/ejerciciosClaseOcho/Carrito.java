package ejerciciosClaseOcho;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public class Carrito {
	private Persona persona;
	private List<ItemCarrito>itemsCarrito;
	private LocalDateTime fechaDeCompra;
	private Descuento descuento;
	private double costoFinal;
	
	
	public Carrito(Persona persona, List<ItemCarrito> itemsCarrito, LocalDateTime fechaDeCompra, Descuento descuento) {
		super();
		this.persona = persona;
		this.itemsCarrito = itemsCarrito;
		this.fechaDeCompra = fechaDeCompra;
		this.descuento = descuento;
		this.costoFinal = 0;
	}

	public Carrito() {
		this.itemsCarrito = new ArrayList<>();
		this.costoFinal = 0;
	}
	
	public double costoFinalSinDescuentos() {
		costoFinal = 0;
		for(ItemCarrito item : itemsCarrito) {
			costoFinal += item.precio();
		}
		if(this.descuento != null) {
			costoFinal = this.descuento.asignarDescuento();
		}
		return costoFinal;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public LocalDateTime getFechaDeCompra() {
		return fechaDeCompra;
	}

	public void setFechaDeCompra(LocalDateTime fechaDeCompra) {
		this.fechaDeCompra = fechaDeCompra;
	}

	public Descuento getDescuento() {
		return descuento;
	}

	public void setDescuento(Descuento descuento) throws CarritoCeroException, MontoConDescuentoNegativoException{
		if(this.costoFinalSinDescuentos() == 0) {
			throw new CarritoCeroException("El valor del carrito es igual a cero, por ende no se puede aplicar el descuento");
		}else if( descuento.asignarDescuento() < 0){
			throw new MontoConDescuentoNegativoException("El monto con el descuento es negativo, por ende no se puede aplicar el descuento");
		}else{
			this.costoFinal = descuento.asignarDescuento();
		}
		
		
	}

	public List<ItemCarrito> getListItemsCarrito() {
		return itemsCarrito;
	}

	public void setItemsCarritoList(List<ItemCarrito> itemsCarrito) {
		this.itemsCarrito = itemsCarrito;
	}
	
	public void setItemCarrito(ItemCarrito itemCarrito) {
		this.itemsCarrito.add(itemCarrito);
	}

	public double getCostoFinal() {
		return costoFinal;
	}

	
}
