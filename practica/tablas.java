import java.util.Scanner;

public class tablas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num;
        
        while (true) {
            // Imprimir mensaje y pedir número
            System.out.print("Ingrese el número de la tabla que desea (ingrese 0 para salir): ");
            num = sc.nextInt();
            
            if (num == 0) {
                System.out.println("Has cerrado sesión.");
                break; // Salir del bucle si el usuario ingresa 0
            } else {
                // Calcular y mostrar la tabla de multiplicar
                for (int i = 1; i <= 10; i++) {
                    int resul = num * i;
                    System.out.println(num + " x " + i + " = " + resul);
                }
            }
        }
        
        sc.close(); // Cerrar el Scanner al final
    }
}