package PROYECTO;

import java.util.Scanner;

public class MenuPrincipal {
	static Scanner sc;
	private static MenuPrincipal miMenu;
	
	private MenuPrincipal(){
	sc=new Scanner (System.in); 
	}
	
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
			prota.imprimirInfoPersonaje();
			int numDado=this.tirarDado();
			System.out.println("Has sacado:"+numDado+"!");
			Tablero.getmiTablero().moverse(numDado,prota);
			vivo=prota.comprobarVida();
			
		}
		// TODO Auto-generated method stub

	}
	
	public void menuTirarDado(){
		System.out.println("Pulsar INTRO para tirar dado.");
		sc.nextLine();
		
	}
	private int tirarDado(){
		//return Dado.getDado().tirarDado();
		return 1;
	}
	
	public String menuCombate(){
		String resp="";
		System.out.println("Que quieres hacer:\n"
				+ "1. Pulse < x > para atacar\n"
				+ "2. Pulse < z > para defenderte\n");
		// TODO hacer una exepcion en el caso de que metan un formato incorrecto
		resp=sc.nextLine();
		return resp;
		}
	//otros_metodos
	public void menuMoverse(){}
	
	private String nombrePersonaje(){
		String nombre="";
		System.out.println("Como se llamará tu personaje?");
		nombre = sc.nextLine();
		System.out.println("Bienvenido a Vikody "+nombre);
		return nombre;
	}
	
}
