package PROYECTO;

abstract class Evento {
	private String Descripcion;
	
public Evento (String pDescripcion){
	Descripcion=pDescripcion;
}

protected void ejecutarEvento(Protagonista pProta) throws ProtaHaMuertoExcepcion, ProtaHaGanadoExcepcion{}



protected void imprimirInfo(){
	System.out.println(Descripcion);
}
}