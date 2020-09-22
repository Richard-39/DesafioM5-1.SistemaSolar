package com.web.clases;

import java.util.ArrayList;

public class SistemaSolar {

	private ArrayList<Planeta> planetas = new ArrayList<Planeta>();

	
	public SistemaSolar(ArrayList<Planeta> planetas) {
		super();
		this.planetas = planetas;
	}
	
	public SistemaSolar() {
	}
	

	public ArrayList<Planeta> getPlanetas() {
		return planetas;
	}

	public void setPlanetas(ArrayList<Planeta> planetas) {
		this.planetas = planetas;
	}
	
	
	public void mostrarInfoPlanetas() {
		for (Planeta planeta : planetas) {
			System.out.println(planeta.toString());
			
		}
	}
	
	public void mostrarInfoPlanetasYLunas() {
		for (Planeta planeta : planetas) {
			System.out.println(planeta.toString());
			for (Luna luna : planeta.getLunas()) {
				System.out.println(luna.toString());
			}
			System.out.println();
		}
	}
}
