package com.isba.word;

public abstract class Imagen {

	private Posicion posicion;
	private Color color;
	private Linea borde;
	
	public Imagen() {
	}

	public abstract void dibujar();

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Linea getBorde() {
		return borde;
	}

	public void setBorde(Linea borde) {
		this.borde = borde;
	}
}
