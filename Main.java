
/**
 * Codigo que convierte decimal a hexadecimal y viceverse.
 * Integrantes: Irving Acosta y Silvia Illescas
 * Assembler - Seccion 30
 * Catedrática: Kimberly Barrera
 * Auxiliares: Fabián Juaréz, Sara Pérez
 */
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int option;

            System.out.println("Ingrese una opción:\n(1)Convertir de decimal a hexadecimal\n(2)Convertir de hexadecimal a decimal\n(3)Salir" );
            option = sc.nextInt();

            while (option !=3) {
                switch (option) {
                    case 1:
                        System.out.println("Ingrese el numero decimal");
                        int numeroDecimal = sc.nextInt();
                        String numeroHexadecimal = Metodos.convertirDecimalAHexadecimal(numeroDecimal);
                        System.out.println("El número " + numeroDecimal + " en hexadecimal es:0x " + numeroHexadecimal);
                        System.out.println("Ingrese una opción:\n(1)Convertir de decimal a hexadecimal\n(2)Convertir de hexadecimal a decimal\n(3)Salir" );
                        option = sc.nextInt();


                    case 2:
                        System.out.println("Ingrese el numero hexadecimal");
                        String numeroHexadecimal2 = sc.next();
                        int numeroDecimal2 = Metodos.conversor(numeroHexadecimal2);
                        System.out.println("El número " + numeroHexadecimal2 + " en decimal es: " + numeroDecimal2);
                        System.out.println("Ingrese una opción:\n(1)Convertir de decimal a hexadecimal\n(2)Convertir de hexadecimal a decimal\n(3)Salir" );
                        option = sc.nextInt();

                }
            }

        }

    }
