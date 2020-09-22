package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.web.clases.Luna;
import com.web.clases.Planeta;
import com.web.clases.SistemaSolar;

public class SistemaSolarTest {

	SistemaSolar sistemaSolar;
	ArrayList<Planeta> planetas;
	Planeta planeta;
	Luna luna1;
	Luna luna2;
	
	@Before
	public void setUp() {
		sistemaSolar = new SistemaSolar();
		planetas = new ArrayList<Planeta>();
		
		planeta = new Planeta ("Saturno", 108728, 1429400000);
		luna1 = new Luna("Aegir", 20735000, 6);
		luna2 = new Luna("Albiorix", 16392000, 30);
		
		planeta.addLuna(luna1);
		planeta.addLuna(luna2);
		planetas.add(planeta);
		
		sistemaSolar.setPlanetas(planetas);
	}
	
	@Test
	public void comprovarCantidadLunasPorPlaneta() {
		assertEquals(2, sistemaSolar.getPlanetas().get(0).getLunas().size());
	}
	
	@Test
	public void comprovarNombreDePlaneta() {
		assertTrue("Saturno".equals(sistemaSolar.getPlanetas().get(0).getNombre()));
	}
	
	@Test
	public void comprovarNombreDeLuna() {
		assertTrue("Aegir".equals(sistemaSolar.getPlanetas().get(0).getLunas().get(0).getNombre()));
	}
	
	@Test
	public void comprovarCantidadPlanetas() {
		assertEquals(1, sistemaSolar.getPlanetas().size());
	}
	
	
}
