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
	public void ejecutarEvento(Protagonista pProta) throws ProtaHaMuertoExcepcion, ProtaHaGanadoExcepcion{
		if (Tablero.getmiTablero().getPosicion()==29){
			this.CombateFinal(pProta);
		}
			
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
	
	private void CombateFinal(Protagonista pProta) throws ProtaHaMuertoExcepcion, ProtaHaGanadoExcepcion{
				System.out.println("◣◢ (JEFE FINAL) ◣◢ ");
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
						// FALTA PETAR EL BUCLE
						System.out.println("El enemigo esta a punto de morir");
				
						System.out.println("Tienes la posibilidad de darle un GOLPE MORTAL a tu enemigo saca numero PAR y ganaras la partida !!!");
						
						MenuPrincipal.getMenuPrincipal().menuTirarDado();
						int numDado=Dado.getDado().tirarDado();
						System.out.println("Has sacado:"+numDado+"!");
				
						if (numDado % 2==0){
							System.out.println("El enemigo ha muerto");
							System.out.println("¡¡¡¡GANASTE LA PARTIDA !!!!!");
						}
						else{
							Tablero.getmiTablero().moverse(1, pProta);
							throw(new ProtaHaGanadoExcepcion());
						}
					
		
			
	}
	
}
