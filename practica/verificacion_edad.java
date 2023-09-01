import java.util.Scanner;

public class verificacion_edad {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num;
        int meses=0;
        int mayor=0;
        int menor=0;

        while (true) {
            // Imprimir mensaje y pedir número
            System.out.print("Ingresa tu edad porfavor ");
            num = sc.nextInt();
            
            if (num < 0) {
                System.out.println("Has cerrado sesión.");
                break; // Salir del bucle si el usuario ingresa 0
            } else if (num >=18 ){
                mayor++;
            }else if (num <18 & num >0){
                menor++;
            }else if (num ==0){
                meses++;
            }
       
    }
     System.out.println("menores de edad "+menor);
    System.out.println("mayores de edad "+mayor);
    System.out.println("bebes "+meses);
    sc.close(); // Cerrar el Scanner al final
  }
}