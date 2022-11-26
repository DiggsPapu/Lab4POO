import java.util.*;

public class Radio implements iRadio{
    String AMFM;
    double Emisora;
    ArrayList<Radio> ListaEmisoras = new ArrayList<Radio>();

    public Radio(){
        AMFM = "";
        Emisora = 0;
    }

    public String getAMFM() {
        return AMFM;
    }

    public void setAMFM(String aMFM) {
        AMFM = aMFM;
    }

    public double getEmisora() {
        return Emisora;
    }

    public void setEmisora(double emisora) {
        Emisora = emisora;
    }

    public String cambiarbanda(){
        String resp = "Se ha cambiado la Banda del radio";

        return resp;
    }

    public String cambiaremisoras(){
        String resp = "Se ha cambiado la emisora";

        return resp;
    }

    public String guardaremisora(){
        String resp = "Se ha guardado la emisora";

        return resp;
    }

    public String cargaremisora(){
        String resp = "Se ha cargado la emisora";

        return resp;
    }

    public ArrayList<Radio> getListaEmisoras() {
        return ListaEmisoras;
    }

    public void setListaEmisoras(ArrayList<Radio> listaEmisoras) {
        ListaEmisoras = listaEmisoras;
    }

   
}
