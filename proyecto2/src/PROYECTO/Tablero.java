package PROYECTO;

import java.util.*;


public class Tablero {
	private ArrayList<Casilla> lista;
	private static int CantCasillas = 30;
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
	// Por defecto la idVento de las casillas ser� igual a nombre. Para futuros cambios,
	// utilizamos el metodo setEvento
	
	for (int i = 0; i < CantCasillas; i++)
	{
		Casilla c = new Casilla(i);
		lista.add(c);
	}
}

private boolean ComprobarTablero(){
	return (posicion<CantCasillas);
}

public void moverse(int pValorDado,Protagonista pProta) throws ProtaHaMuertoExcepcion, ProtaHaGanadoExcepcion{
	posicion=posicion+pValorDado;
try{
	if (this.ComprobarTablero()){

		lista.get(posicion).CargarCasilla(pProta);}
	else{
		throw(new FueraTableroExcepcion());
	}
}
	catch (FueraTableroExcepcion e){
		//System.out.println("Fuera Tablero");
		lista.get(29).CargarCasilla(pProta);
	}

}

public void resetar(){
	miTablero=null;
	posicion=0;
}

public int getPosicion() {
	
	return posicion;
}

}





