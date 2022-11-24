import java.util.*;

public class Canciones {
    String Nombre; 
    String Autor; 
    ArrayList<String> Canciones = new ArrayList<String>();

    public Canciones(){
        Nombre = "";
        Autor = "";
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public ArrayList<String> getCanciones() {
        return Canciones;
    }

    public void setCanciones(ArrayList<String> canciones) {
        Canciones = canciones;
    }
}
