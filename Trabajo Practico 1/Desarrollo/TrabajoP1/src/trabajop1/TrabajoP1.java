package trabajop1;
import java.util.Scanner;

public class TrabajoP1 {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Intruzca el radio del circulo:");
        int radio = Integer.parseInt(valor.nextLine());
        double area = Math.PI*(Math.pow(radio, 2));
        System.out.println("El area del circulo es: " + area);
        
    }
    
}
