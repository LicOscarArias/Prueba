package com.isba.arbol;

import java.util.Date;
import java.util.List;

public class ElementoArbol {

	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	private Date fechaCasamiento;
	private Date fechaFallecimiento;
	private ElementoArbol padre;
	private ElementoArbol madre;
	private List<ElementoArbol> hijos;
	private List<ElementoArbol> hermanos;
	private ElementoArbol pareja;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Date getFechaCasamiento() {
		return fechaCasamiento;
	}
	public void setFechaCasamiento(Date fechaCasamiento) {
		this.fechaCasamiento = fechaCasamiento;
	}
	public Date getFechaFallecimiento() {
		return fechaFallecimiento;
	}
	public void setFechaFallecimiento(Date fechaFallecimiento) {
		this.fechaFallecimiento = fechaFallecimiento;
	}
	public ElementoArbol getPadre() {
		return padre;
	}
	public void setPadre(ElementoArbol padre) {
		this.padre = padre;
	}
	public ElementoArbol getMadre() {
		return madre;
	}
	public void setMadre(ElementoArbol madre) {
		this.madre = madre;
	}
	public List<ElementoArbol> getHijos() {
		return hijos;
	}
	public void setHijos(List<ElementoArbol> hijos) {
		this.hijos = hijos;
	}
	public List<ElementoArbol> getHermanos() {
		return hermanos;
	}
	public void setHermanos(List<ElementoArbol> hermanos) {
		this.hermanos = hermanos;
	}
	public ElementoArbol getPareja() {
		return pareja;
	}
	public void setPareja(ElementoArbol pareja) {
		this.pareja = pareja;
	}
	

}
