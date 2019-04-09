package PROYECTO;

import java.util.Random;

public class EventoCambate extends Evento {
	//atributos 
	private Enemigo ene=null;
	
	//constructura
	public EventoCambate(String pDisc, Enemigo pEne){
		super(pDisc);
		ene=pEne;
	}
	//otros_metodos
	public void ejecutarEvento(Protagonista pProta){
		while(pProta.comprobarVida()&&ene.comprobarVida()){
		String resp=MenuPrincipal.getMenuPrincipal().menuCombate();
		
		if(resp.equals("x")){
		this.combatir(pProta);}
		else if(resp.equals("z")){
		pProta.defenderse(valorDefensa());
		}
		}
	}
	private void combatir(Personaje pProta)
	{
		
		if(pProta.getVelocidad()>ene.getVelocidad()){
			pProta.atacar(ene);
		}
		else{
			ene.atacar(pProta);
		}
	}
	private int valorDefensa()
	{
		Random r=new Random();
		int danno= r.nextInt(ene.getDanno());
		return danno;
	}
	
			
	
	
}
