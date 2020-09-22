package com.web.main;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.web.clases.Luna;
import com.web.clases.Planeta;
import com.web.clases.SistemaSolar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SistemaSolar sistemaSolar = new SistemaSolar();
		ArrayList<Planeta> planetas = new ArrayList<Planeta>();
		
		Planeta tierra = new Planeta("Tierra", 12756, 149600000);
		tierra.addLuna(new Luna("Luna", 3476, 27322));
		
		Planeta marte = new Planeta("Marte", 6794, 227940000);
		marte.addLuna(new Luna("Deimos", 8, 1263));
		marte.addLuna(new Luna("Phobos", 28 , 0.319f));
		
		Planeta mercurio = new Planeta("Mercurio", 4880, 57910000);
		
		Planeta venus = new Planeta("Venus", 12104, 108200000);
		
		Planeta jupiter = new Planeta("Júpiter", 142984, 778330000);
		jupiter.addLuna(new Luna("Adrastea", 128980, 26));
		jupiter.addLuna(new Luna("Aitne", 23547000, 3));
		
		Planeta saturno = new Planeta("Saturno", 108728, 1429400000);
		saturno.addLuna(new Luna("Aegir", 20735000, 6));
		saturno.addLuna(new Luna("Albiorix", 16392000, 30));
				
		Planeta urano = new Planeta("Urano", 51118, 2870990000f);
		urano.addLuna(new Luna("Ariel", 191240, 1160));
		urano.addLuna(new Luna("Belinda", 75260, 66));
		
		Planeta neptuno = new Planeta("Neptuno", 49532, 4504300000f);
		neptuno.addLuna(new Luna("Despina", 62000, 160));
		neptuno.addLuna(new Luna("Galatea", 52500, 140));
		
		planetas.add(tierra);
		planetas.add(marte);
		planetas.add(mercurio);
		planetas.add(venus);
		planetas.add(jupiter);
		planetas.add(saturno);
		planetas.add(urano);
		planetas.add(neptuno);
		
		sistemaSolar.setPlanetas(planetas);
		
		
		sistemaSolar.mostrarInfoPlanetas();
		System.out.println();
		sistemaSolar.mostrarInfoPlanetasYLunas();
	}
}
