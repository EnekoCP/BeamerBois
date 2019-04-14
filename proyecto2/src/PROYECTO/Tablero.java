package PROYECTO;

import java.util.*;

public class Tablero {
	private ArrayList<Casilla> lista;
	private static int CantCasillas = 21;
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
	
	for (int i = 0; i < CantCasillas; i++)
	{
		Casilla c = new Casilla(i);
		lista.add(c);
	}
}

private boolean ComprobarTablero(){
	return (posicion<=CantCasillas);
}

public void moverse(int pValorDado,Protagonista pProta){
	//if(posicion==0){
	//	lista.get(posicion).CargarCasilla(pProta);
	//	posicion=posicion+pValorDado;
//	}
//	else{
	posicion=posicion+pValorDado;
	lista.get(posicion).CargarCasilla(pProta);}
//}
	
}





