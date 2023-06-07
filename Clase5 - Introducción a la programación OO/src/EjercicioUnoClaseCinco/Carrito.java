package EjercicioUnoClaseCinco;

import java.time.LocalDateTime;

public class Carrito {
	Persona persona;
	ItemCarrito itemCarritoUno = null;
	ItemCarrito itemCarritoDos = null;
	ItemCarrito itemCarritoTres = null;
	LocalDateTime fechaDeCompra;
	Descuento descuento;
	
	public Carrito(Persona persona, ItemCarrito itemCarritoUno, ItemCarrito itemCarritoDos, ItemCarrito itemCarritoTres) {
		this.persona = persona;
		this.itemCarritoUno = itemCarritoUno;
		this.itemCarritoDos = itemCarritoDos;
		this.itemCarritoTres = itemCarritoTres;
		this.fechaDeCompra = LocalDateTime.now();
	}
	
	public Carrito() {}
	
	public double costoFinal() {
		double costoFinal = 0;
		if(itemCarritoUno != null) {
			costoFinal += itemCarritoUno.precio();
			if(itemCarritoDos != null) {
				costoFinal += itemCarritoDos.precio();
				if(itemCarritoTres != null) {
					costoFinal += itemCarritoTres.precio();
					}
			}
		}
		if(this.descuento != null) {
			return this.descuento.asignarDescuento(costoFinal, descuento.getValorDescuento());
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

	public void setDescuento(Descuento descuento) {
		this.descuento = descuento;
	}

	public ItemCarrito getItemCarritoUno() {
		return itemCarritoUno;
	}

	public void setItemCarrito(ItemCarrito itemCarrito) {
		if(this.itemCarritoUno == null) {
			this.itemCarritoUno = itemCarrito;
		}else if(this.itemCarritoDos == null) {
			this.itemCarritoDos = itemCarrito;
		}else if(this.itemCarritoTres == null) {
			this.itemCarritoTres = itemCarrito;
		}else {
			System.out.println("No se pueden agregar mas items");
		}
		
	}

	public ItemCarrito getItemCarritoDos() {
		return itemCarritoDos;
	}
	
	public ItemCarrito getItemCarritoTres() {
		return itemCarritoTres;
	}
	
}
