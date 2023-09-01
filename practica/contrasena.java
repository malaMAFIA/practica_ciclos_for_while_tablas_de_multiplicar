import java.security.SecureRandom;
import java.util.Scanner;

public class contrasena {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean repetir = true;

        while (repetir) {

            String caracteresPermitidos = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";
            SecureRandom random = new SecureRandom();
            StringBuilder contrasenaGenerada = new StringBuilder();

            while (true) {
                System.out.println("Ingresa la longitud de la contraseña deseada:");
                int longitud = entrada.nextInt();

                if (longitud < 8) {
                    System.out.println("La longitud debe ser mayor que 7.");

                    break;
                } else if (longitud >= 8 && longitud < 20) {
                    for (int i = 0; i < longitud; i++) {
                        int indiceAleatorio = random.nextInt(caracteresPermitidos.length());
                        char caracterAleatorio = caracteresPermitidos.charAt(indiceAleatorio);
                        contrasenaGenerada.append(caracterAleatorio);
                    }
                } else if (longitud > 20) {
                    System.out.println("demasiados caracteres");

                    break;
                }
                System.out.println("Contraseña generada: " + contrasenaGenerada.toString());
            }
        }
        entrada.close();
    }
}