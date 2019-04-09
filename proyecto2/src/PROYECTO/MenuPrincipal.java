package PROYECTO;

import java.util.Scanner;

public class MenuPrincipal {
	static Scanner sc;
	private static MenuPrincipal miMenu;
	
	private MenuPrincipal(){}
	
	public static MenuPrincipal getMenuPrincipal(){
		if(miMenu==null){
			miMenu=new MenuPrincipal();
		}
		return miMenu;
	}

	public void jugarPartida() {
		
		String pNombre=this.nombrePersonaje();
		Protagonista prota= new Protagonista(pNombre);
		boolean vivo=true;
		while(vivo){
			this.menuTirarDado();
			int numDado=this.tirarDado();
			Tablero.getmiTablero().moverse(numDado,prota);
			vivo=prota.comprobarVida();
			
		}
		// TODO Auto-generated method stub

	}
	
	public void menuTirarDado(){
		System.out.println("Pulsar INTRO para tirar dado.");
		
	}
	private int tirarDado(){
		return Dado.getDado().tirarDado();
	}
	
	public void menuCombate(){}
	//otros_metodos
	public void menuMoverse(){}
	
	private String nombrePersonaje(){
		///system aou nombre
		String nombre = sc.nextLine();
		return nombre;
	}
	
}
