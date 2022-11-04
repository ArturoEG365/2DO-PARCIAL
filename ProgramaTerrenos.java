public class ProgramaTerrenos {
	public static void main(String[] args) {
		int forma;
		float base, altura, area = 0, precio = 0, metro = 0;
		forma = 3;  // (1) cua   (2)recta (3)trian
		base = 24;
		altura = 19;
		System.out.println(":::Programa terrenos:::\n\n");
		System.out.println("1.- Cuadrado \n2.- Rectangulo \n3.- Triangulo");
		//Comienza a sacar el area segun selección
		if (forma == 1) {
			System.out.println("\nLa forma es un Cuadrado");
			area = (base * base);
			System.out.println("Base:(" + base + "m)^2 =" + area + "m^2");
		} else {
			if (forma == 2) {
				System.out.println("\nLa forma es un Rectangulo");
				area = (base * altura);
				System.out.println("Base:(" + base + "m) × Altura:(" + altura + "m) = " +  area + ("m^2"));
			} else {
				if (forma == 3) {
					System.out.println("\nLa forma es un Triangulo");
					area = ((base * altura) / 2);
					System.out.println("(Base:(" + base + "m) × Altura:(" + altura + "m)  /2)   = " +  area + ("m^2"));
				}
			}
		}
		//termina la anidación de if
		if (area >= 0  && area <= 200) { //aqui saco el precio segun el area
			precio = area * 2000;
			metro = 2000;
		} else {
			if (area >= 201  && area <= 300) {
				precio = area * 1800;
				metro = 1800;
			} else {
				if (area >= 301  && area <= 500) {
					precio = area * 1600;
					metro = 1600;
				} else {
					if (area >= 501) {
						precio = area * 1400;
						metro = 1400;
					}
				}
			}
		};//desde aqui imprimo resultados
		System.out.println("\nEl metro cuadrado te cuesta: $" + metro);
		System.out.println("Total a pagar: $" + precio);
		System.out.println("\n\n***ArturoEG***");
	}
}