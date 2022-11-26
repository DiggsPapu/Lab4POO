import java.util.*;

public class Canciones {
    String Nombre; 
    String Autor; 
    String Genero;

    public Canciones(String pNombre, String pAutor, String pGenero){
        Nombre = pNombre;
        Autor = pAutor;
        Genero = pGenero;
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

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }
    
}
