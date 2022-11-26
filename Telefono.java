import java.util.*;

public class Telefono {
    ArrayList<Contacto> ListaContactos = new ArrayList<Contacto>();
    String Nombre;
    String Apellido; 
    
    public Telefono(String pNombre, String pApellido){
        Contacto contacto1 = new Contacto("Franz", "Forkel");
        Contacto contacto2 = new Contacto("JuanPablo", "Solis");
        Contacto contacto3 = new Contacto("Adrian", "Recinos");
        ListaContactos.add(contacto1);
        ListaContactos.add(contacto2);
        ListaContactos.add(contacto3);
    }

    public String Conectar(){
        String resp = "El telefono se ha conectado";

        return resp;
    }

    public String desconectar(){
        String resp = "El telefono se ha desconectado";

        return resp;
    }

    public String MostrarContactos(){
        String resp = "Contactos Disponibles";

        return resp;
    }

    public String LlamarContacto(){
        String resp = "Llamando....";

        return resp;
    }

    public String FinalizarLLamada(){
        String resp = "La llamada ha sido finalizada";

        return resp;
    }

    public String PonerEnEspera(){
        String resp = "La llamada se puso en espera";

        return resp;
    }
}
