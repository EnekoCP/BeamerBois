package PROYECTO;

import java.util.ArrayList;

public class ListaEventos {
	//atributos 
	private ArrayList<Evento> lista;
	private static ListaEventos milista=new ListaEventos();
	//constructura
private ListaEventos(){
	lista=new ArrayList<Evento>();
	incializarEvento();
}

public static ListaEventos getListaEventos(){

	return milista;
}

private void incializarEvento(){
	//EventoEstado(String pDescripcion,int pVida,int pVelocidad,int pExp,int pDano)
	//public Enemigo (int pVida,int pDanno, int pVel,int pExperienciaSoltada, String pNombre)
	Enemigo ene1= new Enemigo(100,45,6,20,"Slime");
	Enemigo ene2= new Enemigo(120,40,5,30,"Gnogmo Cabreado");
	Enemigo ene3= new Enemigo(135,46,5,80,"Hell Hound");
	Enemigo ene4= new Enemigo(220,50,3,70,"Necromorfo Deforme");
	Enemigo ene5= new Enemigo(150,56,6,45,"Lunático armado");
	Enemigo ene6= new Enemigo(205,55,4,60,"Prisionero Estigmatizado");
	Enemigo ene7= new Enemigo(215,60,3,80,"Guardian de la Cripta");
	Enemigo ene8= new Enemigo(250,120,6,110,"Dante Cazador de Humanos");
	Enemigo ene9= new Enemigo(175,80,5,50,"OJ Simpson");
	Enemigo ene10= new Enemigo(300,180,8,6,"Exámen de Cálculo");
        Enemigo ene11= new Enemigo(400,90,8,120,"Calculo en Julio");
	
	
	//Asignaciones:
	EventoEstado evento1=new EventoEstado("(1).El viaje esta por comenzar, antes de empreder tú aventura aseguras tus pertrechos. Buena suerte:",0,0,0,0);
	EventoEstado evento2=new EventoEstado("(2).Te topas con una cámara alejada del resto de estancias, en la entrada de la puerta un mensaje escrito en antiguas runas, tras un largo esfuerzo intentado leer lo que pone llegas a la conclusión de que es élfico antiguo, el mensaje dice:"+"Di amigo y entra"+"Pronuncias en alto y claro:Mellon"+"Un extraño ruido desencadena una serie de acciones en la sala que libera un cofre, en el cofre encuentras una antigua daga, te sientes más enérgico y fuerte",50,0,0,10);	
	EventoCombate evento3=new EventoCombate("(3).Un fluido verde viscoso empieza a caer del techo y empieza cobrar forma.\n"
                + "Oh no! Es un Slime. ¿Qué quieres hacer?",ene1);
	EventoMovimiento evento4=new EventoMovimiento("(4).Después de avanzar un rato por la mazmorra te encuentras exhausto, te apoyas en el muro que se encuentra a tu izquierda y sin querer presionas un pequeño mecanismo oculto a la vista, se abre un pasadizo secreto y entras en el. Avanzas 2 casillas...",2);
	EventoEstado evento5=new EventoEstado("(5).Encuentras un pergamino con técnicas de combate avanzadas, sientes que estás más preparado para los desafios que están por llegar:",0,0,0,15);
	EventoCombate evento6=new EventoCombate("(6).En una de las mazmorras te encuentras un pequeño hombre rebuscando entre los restos de un aventurero que no tuvo tanta suerte, intercambiais unas palabras cordiales y tras un ofensivo chiste enanos el gnogmo se enfada y decide atacarte. �Que quieres hacer?",ene2);
	EventoEstado evento7=new EventoEstado("(7).Llegas a un ala de la mazmorra poco iluminada, avanzas con pies de plomo, sin querer pisas una losa de piedra que estaba más suelta que las demás, el mecanismo activa una trampa que empieza a landar virotes de acero, intentas esquivarlos pero uno de ellos te alcanza la rodilla:",-5,0,0,0);
	EventoEstado evento8=new EventoEstado("(8).LLegas a una zona acondicionada,preparas una hoguera y descansas para proseguir con tu aventura, tira de nuevo el dado :)",0,0,0,0);
	EventoEstado evento9=new EventoEstado("(9).Cansado de andar, decides que ha sido suficiente por hoy y decides descansar hasta mañana:",0,0,0,0);
	EventoMovimiento evento10=new EventoMovimiento("(10).Te paras frente a una puerta que no aparece en los mapas,resulta ser un atajo: Avanzas 1 casilla...",1);
	EventoCombate evento11=new EventoCombate("(11).Un olor a sangre humeda y podredumbre te llega a las fosas nasales, con la tenue luz de tu antorcha apuntas a la esquina de la habitación en la que te encuentras, de las sombras y con gesto hostil aparece un sabueso con aspecto rabioso y deteriorado dispuesto a atacar . �Que quieres hacer?",ene3);
	EventoEstado evento12=new EventoEstado("(12).Sala de alquimia: Llevate una poción de vida y por 5 rublos más te llevas otra de experiencia:",20,0,15,0);
	EventoCombate evento13=new EventoCombate("(13).Caminando, alcanzas lo que parecía una antigua sala de ciencia, ojeando antiguos manuscritos percibes que ese lugar ha conocido la magia oscura, sientes que algo o alguien tiene los ojos clavados en ti, del techo se abalanza un monstruo deforme con aspecto humanoide y la piel podrida, se huele su sed de sangre . �Que quieres hacer?",ene4);
	EventoMovimiento evento14=new EventoMovimiento("(14).Pisas una baldosa que empieza a liberar un gas de color verdoso, nada más inhalarlo los parpados te empiezan a pesar y entras en un sueño profundo. Cuanto te despiertas una extraña sensación familiar te invade, ya has estado en esa sala, pero... ¿Cómo has llegado ahí?: Retrocedes 5 casillas...",-5);
	EventoEstado evento15=new EventoEstado("(15).Espera,eso son unas Adidas? Te sientes más rápido y seguro:",0,3,0,0);
	EventoEstado evento16=new EventoEstado("(16).Se hace tarde y el sueño te invade, sacas tu esterilla, enciendes un fuego, preparas tus raciones de patas de duende y de la mochila sacas el laúd para tocar unos temas de medievaltallica :",0,0,0,0);
	EventoCombate evento17=new EventoCombate("(17).En una de las estancias de la mazmorra te encuentras con un caballero dandose cabezazos contra la pared, la locura parece haberle invadido al no poder escapar de la mazmorra, en un ataque de psicosis arremete contra ti. �Que quieres hacer?",ene5);
	EventoEstado evento18=new EventoEstado("(18).la tumba de un antiguo guerrero se encuentra en la mazmorra, un epitafio a pie de tumnba dice los siguiente:El conocimiento es una virtud a pagar con la vida. Al leer esas palabras un flashazo te llega a la cabeza, sientes que has vivido la vida de ese caballero y con el sus enseñanzas... pero tambien sus heridas :",-10,0,0,30);
	EventoMovimiento evento19=new EventoMovimiento("(19).Te palpas los bolsillos, te das cuenta que te has dejado la espada en la última sala en la que estuviste: Retrocedes 1 casilla...",1);
	EventoEstado evento20=new EventoEstado("(20).Te duelen los pies de tanto caminar, haces una pequeña pausa para masajearte los pies :",0,0,0,0);
	EventoCombate evento21=new EventoCombate("(21).Te topas con el ala presidiaria, ya no hay guardas que custodien las celdas ni presos que las habiten, o eso es lo que pensabas... �Que quieres hacer?",ene6);
	EventoEstado evento22=new EventoEstado("(22).En una roca clavada se encuentra una espada, es la espada de la que hablaban las leyendas, la espada VIKODY. Tu abuela te contaba historias sobre dichas espada, recuerdas sus palabras 'Solo los dignos y los que pagan impuestos son dignos de la legendaria espada' Tus deudas con Montoro estan saldadas asi que pruebas suerte, despuees de un fuerte tirón la espada empieza a ceder, es tuya):",20,10,15,40);
	EventoCombate evento23=new EventoCombate("(23).A las antesalas de las criptas un hombre encapuchado custodia la puerta, por su aspecto no parece que vaya a dejar pasar a nadie con vida y que la única manera de entrar es siendo parte de las criptas ",ene7);
	EventoMovimiento evento24=new EventoMovimiento("(24).Tu encuentro con el guardian de la cripta no ha salido bien, decides retroceder para atender tus heridas y volver a intentarlo más adelante: Retrocedes 4 casillas...",-4);
	EventoCombate evento25=new EventoCombate("(25).Un musculoso joven que parece haber salido de una pelicula de Michael Bay, se rie de ti, el aspecto enclenque de tus musculos le provoca una ira insaciable y comienza a atacarte, te grita 'La próxima vez planteante los ciclos sanos'. �Que quieres hacer?",ene8);
	EventoEstado evento26=new EventoEstado("(26).Despúes de pasar tanto tiempo en la mazmorra te sientes capaz de poder con todo, la experiencia adquirida en combate te hace sentirte seguro y confiado lo que provoca un arranque de vitalidad enorme en ti:",20,0,0,30);
	EventoCombate evento27=new EventoCombate("(27).Caminando tranquilamente, ves una sombra en uno de los pasillos. Espera... ese es O.J Simpson? Sorprendido porque le hayan encontrado tan lejos de EE.UU te ataca por miedo a que revelen la localización de su nuevo hogar. �Que quieres hacer?",ene9);
	EventoEstado evento28=new EventoEstado("(28).'My dream is to fly over the rainbow so high' tus atributos aumentan:",30,1,3,50);
	EventoMovimiento evento29=new EventoMovimiento("(29).Te encuentras unos monguis alucinogenos, después de un viaje intenso por tu mente (y por la mazmorra) te das cuenta que has vuelto al principio: Retrocedes 12 casillas...",-12);
	EventoCombate evento30=new EventoCombate("(30).Llegas a lo profundo de la mazmorra, te sientes victorioso, lleno de jubilo, te dispones a pasar la puerta final donde se encuentra el tesoro, atraviesas la puerta y... espera, en que mes estamos? Oh no, es mayo y eso... eso parece el 'Examén de calculo' aquí se decide tu destino. Suerte! �Que quieres hacer?",ene10);
        EventoCombate evento31=new EventoCombate("(JULIO).Despúes de un duro combate sales con el culo perforado y con la sensación de haber perdido el tiempo. Tu nota? un 4.9 y 6ta convocatoria, tienes que ir a Julio, aqui se decide tu destino (otra vez), seguir en la Uni o irse a ADE. Suerte!. ¿Que quieres hacer?",ene11);
	
	
	lista.add(evento1);
	lista.add(evento2);
	lista.add(evento3);
	lista.add(evento4);
	lista.add(evento5);
	lista.add(evento6);
	lista.add(evento7);
	lista.add(evento8);
	lista.add(evento9);
	lista.add(evento10);
	lista.add(evento11);
	lista.add(evento12);
	lista.add(evento13);
	lista.add(evento14);
	lista.add(evento15);
	lista.add(evento16);
	lista.add(evento17);
	lista.add(evento18);
	lista.add(evento19);
	lista.add(evento20);
	lista.add(evento21);
	lista.add(evento22);
	lista.add(evento23);
	lista.add(evento24);
	lista.add(evento25);
	lista.add(evento26);
	lista.add(evento27);
	lista.add(evento28);
	lista.add(evento29);
	lista.add(evento30);
	
}

public void ejecutarEvento(int pId, Protagonista pProta) throws ProtaHaMuertoExcepcion, ProtaHaGanadoExcepcion{
	lista.get(pId).imprimirInfo();
	lista.get(pId).ejecutarEvento(pProta);
}
}


//Metodos que estaran comentados debido su uso exclusivo para las pruebas unitaria
//public ArrayList<Evento> ListaEventosA(){
//return lista;
//}

	

