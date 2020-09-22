package com.web.clases;

import com.web.interfaces.ILuna;

public class Luna implements ILuna{

	private String nombre;
	private float diametro;
	private float tiempoOrbita;
	
	public Luna(String nombre, float diametro, float tiempoOrbita) {
		super();
		this.nombre = nombre;
		this.diametro = diametro;
		this.tiempoOrbita = tiempoOrbita;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getDiametro() {
		return diametro;
	}

	public void setDiametro(float diametro) {
		this.diametro = diametro;
	}

	public float getTiempoOrbita() {
		return tiempoOrbita;
	}

	public void setTiempoOrbita(float tiempoOrbita) {
		this.tiempoOrbita = tiempoOrbita;
	}

	@Override
	public String toString() {
		return "Luna de nombre " + getNombre() + " que mide " + getDiametro() + " km de diámetro y el tiempo de órbita es de " + getTiempoOrbita() + " días.";
	}
	
	
	
}
