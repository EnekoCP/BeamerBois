package PROYECTO;

import java.util.*;

public class Tablero {
	private ArrayList<Casilla> lista;
	private static int CantCasillas = 20;
	private int posicion=0;
	private static Tablero miTablero=null;
	

private Tablero(){
	this.lista=new ArrayList<Casilla>();
	inicializarCasilla();
}

public static Tablero getmiTablero(){
	if(miTablero==null){
		miTablero=new Tablero();
	}
	return miTablero;
}


private void inicializarCasilla(){
	// Por defecto la idVento de las casillas será igual a nombre. Para futuros cambios,
	// utilizamos el metodo setEvento
	
	Casilla c0= new Casilla(0);
	Casilla c1= new Casilla(1);
	Casilla c2= new Casilla(2);
	Casilla c3= new Casilla(3);
	Casilla c4= new Casilla(4);
	Casilla c5= new Casilla(5);
	Casilla c6= new Casilla(6);
	Casilla c7= new Casilla(7);
	Casilla c8= new Casilla(8);
	Casilla c9= new Casilla(9);
	Casilla c10= new Casilla(10);
	Casilla c11= new Casilla(11);
	Casilla c12= new Casilla(12);
	Casilla c13= new Casilla(13);
	Casilla c14= new Casilla(14);
	Casilla c15= new Casilla(15);
	Casilla c16= new Casilla(16);
	Casilla c17= new Casilla(17);
	Casilla c18= new Casilla(18);
	Casilla c19= new Casilla(19);
	
	lista.add(c0);
	lista.add(c1);
	lista.add(c2);
	lista.add(c3);
	lista.add(c4);
	lista.add(c5);
	lista.add(c6);
	lista.add(c7);
	lista.add(c8);
	lista.add(c9);
	lista.add(c10);
	lista.add(c11);
	lista.add(c12);
	lista.add(c13);
	lista.add(c14);
	lista.add(c15);
	lista.add(c16);
	lista.add(c17);
	lista.add(c18);
	lista.add(c19);
	}

private boolean ComprobarTablero(){
	return (posicion<=CantCasillas);
}

public void moverse(int pValorDado,Protagonista pProta){
	posicion=posicion+pValorDado;
	lista.get(posicion).CargarCasilla(pProta);
}
	
}





