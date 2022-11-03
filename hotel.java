	import java.util.Scanner;
	public class hotel {
		public static void main(String[] args) {
			int Var_Des = 1;
			int deseo, deseo2, piso1=230, piso2=137, piso3=252, piso4=123, piso5=219, personas=0, piso=0, salidas=0, total = 0;
			Scanner scnr = new Scanner(System.in);
			System.out.println("****PROGRAMA HOTEL****");
			while(Var_Des == 1){//REPETIR CON ELWHILE
				try{
					System.out.println("**************************************");
					System.out.println("\n¿Que quieres hacer?\n1.-Subir personas\n2.-¿Cuantas personas hay en cada piso?\n3.-Bajar todas las personas de un piso\n4.-Bajar pesonas de todos los pisos\n5.-Mostar cuantas personas hay en el hotel y cuantas han salido\n\nPresiona cualquier otra tecla para terminar");
					deseo = scnr.nextInt();
					System.out.println("**************************************");
					if (deseo == 1) {
						System.out.println("**************************************");
						System.out.println("**********SUBIR PERSONAS**************");
						System.out.println("**************************************");
						System.out.println("Ingresa el # de personas: (MIN 1, MAX 5)");
						personas = scnr.nextInt();
						if (personas >= 1 && personas<=5) {
							System.out.println("Ingresa el # de piso: (MIN 1, MAX 5)");
							piso = scnr.nextInt();
							if (piso >= 1 && piso<=5 ) {
								if(piso==1){
									piso1 = piso1 + personas;
									System.out.println("Ya hay " + piso1 + " Personas en piso 1");
								}
								if(piso==2){
									piso2 = piso2 + personas;
									System.out.println("Ya hay " + piso2 + " Personas en piso 2");
								}
								if(piso==3){
									piso3 = piso3 + personas;
									System.out.println("Ya hay " + piso3 + " Personas en piso 3");
								}
								if(piso==4){
									piso4 = piso4 + personas;
									System.out.println("Ya hay " + piso4 + " Personas en piso 4");
								}
								if(piso==5){
									piso5 = piso5 + personas;
									System.out.println("Ya hay " + piso5 + " Personas en piso 5");
								}
							}else{
								System.out.println("Solo hay 5 pisos");
							}
						}else{
							System.out.println("El elevador acepta de 1 a 5 personas");
						}
					}else{
						if (deseo ==  2) {
							System.out.println("**************************************");
							System.out.println("**********Personas en cada piso*******");
							System.out.println("**************************************");
							System.out.println("Piso 1: " + piso1);
							System.out.println("Piso 2: " + piso2);
							System.out.println("Piso 3: " + piso3);
							System.out.println("Piso 4: " + piso4);
							System.out.println("Piso 5: " + piso5);
						}else{
							if (deseo == 3) {
								System.out.println("**************************************");
								System.out.println("**BAJAR TODAS LAS PERSONAS DE UN PISO*");
								System.out.println("**************************************");
								System.out.println("Ingresa el # de piso: (MIN 1, MAX 5)");
								piso = scnr.nextInt();
								if (piso >= 1 && piso<=5 ) {
									System.out.println("VAMOS A BAJAR A TODOS LOS DEL PISO:  " + piso);
						if(piso==1){//BAJAR EN EL ELEVADOR
							System.out.println("# DE PERSONAS EN EL PISO:  " + piso1);
							salidas = salidas + piso1;
							int aux = 1;
							while(piso1!=0){
								if (piso1 >= 5) {
									piso1 = piso1 - 5;
									System.out.println("Bajada #: " + aux + " Quedan " + piso1 + " Van 5 en el elevador");
									aux++;
								}else{
									System.out.println("Bajada #: " + aux + " Van  " + piso1 + " En el elevador");
									piso1 = 0;
									aux++;
								}
							}
						}
						if(piso==2){
							System.out.println("# DE PERSONAS EN EL PISO:  " + piso2);
							salidas = salidas + piso2;
							int aux = 1;
							while(piso2!=0){
								if (piso2 >= 5) {
									piso2 = piso2 - 5;
									System.out.println("Bajada #: " + aux + " Quedan " + piso2 + " Van 5 en el elevador");
									aux++;
								}else{
									System.out.println("Bajada #: " + aux + " Van  " + piso2 + " En el elevador");
									piso2 = 0;
									aux++;
								}
							}
						}
						if(piso==3){
							System.out.println("# DE PERSONAS EN EL PISO:  " + piso3);
							salidas = salidas + piso3;
							int aux = 1;
							while(piso3!=0){
								if (piso3 >= 5) {
									piso3 = piso3 - 5;
									System.out.println("Bajada #: " + aux + " Quedan " + piso3 + " Van 5 en el elevador");
									aux++;
								}else{
									System.out.println("Bajada #: " + aux + " Van  " + piso3 + " En el elevador");
									piso3 = 0;
									aux++;
								}
							}		 				
						}
						if(piso==4){
							System.out.println("# DE PERSONAS EN EL PISO:  " + piso4);
							salidas = salidas + piso4;
							int aux = 1;
							while(piso4!=0){
								if (piso4 >= 5) {
									piso4 = piso4 - 5;
									System.out.println("Bajada #: " + aux + " Quedan " + piso4 + " Van 5 en el elevador");
									aux++;
								}else{
									System.out.println("Bajada #: " + aux + " Van  " + piso4 + " En el elevador");
									piso4 = 0;
									aux++;
								}
							}

						}
						if(piso==5){
							System.out.println("# DE PERSONAS EN EL PISO:  " + piso5);
							int aux = 1;
							salidas = salidas + piso5;
							while(piso5!=0){
								if (piso5 >= 5) {
									piso5 = piso5 - 5;
									System.out.println("Bajada #: " + aux + " Quedan " + piso5 + " Van 5 en el elevador");
									aux++;
								}else{
									System.out.println("Bajada #: " + aux + " Van  " + piso5 + " En el elevador");
									piso5 = 0;
									aux++;
								}
							}
						}
					}else{
						System.out.println("**************************************");
						System.out.println("**********Solo hay 5 pisos************");
						System.out.println("**************************************");
					}
				}else{
					if (deseo == 4) {
						System.out.println("**************************************");
						System.out.println("*********Vaciar todos los pisos*******");
						System.out.println("**************************************");
						System.out.println("PISO 1");
						salidas = salidas + piso1;
						int aux = 1;
						while(piso1!=0){
							if (piso1 >= 5) {
								piso1 = piso1 - 5;
								System.out.println("Bajada #: " + aux + " Quedan " + piso1 + " Van 5 en el elevador");
								aux++;
							}else{
								System.out.println("Bajada #: " + aux + " Van  " + piso1 + " En el elevador");
								piso1 = 0;
								aux++;
							}
						}
						System.out.println("PISO 2");
						salidas = salidas + piso2;
						aux = 1;
						while(piso2!=0){
							if (piso2 >= 5) {
								piso2 = piso2 - 5;
								System.out.println("Bajada #: " + aux + " Quedan " + piso2 + " Van 5 en el elevador");
								aux++;
							}else{
								System.out.println("Bajada #: " + aux + " Van  " + piso2 + " En el elevador");
								piso2 = 0;
								aux++;
							}
						}
						System.out.println("PISO 3");
						salidas = salidas + piso3;
						aux = 1;
						while(piso3!=0){
							if (piso3 >= 5) {
								piso3 = piso3 - 5;
								System.out.println("Bajada #: " + aux + " Quedan " + piso3 + " Van 5 en el elevador");
								aux++;
							}else{
								System.out.println("Bajada #: " + aux + " Van  " + piso3 + " En el elevador");
								piso3 = 0;
								aux++;
							}
						}
						System.out.println("PISO 4");
						salidas = salidas + piso4;
						aux = 1;
						while(piso4!=0){
							if (piso4 >= 5) {
								piso4 = piso4 - 5;
								System.out.println("Bajada #: " + aux + " Quedan " + piso4 + " Van 5 en el elevador");
								aux++;
							}else{
								System.out.println("Bajada #: " + aux + " Van  " + piso4 + " En el elevador");
								piso4 = 0;
								aux++;
							}
						}
						System.out.println("PISO 5");
						salidas = salidas + piso5;
						aux = 1;
						while(piso5!=0){
							if (piso5 >= 5) {
								piso5 = piso5 - 5;
								System.out.println("Bajada #: " + aux + " Quedan " + piso5 + " Van 5 en el elevador");
								aux++;
							}else{
								System.out.println("Bajada #: " + aux + " Van  " + piso5 + " En el elevador");
								piso5 = 0;
								aux++;
							}
						}
					}else{
						if (deseo == 5) {
							System.out.println("**************************************");
							System.out.println("***********Entradas y salidas*********");
							System.out.println("**************************************");
							total = piso1 + piso2 + piso3 + piso4 + piso5;
							System.out.println("Hay: " + total + " Personas");
							System.out.println("Salieron: " + salidas + " Personas");
						}else{
							System.out.println("PROGRAMA FINALIZADO");		 					
							Var_Des = 2;
						}
					}
				}
			}
		}
		System.out.print("**************************************");
	}
	catch (Exception e) {
		System.out.println("ESTAMOS USANDO PUROS NUMEROS, ADIOS");
		Var_Des = 2;
	}
		}//AQUI TERMINA EL WHILE
	}
}