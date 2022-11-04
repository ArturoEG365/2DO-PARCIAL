import java.util.Scanner;
public class AdivinarNumero {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingesa el rango");
		int rango = leer.nextInt();
		System.out.println("Ingresa numero a adivinar de 1 a " + rango);
		int tabla = leer.nextInt();
		System.out.println("ingresa numero de intentos");
		int numero = leer.nextInt();
	    for (int a = 1; a<= numero; a++){
	        System.out.println("***********************");
	        System.out.print("Ingresa un numero de 1 a " +  rango+"\n Intento#: "+a + "      :");
	        int lect = leer.nextInt();
	        if(lect == tabla){
	            System.out.println("Felicidades, adivinaste");
	            a = numero;
	            } else {
	                if(numero == a){
	                    System.out.println("Ya perdiste");
	                    }else{
	                        System.out.println("Intenta de nuevo");
	                        }
	                }
	        }	    
	}
}