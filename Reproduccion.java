import java.util.*;

public class Reproduccion implements iReproduccion{
    ArrayList<Playlist> ListaReproduccion = new ArrayList<Playlist>();

    public Reproduccion(){

    }

    /*public ArrayList<Canciones> getListaReproduccion() {
        return ListaReproduccion;
    }

    public void setListaReproduccion(ArrayList<Canciones> listaReproduccion) {
        ListaReproduccion = listaReproduccion;
    }*/
    
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

}
