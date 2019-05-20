package com.isba.arbol2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ElementoArbol {

	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	private Date fechaCasamiento;
	private Date fechaFallecimiento;
	private List<RelacionElemento> relaciones;
	
	public List<RelacionElemento> getRelacionados(TipoRelacion relacionBuscada) {
		return new ArrayList<RelacionElemento>();
	}
	
	
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
	public List<RelacionElemento> getRelaciones() {
		return relaciones;
	}
	public void setRelaciones(List<RelacionElemento> relaciones) {
		this.relaciones = relaciones;
	}
	

}
