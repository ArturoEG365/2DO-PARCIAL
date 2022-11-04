import java.util.Scanner;
public class ProgramaTablas {
	public static void main(String[] args) {
		int resultado = 0;
		System.out.println("Ingresa la tabla");
		Scanner leer = new Scanner(System.in);
		int tabla = leer.nextInt();
		System.out.println("Ingresa hasta donde");
		int numero = leer.nextInt();
		for(int a = 1; a <= numero; a++){
		   resultado = tabla * a;
	       System.out.println(tabla + "×"+ a + "="  +  resultado);
		}
		
	}
}