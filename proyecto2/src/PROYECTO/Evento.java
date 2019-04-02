package PROYECTO;

abstract class Evento {
	private String Descripcion;
	
public Evento (String pDescripcion){
	Descripcion=pDescripcion;
}

public void ejecutarEvento(Protagonista pProta){}

}
// He pensado aplicar en Patron Singleton en las listas de cada tipo de evento por que a la hora de inicializar cada evento temenos que acceder de 
// forma individual a cada uno de ello;