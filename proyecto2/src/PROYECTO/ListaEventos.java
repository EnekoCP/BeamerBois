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
	Enemigo ene2= new Enemigo(120,70,2,60,"XXX");
	Enemigo ene3= new Enemigo(135,40,1,45,"Easy");
	Enemigo ene4= new Enemigo(220,70,4,70,"Medium");
	Enemigo ene5= new Enemigo(150,45,5,45,"Lunatico");
	Enemigo ene6= new Enemigo(205,60,7,60,"Virus");
	Enemigo ene7= new Enemigo(215,50,3,70,"Dante 2.0");
	Enemigo ene8= new Enemigo(250,60,6,80,"Integral Indefinda");
	Enemigo ene9= new Enemigo(150,40,5,45,"Numeros Complejos");
	Enemigo ene10= new Enemigo(300,90,8,100,"Calculo");
	Enemigo ene11= new Enemigo(400,90,8,120,"Calculo en Julio");
	
	
	//Asignaciones:
	EventoEstado evento1=new EventoEstado("Oca cero:",0,0,0,0);
	EventoEstado evento2=new EventoEstado("Oca Estado:",50,0,0,10);	
	EventoCombate evento3=new EventoCombate("Te ha tocado un enemigo. ¿Que quieres hacer?",ene1);
	EventoMovimiento evento4=new EventoMovimiento("Oca Posicion: Avanzas 2 casillas...",2);
	EventoEstado evento5=new EventoEstado("Oca Estado:",0,0,0,15);
	EventoCombate evento6=new EventoCombate("Te ha tocado un enemigo. ¿Que quieres hacer?",ene2);
	EventoEstado evento7=new EventoEstado("Oca Estado:",-5,0,0,0);
	EventoEstado evento8=new EventoEstado("Casilla Vacia, tira de nuevo el dado :)",0,0,0,0);
	EventoEstado evento9=new EventoEstado("Oca Estado:",0,0,0,15);
	EventoMovimiento evento10=new EventoMovimiento("Oca Posicion: Avanzas 1 casilla...",1);
	EventoCombate evento11=new EventoCombate("Te ha tocado un enemigo. ¿Que quieres hacer?",ene3);
	EventoEstado evento12=new EventoEstado("Oca Estado:",20,0,15,0);
	EventoCombate evento13=new EventoCombate("Te ha tocado un enemigo. ¿Que quieres hacer?",ene4);
	EventoMovimiento evento14=new EventoMovimiento("Oca Posicion: Retrocedes 5 casillas...",-5);
	EventoEstado evento15=new EventoEstado("Oca Estado:",0,3,0,0);
	EventoEstado evento16=new EventoEstado("Casilla Vacia, tira de nuevo el dado :)",0,0,0,0);
	EventoCombate evento17=new EventoCombate("Te ha tocado un enemigo. ¿Que quieres hacer?",ene5);
	EventoEstado evento18=new EventoEstado("Oca Estado:",30,0,0,30);
	EventoMovimiento evento19=new EventoMovimiento("Oca Posicion: Retrocedes 1 casilla...",1);
	EventoEstado evento20=new EventoEstado("Casilla Vacia, tira de nuevo el dado :)",0,0,0,0);
	EventoCombate evento21=new EventoCombate("Te ha tocado un enemigo. ¿Que quieres hacer?",ene6);
	EventoEstado evento22=new EventoEstado("Oca Estado:",20,10,15,40);
	EventoCombate evento23=new EventoCombate("Te ha tocado un enemigo. ¿Que quieres hacer?",ene7);
	EventoMovimiento evento24=new EventoMovimiento("Oca Posicion: Retrocedes 4 casillas...",-4);
	EventoCombate evento25=new EventoCombate("Te ha tocado un enemigo. ¿Que quieres hacer?",ene8);
	EventoEstado evento26=new EventoEstado("Oca Estado:",20,0,0,30);
	EventoCombate evento27=new EventoCombate("Te ha tocado un enemigo. ¿Que quieres hacer?",ene9);
	EventoEstado evento28=new EventoEstado("Oca Estado:",30,1,0,50);
	EventoMovimiento evento29=new EventoMovimiento("Oca Posicion: Retrocedes 12 casillas...",-12);
	EventoCombate evento30=new EventoCombate("Combate Final, ¡Suerte!. ¿Que quieres hacer?",ene10);
	EventoCombate evento31=new EventoCombate("Combate Final de los FINALES. ¿Que quieres hacer?",ene11);
	
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
	lista.add(evento16);
	lista.add(evento17);
	lista.add(evento18);
	lista.add(evento19);
	lista.add(evento20);
	lista.add(evento21);
	lista.add(evento22);
	lista.add(evento23);
	lista.add(evento24);
	lista.add(evento25);
	lista.add(evento26);
	lista.add(evento27);
	lista.add(evento28);
	lista.add(evento29);
	lista.add(evento30);
	lista.add(evento31);
	
}

public void ejecutarEvento(int pId, Protagonista pProta) throws ProtaHaMuertoExcepcion, ProtaHaGanadoExcepcion{
	lista.get(pId).imprimirInfo();
	lista.get(pId).ejecutarEvento(pProta);
}

	
}
