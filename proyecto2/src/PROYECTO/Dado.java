package PROYECTO;

import java.util.Random;

public class Dado {
	//atributos 
	private int nCaras=6;
	private static Dado miDado=null;
	//constructura
private Dado(){
}
	//otros_metodos
public static Dado getDado(){
	if (miDado==null){
		miDado=new Dado();
	}
	return miDado;
}

public int tirarDado(){
	Random r=new Random();
	int tirada= r.nextInt(nCaras)+1;
	return tirada;
}
}
