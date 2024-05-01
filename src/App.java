//Gustavo Rafael Fuentes Corea, 2024-1347U
import java.util.Scanner;

public class App {

    public static int tamv = 0;
    public static Scanner leer = new Scanner(System.in); 
    public static boolean condi=true;
    
    public static void main(String[] args) throws Exception {

        boolean condiciosalida = true;

        do {

            try {

                System.out.println(
                        "Ingrese el tamaño del arreglo en el rango 2 hasta 16 (El tamaño no puede ser nagativo) ");
                tamv = leer.nextInt();//10
                condiciosalida = (tamv >= 2 && tamv <= 16) ? false : true;

            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Ocurrio algo revisar");
                leer.nextLine();
            }

        } while (condiciosalida);

        //recibimos el array del metodo
        int array[] = llenado();

        System.out.println("Mostrar");

        Mostrar(array);

        System.out.println("Inversos");
        inverso(array);

    }

    public static int[] llenado() {
        int[] arreglo = new int[tamv];
        do {
            try {
            
                for (int i = 0; i < arreglo.length; i++) {
                    System.out.println("ingrese el valo [" + i + "]");
                    arreglo[i] = leer.nextInt();
                }
                condi=false;
                    
                } catch (Exception e) {
                   System.out.println(e);
                   System.out.println("Solo se permiten numeros enteros ");
                   leer.nextLine();
                }
        } while (condi);
        return arreglo;
    }

    public static void Mostrar(int[] a) {

        for (int i : a) {
            System.out.println(i);
        }

    }
    
    public static void inverso (int[]arregloinverso){

        for (int i = arregloinverso.length - 1; i >= 0; i--) {
            System.out.println(arregloinverso[i]);
            
        }
    }

}