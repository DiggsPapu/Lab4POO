import java.util.*;

public class Reproduccion implements iReproduccion{
    int posicionCorrecta = 0;
    ArrayList<Canciones> ListaReproduccion = new ArrayList<Canciones>();
    ArrayList<Canciones> ListaReproduccion2 = new ArrayList<Canciones>();

    public Reproduccion(){
        Canciones song1 = new Canciones("Bad Habit", "Steve Lacy", "POP");
        Canciones song2 = new Canciones("Titi me pregunto", "Bad Bunny", "Funko Remix Digital");
        Canciones song3 = new Canciones("El programa", "Juanpablo Solis", "Salsa");
        ListaReproduccion.add(song1);
        ListaReproduccion.add(song2);
        ListaReproduccion.add(song3);

        Canciones song4 = new Canciones("Party in the U.S.A.", "Miley Cyrus", "POP");
        Canciones song5 = new Canciones("Levitating", "Dua Lipa", "Dance/Electrónica");
        Canciones song6 = new Canciones("Escuintla", "Adrian Recinos", "Bachata");
        ListaReproduccion2.add(song4);
        ListaReproduccion2.add(song5);
        ListaReproduccion2.add(song6);
    }

    public ArrayList<Canciones> getListaReproduccion() {
        return ListaReproduccion;
    }

    public void setListaReproduccion(ArrayList<Canciones> listaReproduccion) {
        ListaReproduccion = listaReproduccion;
    }
    
    public String seleccionarListaReproduccion(){
        String resp = "Esta playlist ha sido seleccionada";
        
        return resp;
    }

    public String cambiarCancion(){
        String resp = "Se ha cambiado de cancion";

        return resp;
    }

    public String escucharCancion(){
        String resp = "Se esta escuchando esta cancion: ";

        return resp;
    }

    public ArrayList<Canciones> getListaReproduccion2() {
        return ListaReproduccion2;
    }

    public void setListaReproduccion2(ArrayList<Canciones> listaReproduccion2) {
        ListaReproduccion2 = listaReproduccion2;
    }

    public int getPosicionCorrecta() {
        return posicionCorrecta;
    }

    public void setPosicionCorrecta(int posicionCorrecta) {
        this.posicionCorrecta = posicionCorrecta;
    }

}
