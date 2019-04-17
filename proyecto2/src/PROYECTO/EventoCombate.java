package PROYECTO;

import java.util.Random;

public class EventoCombate extends Evento {
	//atributos 
	private Enemigo ene=null;
	
	//constructura
	public EventoCombate(String pDisc, Enemigo pEne){
		super(pDisc);
		ene=pEne;
	}
	//otros_metodos
	public void ejecutarEvento(Protagonista pProta){
		while(pProta.comprobarVida()&&ene.comprobarVida(pProta)){
		String resp=MenuPrincipal.getMenuPrincipal().menuCombate();
		if(resp.equals("x")){
			System.out.println("¡Combate!");
		this.combatir(pProta);}
		else if(resp.equals("z")){
			System.out.println("defensa");
		pProta.defenderse(valorDefensa());
		}
		}
		if(pProta.comprobarVida()){pProta.imprimirInfoPersonaje();}
	}
	private void combatir(Personaje pProta)
	{
		
		if(pProta.getVelocidad()>ene.getVelocidad()){
			pProta.atacar(ene);
			if(ene.getVida()<=0){
			ene.atacar(pProta);}
		}
		else{
			ene.atacar(pProta);
			if(pProta.getVida()<=0){
			pProta.atacar(ene);}
		}
	}
	private int valorDefensa()
	{
		Random r=new Random();
		int danno= r.nextInt(ene.getDanno());
		return danno;
	}
	
			
	
	
}
