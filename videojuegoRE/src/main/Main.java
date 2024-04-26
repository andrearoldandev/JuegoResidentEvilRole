package main;

import java.util.Scanner;
import modelo.Enemigo;
import modelo.PersonajeJugable;
import modelo.Utilidades;
import modelo.Objetos;

public class Main {

	public static void main(String[] args) {
		//VARIABLES
		int menu;
		int lanzarDado1;
		int lanzarDado2;
		int lanzarDado3;
		int lanzarDado4;
		int lanzarDado5;
		int lanzarDado6;
		int lanzarDado7;
		int lanzarDado8;
		int lanzarDado9;
		int lanzarDado10;
		int lanzarDado11;
		int lanzarDado12;
		int opcionPasillo;
		int opcionArmeria;
		int opcionFinal;
		Scanner teclado = new Scanner(System.in);
		int valorDado = 0;
		boolean isActive = true;
		boolean marvinVivo = true;
				
		//CREAMOS LOS PERSONAJES
		Enemigo zombie = new Enemigo("Zombie Jefe de Policia");
		Enemigo zombie1 = new Enemigo("Zombie policia");
		Enemigo zombie2 = new Enemigo("Zombie policia 2");
		Enemigo licker = new Enemigo("Licker");
		Enemigo licker2 = new Enemigo("Licker");
		Enemigo tyrant = new Enemigo("Tyrant");
		
		//JUEGO
		System.out.println("----------------------------------------------------------------\n");
		System.out.println("---------- INICIANDO RESIDENT EVIL 2, EL JUEGO DE ROL ----------\n");
		System.out.println("----------------------------------------------------------------");
		
		do {//bucle que repite si quieres jugar de nuevo
			do {//bucle que se repite mientras sigas vivo
				System.out.println("---------------------------- MENÚ ------------------------------");
				System.out.println("Pulsa 0 para salir del juego");
				System.out.println("Pulsa 1 para empezar a jugar");
				System.out.println("----------------------------------------------------------------\n");
				menu = teclado.nextInt();
				teclado.nextLine();
				
				switch(menu) {
				case 0:
					isActive = false;
				break;
				case 1:
					System.out.println("----------------------------------------------------------------\n");
					System.out.println("---------------- BIENVENIDO A RACCOON CITY----------------------\n");
					System.out.println("----------------------------------------------------------------\n");
					System.out.println("~~~~ Estás a punto de empezar tu aventura en Raccon City ~~~~\n");
									
						PersonajeJugable leonSKennedy = new PersonajeJugable("Leon S.Kennedy");
					
					System.out.println("----------------------------------------------------------------");	
					System.out.println("\t~~~~ PRÓLOGO ~~~~");
					System.out.println("----------------------------------------------------------------\n");	
					System.out.println("\tLeon S.Kennedy, un joven oficial de policia que empieza su carrera en el Departamento de Policía de Raccoon City,");
					System.out.println("\tllega a la ciudad y se encuentra con que su primera noche será mucho más larga de lo que parecía, ha habido una catastrofe"); 
					System.out.println("\tla ciudad está patas arriba, te diriges como puedes a la comisaria...\n"); 
					
					System.out.println("\t" + leonSKennedy.getNombre() + " ha llegado a la comisaría sano y salvo, además dispone de una pistola y 10 balas,");
					System.out.println("\ttendrá que buscar supervivientes entre la carnicería que ha tenido lugar en la comisaría,");
					System.out.println("\tllegar a la armería para prepararse y salir con vida de allí...\n");
					System.out.println("----------------------------------------------------------------\n");
					
					System.out.println("\t~~~~ LLEGAS A LA COMISARÍA ~~~~\n");
					System.out.println("----------------------------------------------------------------");	
					System.out.println("\tEntras a la comisaría, parece vacía, en el mostrador de recepción encuentras:");
					System.out.println("\t\t- 10 balas de pistola");
					System.out.println("\t\t- 1 bote de Spray de primeros auxilios\n");
					
					//AÑADIMOS LA MUNICION Y EL SPRAY
					leonSKennedy.municion(10);
					System.out.println("\t\t- " + leonSKennedy.getMunicion() + " balas.");
					leonSKennedy.spray(1);
					System.out.println("\t\t- " + leonSKennedy.getSpray() + " Spray de Primeros Auxilios.\n");
					
					System.out.println("----------------------------------------------------------------\n");	
					System.out.println("\t~~~~ OBJETIVO ~~~~\n");
					System.out.println("----------------------------------------------------------------\n");
					System.out.println("\tTu objetivo es llegar al despacho del Jefe de Policía para buscar algún superviviente.");
					System.out.println("\tTe diriges al despacho sin problemas aparentes.\n");
					System.out.println("\t¡HAS ENCONTRADO TU PRIMER ZOMBI!\n");
					System.out.println("\tEs el Jefe de Policia, debes acabar con su vida, no pudes huir, te perseguirá\n");
					
					do {
					System.out.println("\t~~~~ Pulsa 1 para lanzar un dado y ver que sucede... ~~~~");
					lanzarDado1 = teclado.nextInt();
					teclado.nextLine();
						if(lanzarDado1 == 1) {
							valorDado = Utilidades.lanzarDado();
							System.out.println("\t\tLanzando dado, te ha salido: " + valorDado);
							if(valorDado == 1) {
								System.out.println("\t\t¡Has sacado un PIFIA!");
								System.out.println("\t\t!EL ZOMBI JEFE DE POLICIA TE ATACA!");
								zombie.mordisco();
								System.out.println("\t\t" + zombie.getMordisco());
								leonSKennedy.morirse();
								System.out.println("\t\t" + leonSKennedy.getMorirse());
								isActive = false;
							}else if(valorDado > 1 && valorDado < 20) {
								System.out.println("\t\t¡Buena tirada!");
								leonSKennedy.pistola();
								System.out.println("\t\t" + leonSKennedy.getPistola() + " pero has tenido que usar 5 balas.\n");
								leonSKennedy.municion(-5);
								System.out.println("\t\t- " + leonSKennedy.getMunicion() + " balas.\n");
							}else if(valorDado == 20) {
								System.out.println("\t\t¡CRÍTICO!");
								leonSKennedy.pistola();
								System.out.println("\t\t" + leonSKennedy.getPistola() + " solo has gastado una bala.\n");
								leonSKennedy.municion(-1);
								System.out.println("\t\t- " + leonSKennedy.getMunicion() + " balas.\n");
							}
						}else {
							System.out.println("----------------------------------------------------------------");
							System.out.println("\tError, tenías que pulsar 1 para lanzar un dado, vuelve a intentarlo...");
							System.out.println("----------------------------------------------------------------\n");
						}
					}while(lanzarDado1 != 1);
	
				if(isActive == true) {
					System.out.println("\t~~~~ REGISTRAS EL DESPACHO DEL JEFE DE POLICÍA ~~~~\n");
					
					do {
						System.out.println("\t~~~~ Pulsa 1 para lanzar un dado y ver que sucede... ~~~~");
						lanzarDado2 = teclado.nextInt();
						teclado.nextLine();
						
						if(lanzarDado2 == 1) {
							valorDado = Utilidades.lanzarDado();
							System.out.println("\t\tLanzando dado..., te ha salido: " + valorDado);
							if(valorDado == 1) {
								System.out.println("\t\t¡Has sacado un PIFIA!");
								System.out.println("No encuentras nada útil, solo hay papeles y archivadores...");
							}else if(valorDado > 1 && valorDado < 20) {
								System.out.println("\t\t¡Buena tirada!");
								System.out.println("\t\tHas encontrado:");
								System.out.println("\t\t\t- 5 balas de pistola");
								System.out.println("\t\t\t- 1 Spray de primeros auxilios");
								leonSKennedy.municion(5);
								System.out.println("\t\t- " + leonSKennedy.getMunicion() + " balas.\n");
								leonSKennedy.spray(1);
								System.out.println("\t\t- " + leonSKennedy.getSpray() + " sprays de primeros auxilios.\n");
							}else if(valorDado == 20) {
								System.out.println("\t\t¡CRÍTICO!");
								System.out.println("\t\tHas encontrado:");
								System.out.println("\t\t\t- 10 balas de pistola");
								System.out.println("\t\t\t- 2 Spray de primeros auxilios");
								leonSKennedy.municion(10);
								leonSKennedy.spray(2);
								System.out.println("\t\t- " + leonSKennedy.getMunicion() + " balas.\n");
								System.out.println("\t\t- " + leonSKennedy.getSpray() + " sprays de primeros auxilios.\n");
							}
							
						}else {
							System.out.println("----------------------------------------------------------------");
							System.out.println("\tError, tenías que pulsar 1 para lanzar un dado, vuelve a intentarlo...");
							System.out.println("----------------------------------------------------------------\n");
						}
						
					}while(lanzarDado2 != 1);
					
					System.out.println("----------------------------------------------------------------\n");
					System.out.println("\t¡NUEVO OBJETIVO!\n");
					System.out.println("----------------------------------------------------------------\n");
					System.out.println("\tEs hora de dirigirse a la ARMERÍA, para llegar ahí, tienes que cruzar el pasillo hasta el final...");
					System.out.println("\tEl problema es que visualizas varios cuerpos en el suelo, ¿serán zombies o podrás salvar a alguien?\n");
					System.out.println("\tEmpiezas a avanzar por el pasillo, ¿Qué quieres hacer?\n");
					
					do {
						System.out.println("----------------------------------------------------------------");
						System.out.println("\t\tPulsa 1 para avanzar sigilosamente para evitar ser descubierto.");
						System.out.println("\t\tPulsa 2 para pasar lo más rápido posible, te da igual que te oigan, tu objetivo es llegar cuanto antes.");
						System.out.println("----------------------------------------------------------------");
						opcionPasillo = teclado.nextInt();
						teclado.nextLine();
					}while(opcionPasillo > 2);
					
					switch(opcionPasillo) {
					case 1:
						System.out.println("\t~~~~ Has elegido avanzar sigilosamente. ~~~~\n");
						do {
							System.out.println("\t\t~~~~ Pulsa 1 para lanzar el dado y ver que sucede... ~~~~");
							lanzarDado3 = teclado.nextInt();
							teclado.nextLine();
							
							if(lanzarDado3 == 1) {
								valorDado = Utilidades.lanzarDado();
								
								System.out.println("\t\tLanzando dado..., te ha salido: " + valorDado);
								if(valorDado == 1) {
									System.out.println("\t\tAl pasar por al lado de los zombies, te tropiezas con una de sus cabezas...");
									System.out.println("\t\tHas sido descubierto, los 2 zombies que había en el suelo se levantan...");
									do {
										System.out.println("\t\t~~~~ Pulsa 1 para lanzar el dado y ver que sucede... ~~~~");
										lanzarDado4 = teclado.nextInt();
										teclado.nextLine();
										
										if(lanzarDado4 == 1) {
											valorDado = Utilidades.lanzarDado();
											
											System.out.println("\t\tLanzando dado..., te ha salido: " + valorDado);
											if(valorDado == 1) {
												System.out.println("\t\t¡Has sacado un PIFIA!");
												System.out.println("\t\t¡NOO, LOS 2 ZOMBIES ATACAN A LA VEZ Y NO TE DA TIEMPO A SACAR LA PISTOLA...");
												zombie1.mordisco();
												zombie2.mordisco();
												System.out.println("\t\t" + zombie1.getMordisco());
												System.out.println("\t\t" + zombie2.getMordisco());
												leonSKennedy.morirse();
												System.out.println("\t\t" + leonSKennedy.getMorirse());
												isActive = false;
											}else if(valorDado > 1 && valorDado < 20) {
												System.out.println("\t\t¡Buena tirada!");
												System.out.println("\t\t¡Te has caido, pero has conseguido sacar la pistola a tiempo y has matado a los dos zombies");
												System.out.println("\t\t" + leonSKennedy.getPistola() + " pero has tenido que usar 5 balas.\n");
												leonSKennedy.municion(-5);
												System.out.println("\t\t- " + leonSKennedy.getMunicion() + " balas.\n");
											}else if(valorDado == 20) {
												System.out.println("\t\t¡CRÍTICO!");
												System.out.println("\t\tSuerte que tienes buen equilibrio, no llegas a caerte y sacas rápidamente la pistola y has matado a los zombies. Menudo susto...");
												System.out.println("\t\t" + leonSKennedy.getPistola() + " has tenido que usar 2 balas.\n");
												leonSKennedy.municion(-2);
												System.out.println("\t\t- " + leonSKennedy.getMunicion() + " balas.\n");
											}
										}else {
											System.out.println("----------------------------------------------------------------");
											System.out.println("\tError, tenías que pulsar 1 para lanzar un dado, vuelve a intentarlo...");
											System.out.println("----------------------------------------------------------------");
										}
									}while(lanzarDado4 != 1);
								}else if(valorDado > 1 && valorDado < 20) {
									System.out.println("\t\tUff has conseguido pasar sin hacer ruido, pero en el último momento, uno de los zombies se levanta...");
									do {
										System.out.println("\t\t~~~~ Pulsa 1 para lanzar el dado y ver que sucede... ~~~~");
										lanzarDado5 = teclado.nextInt();
										teclado.nextLine();
										
										if(lanzarDado5 == 1) {
											valorDado = Utilidades.lanzarDado();
											System.out.println("\t\tLanzando dado..., te ha salido: " + valorDado);
											if(valorDado == 1) {
												System.out.println("\t\t¡Has sacado un PIFIA!");
												System.out.println("\t\tEl zombie se lanza como una mala bestia hacia tí, no te da tiempo a reaccionar...");
												zombie1.mordisco();
												System.out.println("\t\t" + zombie1.getMordisco());
												leonSKennedy.morirse();
												System.out.println("\t\t" + leonSKennedy.getMorirse());
												isActive = false;
											}else if(valorDado > 1 && valorDado < 20) {
												System.out.println("\t\t¡Buena tirada!");
												System.out.println("\t\tConsigues matar al zombie usando 2 balas, pero con el ruido de la pistola, el otro zombie se levanta.");
												System.out.println("\t\t" + leonSKennedy.getPistola() + " has tenido que usar 2 balas.\n");
												leonSKennedy.municion(-2);
												System.out.println("\t\t- " + leonSKennedy.getMunicion() + " balas.\n");
												do {
													System.out.println("\tTienes que enfrentarte al zombie que se ha levantado");
													System.out.println("\t\t~~~~ Pulsa 1 para lanzar el dado y ver que sucede... ~~~~");
													lanzarDado6 = teclado.nextInt();
													teclado.nextLine();
	
													if(lanzarDado6 == 1) {
														valorDado = Utilidades.lanzarDado();
														System.out.println("\t\tLanzando dado..., te ha salido: " + valorDado);
														if(valorDado == 1) {
															System.out.println("\t\t¡Has sacado un PIFIA!");
															System.out.println("\t\tEl zombie se lanza como una mala bestia hacia tí, no te da tiempo a reaccionar...");
															zombie2.mordisco();
															System.out.println("\t\t" + zombie2.getMordisco());
															leonSKennedy.morirse();
															System.out.println("\t\t" + leonSKennedy.getMorirse());
															isActive = false;
														}else if(valorDado > 1 && valorDado < 20) {
															System.out.println("\t\t¡Buena tirada!");
															System.out.println("\t\tConsigues matar al zombie usando 2 balas, has acabado con los 2 zombies.");
															System.out.println("\t\t" + leonSKennedy.getPistola() + " has tenido que usar 2 balas.\n");
															leonSKennedy.municion(-2);
															System.out.println("\t\t- " + leonSKennedy.getMunicion() + " balas.\n");
														}else if(valorDado == 20) {
															System.out.println("\t\t¡CRÍTICO!");
															System.out.println("\t\tSuerte que eres rápido, sacas la pistola y matas al último zombie. Menudo susto...");
															System.out.println("\t\t" + leonSKennedy.getPistola() + " has tenido que usar 1 balas.\n");
															leonSKennedy.municion(-1);
															System.out.println("\t\t- " + leonSKennedy.getMunicion() + " balas.\n");
														}
													}else {
														System.out.println("----------------------------------------------------------------");
														System.out.println("\tError, tenías que pulsar 1 para lanzar un dado, vuelve a intentarlo...");
														System.out.println("----------------------------------------------------------------");
													}
												}while(lanzarDado6 != 1);
											}else if(valorDado == 20) {
												System.out.println("\t\t¡CRÍTICO!");
												System.out.println("\t\tHas matado al primer zombie de un balazo, además no te fias de que se lavente el otro y antes de que eso suceda, le pegas un tiro en la cabeza, eres muy previsor...");
												System.out.println("\t\t" + leonSKennedy.getPistola() + " has tenido que usar 2 balas.\n");
												leonSKennedy.municion(-2);
												System.out.println("\t\t- " + leonSKennedy.getMunicion() + " balas.\n");
											}
										}else {
											System.out.println("----------------------------------------------------------------");
											System.out.println("\tError, tenías que pulsar 1 para lanzar un dado, vuelve a intentarlo...");
											System.out.println("----------------------------------------------------------------");
										}
									}while(lanzarDado5 != 1);
								}else if(valorDado == 20) {
									System.out.println("\t\tHas conseguido pasar sigilosamente sin ser detectado por los zombies, ¡HAS LLEGADO A LA PUERTA DE LA ARMERÍA!");
								}
							}else {
								System.out.println("----------------------------------------------------------------");
								System.out.println("\tError, tenías que pulsar 1 para lanzar un dado, vuelve a intentarlo...");
								System.out.println("----------------------------------------------------------------");
							}
						}while(lanzarDado3 != 1);
						break;
					case 2:
						System.out.println("\t~~~~ Has elegido avanzar lo más rápido posible, te da igual que te oigan, tu objetivo es llegar cuanto antes. ~~~~\n");
						do {
							System.out.println("\t\t~~~~ Pulsa 1 para lanzar el dado y ver que sucede... ~~~~");
							lanzarDado7 = teclado.nextInt();
							teclado.nextLine();
							
							if(lanzarDado7 == 1) {
								valorDado = Utilidades.lanzarDado();
								System.out.println("\t\tLanzando dado..., te ha salido: " + valorDado);
								if(valorDado == 1) {
									System.out.println("\t\t¡Has sacado un PIFIA!");
									System.out.println("\t\t¡NOO, LOS 2 ZOMBIES SE LEVANTAN FURIOSOS Y ATACAN A LA VEZ, NO TE DA TIEMPO A SACAR LA PISTOLA...");
									zombie1.mordisco();
									zombie2.mordisco();
									System.out.println("\t\t" + zombie1.getMordisco());
									System.out.println("\t\t" + zombie2.getMordisco());
									leonSKennedy.morirse();
									System.out.println("\t\t" + leonSKennedy.getMorirse());
									isActive = false;
								}else if(valorDado > 1 && valorDado < 20) {
									System.out.println("\t\t¡Buena tirada!");
									System.out.println("\t\t¡Te has caido, pero has conseguido sacar la pistola a tiempo y has matado a los dos zombies");
									System.out.println("\t\t" + leonSKennedy.getPistola() + " pero has tenido que usar 5 balas.\n");
									leonSKennedy.municion(-5);
									System.out.println("\t\t- " + leonSKennedy.getMunicion() + " balas.\n");
								}else if(valorDado == 20) {
									System.out.println("\t\t¡CRÍTICO!");
									System.out.println("\t\tAntes de empezar a correr matas al primer zombie de un balazo, además no te fias de que se lavente el otro y antes de que eso suceda, le pegas un tiro en la cabeza, eres muy previsor...");
									System.out.println("\t\t" + leonSKennedy.getPistola() + " has tenido que usar 2 balas.\n");
									leonSKennedy.municion(-2);
									System.out.println("\t\t- " + leonSKennedy.getMunicion() + " balas.\n");
								}
							}else {
								System.out.println("----------------------------------------------------------------");
								System.out.println("\tError, tenías que pulsar 1 para lanzar un dado, vuelve a intentarlo...");
								System.out.println("----------------------------------------------------------------");
							}
						}while(lanzarDado7 != 1);
					break;
					
					}
				if(isActive == true) {
					System.out.println("----------------------------------------------------------------\n");
					System.out.println("\t¡HAS LLEGADO A LA ARMERÍA\n");
					System.out.println("----------------------------------------------------------------\n");
					System.out.println("\tConsigues abrir la puerta de la armería, tu nuevo objetivo es recoger todo lo que puedas");
					System.out.println("\tpara equiparte y poder salir de la comisaría con vida.\n");
					
					System.out.println("\tAl entrar, encuentras un hombre en el suelo, no parece ser un zombie aún, pero está herido...");
					System.out.println("\tLleva una placa que pone Marvin, ¿Qué vas a hacer?\n");
					
					do {
						System.out.println("----------------------------------------------------------------");
						System.out.println("\t\tPulsa 1 para usar un Spray de primeros auxilios.");
						System.out.println("\t\tPulsa 2 para dispararle, podría estar infectado y causarte problemas...");
						System.out.println("----------------------------------------------------------------");
						opcionArmeria = teclado.nextInt();
						teclado.nextLine();
					}while(opcionArmeria > 2);
					
					switch(opcionArmeria) {
					case 1:
						System.out.println("\t\t~~~~ Has elegido salvar a Marvin ~~~~\n");
						leonSKennedy.spray(-1);
						System.out.println("\t\t" + leonSKennedy.getSpray() + " sprays de primeros auxilios.\n");
						if(leonSKennedy.getSpray() == 0) {
							System.out.println("\t\tNo te quedan sprays de primeros auxilios...");
							System.out.println("\t\t~~~~ MARVIN HA MUERTO... ~~~~\n");
						}else {
							System.out.println("\t\tUsas un spray de primeros auxilios con Marvin...\n");
							System.out.println("\t\t~~~~ HAS SALVADO A MARVIN, te espera un regalo. ~~~~\n");
							System.out.println("\t\tHas obtenido una ESCOPETA si sacas un CRÍTICO podrás usarla");
							System.out.println("\t\tHas obtenido 10 balas.\n");
							leonSKennedy.municion(10);
							System.out.println("\t\t- " + leonSKennedy.getMunicion() + " balas.\n");
							marvinVivo = true;
						}
						break;
					case 2:
						System.out.println("\t\t~~~~ Has elegido matar a Marvin, sospechas que podría estar infectado... ~~~~\n");
						if(leonSKennedy.getMunicion() == 0) {
							System.out.println("\t\tNo te quedan balas, pero le vas a dejar morir igualmente...");
							System.out.println("\t\tMARVIN HA MUERTO por sus heridas... NO estaba infectado.\n");
						}else {
							System.out.println("\t\t " + leonSKennedy.getPistola() + " gastas una bala.");
							System.out.println("\t\t~~~~ MARVIN HA MUERTO... ~~~~\n");
							leonSKennedy.municion(-1);
							System.out.println("\t\t- " + leonSKennedy.getMunicion() + " balas.\n");
							marvinVivo = false;
						}
						break;
					
					}
					System.out.println("----------------------------------------------------------------");
					System.out.println("\tAhora ya te puedes dedicar a saquear toda la armería.");
					System.out.println("----------------------------------------------------------------\n");
					
					do {
						System.out.println("\t\t~~~~ Pulsa 1 para lanzar el dado y ver que encuentras... ~~~~\n");
						lanzarDado8 = teclado.nextInt();
						teclado.nextLine();
										
						if(lanzarDado8 == 1) {
							valorDado = Utilidades.lanzarDado();
							System.out.println("\t\tLanzando dado..., te ha salido: " + valorDado);
							if(valorDado == 1) {
								System.out.println("\t\tVaya, no has encontrado nada útil, la armería ya había sido saqueada con anterioridad...\n");
							}else if(valorDado > 1 && valorDado < 20) {
								System.out.println("\t\t¡Buena tirada!\n");
								System.out.println("\t\tHas encontrado: ");
								System.out.println("\t\t\t- 1 Spray de primeros auxilios");
								System.out.println("\t\t\t- 10 balas\n");
								
								leonSKennedy.spray(1);
								System.out.println("\t\t- " + leonSKennedy.getSpray() + " sprays de primeros auxilios.");
								leonSKennedy.municion(10);
								System.out.println("\t\t- " + leonSKennedy.getMunicion() + " balas.\n");
							}else if(valorDado == 20) {
								System.out.println("\t\t¡CRÍTICO!\n");
								System.out.println("\t\tHas encontrado: ");
								System.out.println("\t\t\t- 2 Spray de primeros auxilios");
								System.out.println("\t\t\t- 20 balas\n");
								leonSKennedy.municion(20);
								leonSKennedy.spray(2);
								System.out.println("\t\t- " + leonSKennedy.getSpray() + " sprays de primeros auxilios.");
								System.out.println("\t\t- " + leonSKennedy.getMunicion() + " balas.\n");
							}
						}
					}while(lanzarDado8 != 1);
				if(isActive == true) {	
					System.out.println("----------------------------------------------------------------\n");
					System.out.println("\t¡NUEVO OBJETIVO!\n");
					System.out.println("----------------------------------------------------------------\n");
					System.out.println("\tTu objetivo ahora es salir de la armería y dirigirte a la puerta principal para poder salir con vida de la Comisaría.\n");
					System.out.println("\t\tAl salir de la armería, te encuentras con un Licker, este ha estado escuchando como rebuscabas en la armería y te estaba esperando...\n");
					
					do {
						System.out.println("\t\t~~~~ Pulsa 1 para lanzar el dado y ver que ocurre... ~~~~\n");
						lanzarDado9 = teclado.nextInt();
						teclado.nextLine();
									
						if(lanzarDado9 == 1) {
							valorDado = Utilidades.lanzarDado();
							System.out.println("\t\tLanzando dado..., te ha salido: " + valorDado);
							if(valorDado == 1) {
								System.out.println("\t\t¡Has sacado un PIFIA!");
								System.out.println("\t\tEl Licker te estaba esperando, asi que nada mas salir de la armería, se abalanza sobre ti...");
								System.out.println("\t\tno te da tiempo a hacer nada...");
								licker.mordisco();
								System.out.println("\t\t" + licker.getMordisco());
								leonSKennedy.morirse();
								System.out.println("\t\t" + leonSKennedy.getMorirse());
								isActive = false;
							}else if(valorDado > 1 && valorDado < 20) {
								System.out.println("\t\t¡Buena tirada!");
								System.out.println("\t\t" + leonSKennedy.getPistola() + " pero este tipo de zombie es muy fuerte, gastas 5 balas.\n");
								leonSKennedy.municion(-5);
								System.out.println("\t\t- " + leonSKennedy.getMunicion() + " balas.\n");
							}else if(valorDado == 20) {
								System.out.println("\t\t¡CRÍTICO!");
								System.out.println("\t\t" + leonSKennedy.getEscopeta() + " y solo gastas una bala.\n");
								leonSKennedy.municion(-1);
								System.out.println("\t\t- " + leonSKennedy.getMunicion() + " balas.\n");
							}
						}
					}while(lanzarDado9 != 1);
				
				if(isActive == true) {	
					System.out.println("\tHas derrotado a un enemigo muy fuerte, ahora tienes dos opciones...\n");
					do {
						System.out.println("----------------------------------------------------------------");
						System.out.println("\t\tPulsa 1 para ir por las escaleras más cercanas y bajar rápidamente a la entrada principal, podría ser peligroso, pero es el camino más rápido.");
						System.out.println("\t\tPulsa 2 para dar un pequeño rodeo, será más lento, pero quizás es más seguro.");
						System.out.println("----------------------------------------------------------------\n");
						opcionFinal = teclado.nextInt();
						teclado.nextLine();
					}while(opcionFinal > 2);
					
					switch(opcionFinal) {
					case 1:
						System.out.println("\t\t~~~~ Has elegido el camino rápido y más peligroso ~~~~\n");
						System.out.println("\t\tGiras a la derecha por las escaleras más cercanas aunque visualizas enemigos y te diriges rápidamente hacia ellos...");
						System.out.println("\t\tUn Licker te ha oído y se dirige hacia tí entre las sombras...\n");
						
						do {
							System.out.println("\t\t~~~~ Pulsa 1 para lanzar el dado y ver que ocurre... ~~~~\n");
							lanzarDado10 = teclado.nextInt();
							teclado.nextLine();
											
							if(lanzarDado10 == 1) {
								valorDado = Utilidades.lanzarDado();
								System.out.println("\t\tLanzando dado..., te ha salido: " + valorDado);
								if(valorDado == 1) {
									System.out.println("\t\t¡Has sacado un PIFIA!");
									System.out.println("\t\tEl Licker se abalanza sobre tí...");
									System.out.println("\t\tno te da tiempo a hacer nada...");
									licker2.mordisco();
									System.out.println("\t\t" + licker2.getMordisco());
									leonSKennedy.morirse();
									System.out.println("\t\t" + leonSKennedy.getMorirse());
									isActive = false;
								}else if(valorDado > 1 && valorDado < 20) {
									System.out.println("\t\t¡Buena tirada!");
									System.out.println("\t\t" + leonSKennedy.getPistola() + " pero ya has visto que este tipo de zombie es muy fuerte, gastas 10 balas.\n");
									leonSKennedy.municion(-10);
									
									if(leonSKennedy.getMunicion() < 0) {
										System.out.println("\t\tNo te quedan balas suficientes para matar a este Licker, estás perdido...");
										licker2.mordisco();
										System.out.println("\t\t" + licker2.getMordisco());
										leonSKennedy.morirse();
										System.out.println("\t\t" + leonSKennedy.getMorirse());
										isActive = false;
									}else {
										
										System.out.println("\t\t- " + leonSKennedy.getMunicion() + " balas.\n");
										System.out.println("\t\tHAS MATADO AL LICKER.\n");
									}
								}else if(valorDado == 20) {
									System.out.println("\t\t¡CRÍTICO!");
									System.out.println("\t\t" + leonSKennedy.getEscopeta() + " y gastas 5 balas.\n");
									leonSKennedy.municion(-5);
									
									if(leonSKennedy.getMunicion() < 0) {
										System.out.println("\t\tNo te quedan balas suficientes para matar a este Licker, estás perdido...");
										licker2.mordisco();
										System.out.println("\t\t" + licker2.getMordisco());
										leonSKennedy.morirse();
										System.out.println("\t\t" + leonSKennedy.getMorirse());
										isActive = false;
									}else {
										
										System.out.println("\t\t- " + leonSKennedy.getMunicion() + " balas.\n");
										System.out.println("\t\tHAS MATADO AL LICKER.\n");
									}
								}
							}
							
						}while(lanzarDado10 != 1);
					
					if(isActive == true) {	
						System.out.println("----------------------------------------------------------------\n");
						System.out.println("\t¡CONSIGUES LLEGAR A LA ENTRADA PRINCIPAL!\n");
						System.out.println("----------------------------------------------------------------\n");
						System.out.println("\tAbres la puerta y de repente cae delante tuyo un Tyrant, el zombie modificado genéticamente, preparate para tu batalla decisiva...\n");
						System.out.println("\t\tJusto en la entrada encuentras una caja de munición, esto te podría salvar la vida...\n");
						leonSKennedy.municion(10);
						System.out.println("\t\t- " + leonSKennedy.getMunicion() + " balas.\n");
						
						System.out.println("----------------------------------------------------------------");
						System.out.println("\t¡ES HORA DEL COMBATE FINAL!");
						System.out.println("----------------------------------------------------------------\n");
						
						do {
						System.out.println("\t\t~~~~ Pulsa 1 para lanzar el dado y ver que ocurre... ~~~~\n");
						lanzarDado11 = teclado.nextInt();
						teclado.nextLine();
						
						if(lanzarDado11 == 1) {
							valorDado = Utilidades.lanzarDado();
							System.out.println("\t\tLanzando dado..., te ha salido: " + valorDado);
							if(valorDado == 1) {
								System.out.println("\t\t¡Has sacado un PIFIA!");
								System.out.println("\t\tEl Tyrant te arranca la cabeza de un mordisco...");
								System.out.println("\t\tno te da tiempo a hacer nada...");
								tyrant.ataqueTyrant();
								System.out.println("\t\t" + tyrant.getAtaqueTyrant());
								leonSKennedy.morirse();
								System.out.println("\t\t" + leonSKennedy.getMorirse());
								isActive = false;
							}else if(valorDado > 1 && valorDado < 20) {
								System.out.println("\t\t¡Buena tirada!");
								System.out.println("\t\t" + leonSKennedy.getPistola() + " pero está claro que este tipo de zombie es muy fuerte, gastas 10 balas.\n");
								leonSKennedy.municion(-10);
								
								if(leonSKennedy.getMunicion() < 0) {
									System.out.println("\t\tNo te quedan balas suficientes para matar al Tyrant, estás perdido...");
									tyrant.ataqueTyrant();
									System.out.println("\t\t" + tyrant.getAtaqueTyrant());
									leonSKennedy.morirse();
									System.out.println("\t\t" + leonSKennedy.getMorirse());
									isActive = false;
								}else {
									System.out.println("\t\tHAS MATADO AL TYRANT.\n");
									System.out.println("\t\t- " + leonSKennedy.getMunicion() + " balas.\n");
									System.out.println("----------------------------------------------------------------");
									System.out.println("HAS CONSEGUIDO SALIR DE LA COMISARÍA CON VIDA, CAMPAÑA FINALIZADA");
									System.out.println("----------------------------------------------------------------");
									System.out.println("SI QUIERES SEGUIR JUGANDO COMPRA LA EXPANSIÓN SALVANDO RACCOON CITY");
									System.out.println("----------------------------------------------------------------\n");
									if(marvinVivo == true) {
										System.out.println("----------------------------------------------------------------");
										System.out.println("HAS SALVADO A MARVIN DURANTE TU PARTIDA");
										System.out.println("OBTIENES EL LOGRO DE SALVADOR DE RACCOON CITY");
										System.out.println("----------------------------------------------------------------\n");
									}else if(marvinVivo == false) {
										System.out.println("----------------------------------------------------------------");
										System.out.println("NO HAS SALVADO A MARVIN DURANTE TU PARTIDA");
										System.out.println("OBTIENES EL LOGRO DE POLI DE MIERDA");
										System.out.println("----------------------------------------------------------------\n");
									}
									isActive = false;
								}
							}else if(valorDado == 20) {
								System.out.println("\t\t¡CRÍTICO!");
								System.out.println("\t\t" + leonSKennedy.getEscopeta() + " y gastas 5 balas.\n");
								leonSKennedy.municion(-5);
								
								if(leonSKennedy.getMunicion() < 5) {
									System.out.println("\t\tNo te quedan balas suficientes para matar al Tyrant, estás perdido...");
									tyrant.ataqueTyrant();
									System.out.println("\t\t" + tyrant.getAtaqueTyrant());
									leonSKennedy.morirse();
									System.out.println("\t\t" + leonSKennedy.getMorirse());
									isActive = false;
								}else {
									System.out.println("\t\tHAS MATADO AL TYRANT.\n");
									System.out.println("\t\t- " + leonSKennedy.getMunicion() + " balas.\n");
									System.out.println("----------------------------------------------------------------");
									System.out.println("HAS CONSEGUIDO SALIR DE LA COMISARÍA CON VIDA, CAMPAÑA FINALIZADA");
									System.out.println("----------------------------------------------------------------");
									System.out.println("SI QUIERES SEGUIR JUGANDO COMPRA LA EXPANSIÓN SALVANDO RACCOON CITY");
									System.out.println("----------------------------------------------------------------\n");
									if(marvinVivo == true) {
										System.out.println("----------------------------------------------------------------");
										System.out.println("HAS SALVADO A MARVIN DURANTE TU PARTIDA");
										System.out.println("OBTIENES EL LOGRO DE SALVADOR DE RACCOON CITY");
										System.out.println("----------------------------------------------------------------\n");
									}else if(marvinVivo == false) {
										System.out.println("----------------------------------------------------------------");
										System.out.println("NO HAS SALVADO A MARVIN DURANTE TU PARTIDA");
										System.out.println("OBTIENES EL LOGRO DE POLI DE MIERDA");
										System.out.println("----------------------------------------------------------------\n");
									}
									isActive = false;
								}
							}
						}
						
						}while(lanzarDado11 != 1);
					}
						break;
					
					case 2:
						System.out.println("\t\t~~~~ Has elegido el camino lento pero más seguro ~~~~\n");
						System.out.println("\t\tDas un rodeo y encuentras las escaleras de emergencia, te dejan más lejos pero no oyes nada sospechoso.");
						System.out.println("\t\tConsigues llegar a la entrada principal sin encontrarte ningun zombie, menuda suerte...\n");
						
						System.out.println("----------------------------------------------------------------");
						System.out.println("\tABRES LA PUERTA PRINCIPAL");
						System.out.println("----------------------------------------------------------------\n");
						System.out.println("\t\tDas el primer paso apra salir de la Comisaría y de repente cae un Tyrant delante tuyo causando un gran estruendo... Estás jodido...\n");
						
						do {
							System.out.println("\t\t~~~~ Pulsa 1 para lanzar el dado y ver que ocurre... ~~~~\n");
							lanzarDado12 = teclado.nextInt();
							teclado.nextLine();
							
							if(lanzarDado12 == 1) {
								valorDado = Utilidades.lanzarDado();
								System.out.println("\t\tLanzando dado..., te ha salido: " + valorDado);
								
								if(valorDado == 1) {
									System.out.println("\t\t¡Has sacado un PIFIA!");
									System.out.println("\t\tEl Tyrant te arranca la cabeza de un mordisco...");
									System.out.println("\t\tno te da tiempo a hacer nada...");
									tyrant.ataqueTyrant();
									System.out.println("\t\t" + tyrant.getAtaqueTyrant());
									leonSKennedy.morirse();
									System.out.println("\t\t" + leonSKennedy.getMorirse());
									isActive = false;
								}else if(valorDado > 1 && valorDado < 20) {
									System.out.println("\t\t¡Buena tirada!");
									System.out.println("\t\t" + leonSKennedy.getPistola() + " pero está claro que este tipo de zombie es muy fuerte, gastas 10 balas.\n");
									leonSKennedy.municion(-10);
									
									if(leonSKennedy.getMunicion() < 10) {
										System.out.println("\t\tNo te quedan balas suficientes para matar al Tyrant, estás perdido...");
										tyrant.ataqueTyrant();
										System.out.println("\t\t" + tyrant.getAtaqueTyrant());
										leonSKennedy.morirse();
										System.out.println("\t\t" + leonSKennedy.getMorirse());
										isActive = false;
									}else {
										System.out.println("\t\t- " + leonSKennedy.getMunicion() + " balas.\n");
										System.out.println("\t\tHAS MATADO AL TYRANT\n.");
										System.out.println("----------------------------------------------------------------");
										System.out.println("HAS CONSEGUIDO SALIR DE LA COMISARÍA CON VIDA, CAMPAÑA FINALIZADA");
										System.out.println("----------------------------------------------------------------\n");
										System.out.println("----------------------------------------------------------------");
										System.out.println("SI QUIERES SEGUIR JUGANDO COMPRA LA EXPANSIÓN SALVANDO RACCOON CITY");
										System.out.println("----------------------------------------------------------------\n");
										if(marvinVivo = true) {
											System.out.println("----------------------------------------------------------------");
											System.out.println("HAS SALVADO A MARVIN DURANTE TU PARTIDA\n");
											System.out.println("OBTIENES EL LOGRO DE SALVADOR DE RACCOON CITY\n");
											System.out.println("----------------------------------------------------------------\n");
										}else if(marvinVivo = false) {
											System.out.println("----------------------------------------------------------------");
											System.out.println("NO HAS SALVADO A MARVIN DURANTE TU PARTIDA\n");
											System.out.println("OBTIENES EL LOGRO DE POLI DE MIERDA\n");
											System.out.println("----------------------------------------------------------------\n");
										}
										isActive = false;
									}
								}else if(valorDado == 20) {
									System.out.println("\t\t¡CRÍTICO!");
									System.out.println("\t\t" + leonSKennedy.getEscopeta() + " y gastas 5 balas.\n");
									leonSKennedy.municion(-5);
									
									if(leonSKennedy.getMunicion() < 5) {
										System.out.println("\t\tNo te quedan balas suficientes para matar al Tyrant, estás perdido...");
										tyrant.ataqueTyrant();
										System.out.println("\t\t" + tyrant.getAtaqueTyrant());
										leonSKennedy.morirse();
										System.out.println("\t\t" + leonSKennedy.getMorirse());
										isActive = false;
									}else {
										System.out.println("\t\tHAS MATADO AL TYRANT.\n");
										System.out.println("\t\t- " + leonSKennedy.getMunicion() + " balas.\n");
										System.out.println("----------------------------------------------------------------");
										System.out.println("HAS CONSEGUIDO SALIR DE LA COMISARÍA CON VIDA, CAMPAÑA FINALIZADA");
										System.out.println("SI QUIERES SEGUIR JUGANDO COMPRA LA EXPANSIÓN SALVANDO RACCOON CITY");
										System.out.println("----------------------------------------------------------------\n");
										if(marvinVivo = true) {
											System.out.println("----------------------------------------------------------------");
											System.out.println("HAS SALVADO A MARVIN DURANTE TU PARTIDA");
											System.out.println("OBTIENES EL LOGRO DE SALVADOR DE RACCOON CITY");
											System.out.println("----------------------------------------------------------------\n");
										}else if(marvinVivo = false) {
											System.out.println("----------------------------------------------------------------");
											System.out.println("NO HAS SALVADO A MARVIN DURANTE TU PARTIDA");
											System.out.println("OBTIENES EL LOGRO DE POLI DE MIERDA");
											System.out.println("----------------------------------------------------------------\n");
										}
										isActive = false;
									}
								}
							}
						}while(lanzarDado12 != 1);
						break;
					}
					
				break;
				}
				
				}
				}
				}
				}
			}while(isActive == true);
			System.out.println("----------------------------------------------------------------\n");
			System.out.println("FIN DEL JUEGO\n");
			System.out.println("----------------------------------------------------------------\n");
			
			System.out.println("¿Quieres volver a jugar?\n");
		}while(menu != 0);	
	}

}
