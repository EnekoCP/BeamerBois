package PROYECTO;

import java.util.ArrayList;

public class EventoCambate extends Evento {
	//atributos 
	private Enemigo enemigo=null;
	
	//constructura
	public EventoCambate(String pDisc, Enemigo pEne){
		super(pDisc);
		enemigo=pEne;
	}
	//otros_metodos
	public void ejecutarEvento(Personaje pPersonaje){
	}
	private void combatir(Personaje pPersonaje){}
	
}
