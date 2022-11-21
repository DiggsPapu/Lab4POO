import java.util.ArrayList;
import java.util.Scanner;

public class Vista {
    private Scanner scan;
    public String eleccion;
    public int eleccion2;
    private boolean terminar = false;

    public Vista(){
        scan = new Scanner(System.in);
    }

    public String menu(){
        System.out.println("BIENVENIDO A MERCEDES BENZ AMG GTR BLACK SERIES");
        System.out.println("1) Subir/Bajar Volumen");
        System.out.println("2) Modo Radio");
        System.out.println("3) Modo Reproduccion");
        System.out.println("4) Modo telefono");
        System.out.println("5) Modo Productividad");
        System.out.println("6) Apagar");

        return eleccion = scan.nextLine();
    }

    public void Invalido(){
        System.out.println("Esta opcion es invalida");
    }

    public void Salir(){
        System.out.println("Apagando......");
    }
}
