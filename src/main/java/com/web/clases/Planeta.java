package com.web.clases;

import java.util.ArrayList;

import com.web.interfaces.IPlaneta;

public class Planeta implements IPlaneta {

	private String nombre;
	private float tama�o;
	private float distanciaSol;
	private ArrayList<Luna> lunas = new ArrayList<Luna>();
	
	public Planeta(String nombre, float tama�o, float distanciaSol, ArrayList<Luna> lunas) {
		super();
		this.nombre = nombre;
		this.tama�o = tama�o;
		this.distanciaSol = distanciaSol;
		this.lunas = lunas;
	}
	
	public Planeta(String nombre, float tama�o, float distanciaSol) {
		super();
		this.nombre = nombre;
		this.tama�o = tama�o;
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
	public float getTama�o() {
		return tama�o;
	}
	public void setTama�o(float tama�o) {
		this.tama�o = tama�o;
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
		return "La "+ getNombre() + " est� a " + getDist_sol() + " km del sol, su tama�o es de " + getTama�o() + " km de di�metro y tiene " + getLunas().size() + " " + lunaOlunas();
	}
	
}
