package PROYECTO;

import java.util.*;

public class Tablero {
	private ArrayList<Casilla> lista;
	private static int CantCasillas = 20;
	private int posicion=0;
	private static Tablero miTablero=null;
	

private Tablero(){
	this.lista=new ArrayList<Casilla>();
}

public static Tablero getmiTablero(){
	if(miTablero==null){
		miTablero=new Tablero();
	}
	return miTablero;
}


private void inicializarCasilla(){

	//Casilla c1= new Casilla();
	//lista.add(c1);

	}

private boolean ComprobarTablero(){
	return (posicion<=CantCasillas);
}

public void moverse(int pValorDado,Protagonista pProta){
	posicion=posicion+pValorDado;
	lista.get(posicion).CargarCasilla(pProta);
}
	
}





