package PROYECTO;

public class Casilla {
	private int idEvento;
	
public Casilla (int pId){
	idEvento=pId;
}

public void SetEvento(int pid){
	idEvento=pid;
}

public void CargarCasilla(Protagonista pProtagonista){
	ListaEventos.getListaEventos().ejecutarEvento(this.idEvento,pProtagonista);
}

}
