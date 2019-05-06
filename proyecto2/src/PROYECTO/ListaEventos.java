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
	EventoEstado evento1=new EventoEstado("(0).El viaje esta por comenzar,\n"
                + " antes de empreder tú aventura aseguras tus pertrechos. Buena suerte:",0,0,0,0);
	EventoEstado evento2=new EventoEstado("(1)Te topas con una cámara alejada \n"
                + " del resto de estancias, en la entrada de la puerta un mensaje\n"
                + " escrito en antiguas runas, tras un largo esfuerzo intentado \n"
                + "leer lo que pone llegas a la conclusión de que es élfico antiguo,\n"
                + " el mensaje dice:"+"Di amigo y entra"+"Pronuncias en alto y claro:\n"
                + "Mellon"+"Un extraño ruido desencadena una serie de acciones en\n"
                + " la sala que libera un cofre, en el cofre encuentras una antigua daga,\n"
                + " te sientes más enérgico y fuerte",50,0,0,10);	
	EventoCombate evento3=new EventoCombate("(2).Un fluido verde viscoso empieza\n"
                + " a caer del techo y empieza cobrar forma.\n"
                + "Oh no! Es un Slime. ¿Qué quieres hacer?",ene1);
	EventoMovimiento evento4=new EventoMovimiento("(3).Después de avanzar un\n"
                + " rato por la mazmorra te encuentras exhausto, te apoyas en el\n"
                + " muro que se encuentra a tu izquierda y sin querer presionas\n"
                + " un pequeño mecanismo oculto a la vista, se abre un pasadizo\n"
                + " secreto y entras en el. Avanzas 2 casillas...",2);
	EventoEstado evento5=new EventoEstado("(4).Encuentras un pergamino con\n"
                + "técnicas de combate avanzadas, sientes que estás más preparado\n"
                + " para los desafios que están por llegar:",0,0,0,15);
	EventoCombate evento6=new EventoCombate("(5).En una de las mazmorras te\n"
                + " encuentras un pequeño hombre rebuscando entre los restos de \n"
                + "un aventurero que no tuvo tanta suerte, intercambiais unas palabras\n"
                + " cordiales y tras un ofensivo chiste sobre enanos el gnogmo se enfada\n"
                + " y decide atacarte. �Que quieres hacer?",ene2);
	EventoEstado evento7=new EventoEstado("(6).Llegas a un ala de la mazmorra\n"
                + " poco iluminada, avanzas con pies de plomo, sin querer pisas\n"
                + " una losa de piedra que estaba más suelta que las demás, \n"
                + "el mecanismo activa una trampa que empieza a landar virotes de acero,\n "
                + "intentas esquivarlos pero uno de ellos te alcanza la rodilla:",-5,0,0,0);
	EventoEstado evento8=new EventoEstado("(7).LLegas a una zona acondicionada,"
                + "preparas una hoguera y descansas para proseguir con tu aventura,\n"
                + " tira de nuevo el dado :)",0,0,0,0);
	EventoEstado evento9=new EventoEstado("(8).Cansado de andar, decides que ha sido suficiente por hoy\n"
                + " y decides descansar hasta mañana:",0,0,0,0);
	EventoMovimiento evento10=new EventoMovimiento("(9).Te paras frente a \n"
                + "una puerta que no aparece en los mapas,resulta ser un atajo: Avanzas 1 casilla...",1);
	EventoCombate evento11=new EventoCombate("(10).Un olor a sangre humeda y\n"
                + " podredumbre te llega a las fosas nasales, con la tenue luz \n"
                + "de tu antorcha apuntas a la esquina de la habitación en la \n"
                + "que te encuentras, de las sombras y con gesto hostil aparece \n"
                + "un sabueso con aspecto rabioso y deteriorado dispuesto a atacar . �Que quieres hacer?",ene3);
	EventoEstado evento12=new EventoEstado("(11).Sala de alquimia: Llevate \n"
                + "una poción de vida y por 5 rublos más te llevas otra de experiencia:",20,0,15,0);
	EventoCombate evento13=new EventoCombate("(12).Caminando, alcanzas lo que\n"
                + "parecía una antigua sala de ciencia, ojeando antiguos \n"
                + "manuscritos percibes que ese lugar ha conocido la magia oscura, \n"
                + "sientes que algo o alguien tiene los ojos clavados en ti, \n"
                + "del techo se abalanza un monstruo deforme con aspecto humanoide\n"
                + "y la piel podrida, se huele su sed de sangre . �Que quieres hacer?",ene4);
	EventoMovimiento evento14=new EventoMovimiento("(13).Pisas una baldosa \n"
                + "que empieza a liberar un gas de color verdoso, nada más inhalarlo \n"
                + "los parpados te empiezan a pesar y entras en un sueño profundo. \n"
                + "Cuanto te despiertas una extraña sensación familiar te invade, \n"
                + "ya has estado en esa sala, pero... ¿Cómo has llegado ahí?: Retrocedes 5 casillas...",-5);
	EventoEstado evento15=new EventoEstado("(14).Espera,eso son unas Adidas? \n"
                + "Te sientes más rápido y seguro:",0,3,0,0);
	EventoEstado evento16=new EventoEstado("(15).Se hace tarde y el sueño te invade, \n"
                + "sacas tu esterilla, enciendes un fuego, preparas tus raciones \n"
                + "de patas de duende y de la mochila sacas el laúd para tocar \n"
                + "unos temas de medievaltallica :",0,0,0,0);
	EventoCombate evento17=new EventoCombate("(16).En una de las estancias de \n"
                + "la mazmorra te encuentras con un caballero dandose cabezazos \n"
                + "contra la pared, la locura parece haberle invadido al no poder \n"
                + "escapar de la mazmorra, en un ataque de psicosis arremete contra ti. �Que quieres hacer?",ene5);
	EventoEstado evento18=new EventoEstado("(17).la tumba de un antiguo guerrero \n"
                + "se encuentra en la mazmorra, un epitafio a pie de tumnba dice \n"
                + "los siguiente:El conocimiento es una virtud a pagar con la vida. \n"
                + "Al leer esas palabras un flashazo te llega a la cabeza, sientes \n"
                + "que has vivido la vida de ese caballero y con el sus enseñanzas... \n"
                + "pero tambien sus heridas del pasado :",-10,0,0,30);
	EventoMovimiento evento19=new EventoMovimiento("(18).Te palpas los bolsillos,\n"
                + "te das cuenta que te has dejado la espada en la última sala en \n"
                + "la que estuviste: Retrocedes 1 casilla...",1);
	EventoEstado evento20=new EventoEstado("(19).Te duelen los pies de tanto \n"
                + "caminar, haces una pequeña pausa para masajearte los pies :",0,0,0,0);
	EventoCombate evento21=new EventoCombate("(20).Te topas con el ala presidiaria, \n"
                + "ya no hay guardas que custodien las celdas ni presos que las habiten, \n"
                + "o eso es lo que pensabas... �Que quieres hacer?",ene6);
	EventoEstado evento22=new EventoEstado("(21).En una roca clavada se encuentra una espada, \n"
                + "es la espada de la que hablaban las leyendas, la espada VIKODY. \n"
                + "Tu abuela te contaba historias sobre dichas espada, recuerdas sus palabras: \n"
                + "'Solo los dignos y los que pagan impuestos son dignos de la legendaria espada' \n"
                + "Tus deudas con Montoro estan saldadas asi que pruebas suerte, \n"
                + "después de un fuerte tirón la espada empieza a ceder, es tuya):",20,10,15,40);
	EventoCombate evento23=new EventoCombate("(22).A las antesalas de las criptas \n"
                + "un hombre encapuchado custodia la puerta, por su aspecto no parece \n"
                + "que vaya a dejar pasar a nadie con vida y que la única manera \n"
                + "de entrar es siendo parte de las criptas ",ene7);
	EventoMovimiento evento24=new EventoMovimiento("(23).Tu encuentro con el \n"
                + "guardian de la cripta no ha salido bien, decides retroceder \n"
                + "para atender tus heridas y volver a intentarlo más adelante: \n"
                + "Retrocedes 4 casillas...",-4);
	EventoCombate evento25=new EventoCombate("(24).Un musculoso joven que parece \n"
                + "haber salido de una pelicula de Michael Bay, se rie de ti, el \n"
                + "aspecto enclenque de tus musculos le provoca una ira insaciable \n"
                + "y comienza a atacarte, te grita 'La próxima vez planteante los \n"
                + "ciclos sanos'. �Que quieres hacer?",ene8);
	EventoEstado evento26=new EventoEstado("(25).Despúes de pasar tanto tiempo \n"
                + "en la mazmorra te sientes capaz de poder con todo, la experiencia \n"
                + "adquirida en combate te hace sentirte seguro y confiado lo que \n"
                + "provoca un arranque de vitalidad enorme en ti:",20,0,0,30);
	EventoCombate evento27=new EventoCombate("(26).Caminando tranquilamente, \n"
                + "ves una sombra en uno de los pasillos. Espera... ese es O.J Simpson? \n"
                + "Sorprendido porque le hayan encontrado tan lejos de EE.UU \n"
                + "te ataca por miedo a que revelen la localización de su nuevo hogar. \n"
                + "�Que quieres hacer?",ene9);
	EventoEstado evento28=new EventoEstado("(27).'My dream is to fly over the rainbow so high'\n"
                + " tus atributos aumentan:",30,1,3,50);
	EventoMovimiento evento29=new EventoMovimiento("(28).Te encuentras unos monguis alucinogenos,\n"
                + " después de un viaje intenso por tu mente (y por la mazmorra)\n"
                + " te das cuenta que has vuelto al principio: Retrocedes 12 casillas...",-12);
	EventoCombate evento30=new EventoCombate("(29).Llegas a lo profundo de la mazmorra, \n "
                + "te sientes victorioso, lleno de jubilo, te dispones a pasar \n"
                + "la puerta final donde se encuentra el tesoro, atraviesas la puerta y... \n"
                + "espera, en que mes estamos? Oh no, es mayo y eso... eso parece el 'Examén de calculo' \n"
                + "aquí se decide tu destino. Suerte! �Que quieres hacer?",ene10);
        EventoCombate evento31=new EventoCombate("(JULIO).Despúes de un duro combate\n"
                + " sales con el culo perforado y con la sensación de haber perdido el tiempo. \n"
                + "Tu nota? un 4.9 y 6ta convocatoria, tienes que ir a Julio, aqui se decide tu destino \n"
                + "(otra vez), seguir en la Uni o irse a ADE. Suerte!. ¿Que quieres hacer?",ene11);
	
	
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

	

