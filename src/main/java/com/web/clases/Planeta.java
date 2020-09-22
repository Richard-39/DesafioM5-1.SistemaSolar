package com.web.clases;

import java.util.ArrayList;

import com.web.interfaces.IPlaneta;

public class Planeta implements IPlaneta {

	private String nombre;
	private float tamaño;
	private float distanciaSol;
	private ArrayList<Luna> lunas = new ArrayList<Luna>();
	
	public Planeta(String nombre, float tamaño, float distanciaSol, ArrayList<Luna> lunas) {
		super();
		this.nombre = nombre;
		this.tamaño = tamaño;
		this.distanciaSol = distanciaSol;
		this.lunas = lunas;
	}
	
	public Planeta(String nombre, float tamaño, float distanciaSol) {
		super();
		this.nombre = nombre;
		this.tamaño = tamaño;
		this.distanciaSol = distanciaSol;
	}
	
	public Planeta() {

	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getTamaño() {
		return tamaño;
	}
	public void setTamaño(float tamaño) {
		this.tamaño = tamaño;
	}
	public float getDist_sol() {
		return distanciaSol;
	}
	public void setDist_sol(float dist_sol) {
		this.distanciaSol = dist_sol;
	}
	public ArrayList<Luna> getLunas() {
		return lunas;
	}
	public void setLunas(ArrayList<Luna> lunas) {
		this.lunas = lunas;
	}
	
	public void addLuna(Luna luna) {
		lunas.add(luna);
	}
	
	private String lunaOlunas() {
		if(getLunas().size()==1) {
			return "luna";
		}
		return "lunas";
	}
	
	@Override
	public String toString() {
		return "La "+ getNombre() + " está a " + getDist_sol() + " km del sol, su tamaño es de " + getTamaño() + " km de diámetro y tiene " + getLunas().size() + " " + lunaOlunas();
	}
	
}
