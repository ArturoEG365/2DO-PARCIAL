public class Caballitoss {
    public static void main(String[] args) {
        int c1=0, c2=0, c3=0 , c4=0, contTirada=0,lugarCaballo=0 , a, p1=0,p2=0,p3=0,p4=0;
        System.out.println("Inicia carrera");
        while(lugarCaballo!=4){
            System.out.println("Tirada numero:" + contTirada);
            a = (int)((Math.random() * 6 + 1));
            c1 = c1 + a;
            System.out.println("Caballo 1:"+ c1 + "     El dado dio::" + a + "::");
            a = (int)((Math.random() * 6 + 1));
            c2 = c2 + a;
            System.out.println("Caballo 2:"+ c2  + "    El dado dio::" + a + "::");
            a = (int)((Math.random() * 6 + 1));
            c3 = c3 + a;
            System.out.println("Caballo 3:"+ c3  + "    El dado dio::" + a + "::");
            a = (int)((Math.random() * 6 + 1));
            c4 = c4 + a;
            System.out.println("Caballo 4:"+ c4  + "    El dado dio::" + a + "::");
            System.out.println("********");
            contTirada++;
            if(c1 >= 50){
                lugarCaballo=lugarCaballo+1;
                System.out.println("ALERTA");
                System.out.println("Ya llego el caballo 1");
                p1 = lugarCaballo;
                c1 = -1000; 
            }
            if(c2>= 50){
                lugarCaballo=lugarCaballo+1;
                System.out.println("ALERTA");
                System.out.println("Ya llego el caballo 2");
                p2 = lugarCaballo;
                c2 = -1000;
            }
            if(c3>= 50){
                lugarCaballo=lugarCaballo+1;
                System.out.println("ALERTA");
                System.out.println("Ya llego el caballo 3");
                p3 = lugarCaballo;
                c3 = -1000;
            }
            if(c4>= 50){
                lugarCaballo=lugarCaballo+1;
                System.out.println("ALERTA");
                System.out.println("Ya llego el caballo 4");
                p4 = lugarCaballo;
                c4 = -1000;
            }
        }
        System.out.println("El caballo 1 llego en: " + p1);
        System.out.println("El caballo 2 llego en: " + p2);
        System.out.println("El caballo 3 llego en: " + p3);
        System.out.println("El caballo 4 llego en: " + p4);
    }    
}

