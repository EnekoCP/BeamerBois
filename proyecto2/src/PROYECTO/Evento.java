package PROYECTO;

abstract class Evento {
	private String Descripcion;
	
public Evento (String pDescripcion){
	Descripcion=pDescripcion;
}

protected void ejecutarEvento(Protagonista pProta){}



protected void imprimirInfo(){
	System.out.println(Descripcion);
}
}