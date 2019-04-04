package PROYECTO;

import java.util.ArrayList;

public class ListaEventos {
	//atributos 
	private ArrayList<Evento> lista;
	private static ListaEventos milista=null;;
	//constructura
private ListaEventos(){
	lista=new ArrayList<Evento>();
	incializarEvento();
}

public static ListaEventos getListaEventos(){
	if(milista==null){
		milista=new ListaEventos();
	}
	return milista;
}

private void incializarEvento(){
	//EventoEstado(String pDescripcion,int pVida,int pVelocidad,int pExp,int pDano)
	//Asignaciones:
	EventoEstado evento1=new EventoEstado("Oca Estado:",10,0,0,0);
	
	
	
	
	
	
	
	lista.add(evento1);
}

public void ejecutarEvento(int pId, Protagonista pProta){
	lista.get(pId).imprimirInfo();
	lista.get(pId).ejecutarEvento(pProta);
}

	//otros_metodos
}
