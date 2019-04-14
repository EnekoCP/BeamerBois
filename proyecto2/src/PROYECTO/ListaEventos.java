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
	//public Enemigo (int pVida,int pDanno, int pVel,int pExperienciaSoltada, String pNombre)
	Enemigo ene1= new Enemigo(100,35,3,30,"Dante");
	//Asignaciones:
	EventoEstado evento0=new EventoEstado("Oca cero:",0,0,0,0);
	EventoEstado evento1=new EventoEstado("Oca Estado:",10,0,0,0);
	EventoCombate evento2=new EventoCombate("Te ha tocado un enemigo. ¿Que quieres hacer?",ene1);
	
	
	
	
	
	lista.add(evento0);
	lista.add(evento1);
	lista.add(evento2);
}

public void ejecutarEvento(int pId, Protagonista pProta){
	lista.get(pId).imprimirInfo();
	lista.get(pId).ejecutarEvento(pProta);
}

	//otros_metodos
}
