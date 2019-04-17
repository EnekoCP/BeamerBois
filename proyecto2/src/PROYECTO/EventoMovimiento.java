package PROYECTO;

public class EventoMovimiento extends Evento {
	//atributos 
	private int posicion=0;
	//constructura
	public EventoMovimiento(String pDescripcion,int pPosicion){
		super(pDescripcion);
		this.posicion=pPosicion;
	}
	
	public void ejecutarEvento(Personaje pPersonaje){}
	
}
