package PROYECTO;

public class Casilla {
	private int idEvento;
	
public Casilla (int pId){
	idEvento=pId;
}

public void SetEvento(int pid){
	idEvento=pid;
}

public void cargarCasilla(Protagonista pProtagonista) throws ProtaHaMuertoExcepcion, ProtaHaGanadoExcepcion{
	ListaEventos.getListaEventos().ejecutarEvento(this.idEvento,pProtagonista);
}

}
