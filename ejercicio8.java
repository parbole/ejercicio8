import java.util.Scanner;

public class ejercicio8{
    public static void main(String[] args) {
        double pasajeros, valor_viaje, valor_comision, resultado;
        
        System.out.print("Bienvenido" + "\n" + "Digite la cantidad de turistas que debe transportar: ");
        Scanner teclado = new Scanner(System.in);
        pasajeros = teclado.nextDouble();
        
        //tomamos como base que el colectivo puede transportar 10 personas
        resultado = Math.ceil(pasajeros / 10);
        System.out.print("El numero de viajes para transportar a los " +  pasajeros + " turistas es: " +  resultado + "\n");

        valor_viaje = pasajeros * 10000;
        
        System.out.print("Los turistas deben de pagar un total de  $" +  valor_viaje + " por el viaje. " + "\n");
        
        valor_comision = resultado * 2000;
        
        System.out.print("El conductor debera pagar $" +  valor_comision + " por los  " + resultado + " viajes que debe realizar" + "\n");
        
    }
}