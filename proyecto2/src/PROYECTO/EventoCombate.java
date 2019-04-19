package PROYECTO;




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
			System.out.println("#####################################################################");
			System.out.println("                             ¡Combate!");
			System.out.println("#####################################################################");
			pProta.imprimirInfoPersonaje(); ene.imprimirInfoPersonaje();
			
			
			this.combatir(pProta);}
		else if(resp.equals("z")){
			System.out.println("#####################################################################");
			System.out.println("                             ¡Defensa!");
			System.out.println("#####################################################################");
			pProta.imprimirInfoPersonaje(); ene.imprimirInfoPersonaje();
		this.defenderse(pProta);
		}
		}
		if(pProta.comprobarVida()){pProta.imprimirInfoPersonaje();}
	}
	private void combatir(Personaje pProta)
	{
		
		if(pProta.getVelocidad()>ene.getVelocidad()){
			pProta.atacar(ene);
			if(ene.getVida()>0){
			ene.atacar(pProta);}
		}
		else{
			ene.atacar(pProta);
			if(pProta.getVida()>0){
			pProta.atacar(ene);
			}
		}
		System.out.println("Y el resultado fue...");
		pProta.imprimirInfoPersonaje();
		ene.imprimirInfoPersonaje();
	}
	
	private void defenderse (Personaje pProta)
	{
		
		pProta.defenderse(ene);
		
		System.out.println("Y el resultado fue...");
		pProta.imprimirInfoPersonaje();
		ene.imprimirInfoPersonaje();
	}		
	
	
}
