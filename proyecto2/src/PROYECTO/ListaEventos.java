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
	Enemigo ene2= new Enemigo(200,70,6,60,"XXX");
	Enemigo ene3= new Enemigo(150,40,5,45,"Easy");
	Enemigo ene4= new Enemigo(300,85,8,20,"Medium");
	
	
	//Asignaciones:
	EventoEstado evento0=new EventoEstado("Oca cero:",0,0,0,0);
	EventoEstado evento1=new EventoEstado("Oca Estado:",10,0,0,0);
	EventoCombate evento2=new EventoCombate("Te ha tocado un enemigo. ¿Que quieres hacer?",ene1);
	EventoMovimiento evento3=new EventoMovimiento("Oca Posicion:",2);
	EventoEstado evento4=new EventoEstado("Oca Estado:",0,0,0,15);
	EventoCombate evento5=new EventoCombate("Te ha tocado un enemigo. ¿Que quieres hacer?",ene2);
	EventoEstado evento6=new EventoEstado("Oca Estado:",-5,0,0,0);
	EventoEstado evento7=new EventoEstado("Casilla Vacia:",0,0,0,0);
	EventoEstado evento8=new EventoEstado("Oca Estado:",0,0,0,15);
	EventoMovimiento evento9=new EventoMovimiento("Oca Posicion:",1);
	EventoCombate evento10=new EventoCombate("Te ha tocado un enemigo. ¿Que quieres hacer?",ene3);
	EventoEstado evento11=new EventoEstado("Oca Estado:",10,0,15,0);
	EventoCombate evento12=new EventoCombate("Te ha tocado un enemigo. ¿Que quieres hacer?",ene4);
	EventoMovimiento evento13=new EventoMovimiento("Oca Posicion:",-5);
	EventoEstado evento14=new EventoEstado("Oca Estado:",0,2,0,0);
	EventoEstado evento15=new EventoEstado("Casilla Vacia:",0,0,0,0);
	
	lista.add(evento0);
	lista.add(evento1);
	lista.add(evento2);
	lista.add(evento3);
	lista.add(evento4);
	lista.add(evento5);
	lista.add(evento6);
	lista.add(evento7);
	lista.add(evento8);
	lista.add(evento9);
	lista.add(evento10);
	lista.add(evento11);
	lista.add(evento12);
	lista.add(evento13);
	lista.add(evento14);
	lista.add(evento15);
}

public void ejecutarEvento(int pId, Protagonista pProta){
	lista.get(pId).imprimirInfo();
	lista.get(pId).ejecutarEvento(pProta);
}

	//otros_metodos
}
