import java.util.ArrayList;
import java.util.Collections;
public class Metodos {

        /**
         *Devuelve los residuos en orden inverso al dividir el numero dado dentro de 16
         * @param numero
         * @return
         */
        public static ArrayList<Integer> residuosAlReves(int numero) {
            ArrayList<Integer> residuos = new ArrayList<Integer>();
            while (numero > 0) {
                int residuo = numero % 16;
                residuos.add(residuo);
                numero /= 16;
            }
            Collections.reverse(residuos);
            return residuos;
        }

        /**
         * Si el valor es mayor a 10 lo cambia por su correspondiento en el codigo hexadecimal
         * @param numero
         * @return
         */
        public static String convertirHexadecimal(int numero) {
            if (numero < 10) {
                return String.valueOf(numero);
            } else {
                char hex = (char) (numero + 55);
                return String.valueOf(hex);
            }
        }

        /**
         * Realiza la debida conversión
         * @param numero
         * @return
         */

        public static String convertirDecimalAHexadecimal(int numero) {
            ArrayList<Integer> residuos = residuosAlReves(numero);
            StringBuilder resultado = new StringBuilder();
            for (int residuo : residuos) {
                resultado.append(convertirHexadecimal(residuo));
            }
            return resultado.toString();
        }
        /////////////////////////////////////////////////////////////////////


        /**
         * Conviere de hexadecimal a decimal
         * @param str
         * @return
         */
        public static int conversor(String str) {
            int decimal = 0;
            int position = str.length() - 1; // Inicia de la posición más alta

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (Character.isDigit(c)) {
                    int numero = Integer.parseInt(String.valueOf(c));
                    decimal += (numero * Math.pow(16, position));
                } else if (Character.isLetter(c)) {
                    int letter = Character.toUpperCase(c) - 'A' + 10; // Convierte a mayusculas y usa el valor ASCII
                    decimal += (letter * Math.pow(16, position));
                }
                position--;
            }

            return decimal;
        }


    }
