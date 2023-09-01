import java.util.Scanner;

public class suma_pares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Ingresa el rango inicial: ");
            int rango1 = entrada.nextInt();

            if (rango1 < 0) {
                System.out.println("El programa se ha cerrado. ¡Hasta luego!");
                break;
            }

            System.out.println("Ingresa el rango final: ");
            int rango2 = entrada.nextInt();

            int suma = 0;

            for (int i = rango1; i <= rango2; i++) {
                if (i % 2 == 0) { // Comprueba si el número es par
                    suma += i;
                }
            }

            System.out.println("La suma de los números pares en el rango dado [" + rango1 + ", " + rango2 + "] es: " + suma);

            System.out.println("¿Deseas calcular otra suma? (Sí/No)");
            String respuesta = entrada.next().toLowerCase();

            if (!respuesta.equals("si")) {
                continuar = false;
            }
        }

        entrada.close();
    }
}