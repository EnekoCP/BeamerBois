package PROYECTO;

public class EventoEstado extends Evento{
	//atributos 
	private int vida;
	private int velocidad;
	private int exp;
	private int dano;

	//constructura
	public EventoEstado(String pDescripcion,int pVida,int pVelocidad,int pExp,int pDano){
		super(pDescripcion);
		vida= pVida;
		velocidad= pVelocidad;
		exp=pExp;
		dano=pDano;
		
	}
	public void ejecutarEvento(Protagonista pProta){
		pProta.setAtributos(vida, velocidad, exp, dano);
	}
	
	//otros_metodos
}
