import java.util.Scanner;

public class Vista {
    private Scanner scan;
    public String eleccion;
    public int eleccion2;
    public double eleccion3;
    private boolean terminar = false;
    int posicionCancion = 0;

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

        return eleccion = scan.next();
    }

    public String Volumen(){
        System.out.println("1) Subir volumen");
        System.out.println("2) Bajar Volumen");

        return eleccion = scan.next();
    }

    public String Reproduccion(){
        System.out.println("1) Seleccion lista de reproduccion");
        System.out.println("2) Cambiar Cancion");
        System.out.println("3) Escuchar cancion");

        return eleccion = scan.next();
    }

    public String EscogerPlaylist(){
        System.out.println("1) Escoger Playlist 1");
        System.out.println("2) Escoger Playlist 2");

        return eleccion = scan.next();
    }

    public void SeleccionarPlaylist(Reproduccion newPlaylist){
        for (int i = 0; i < newPlaylist.ListaReproduccion.size(); i++) {
            System.out.println("Autor: "+ newPlaylist.ListaReproduccion.get(i).getAutor());
            System.out.println("Cancion: "+ newPlaylist.ListaReproduccion.get(i).getNombre());
            System.out.println("Genero: "+ newPlaylist.ListaReproduccion.get(i).getGenero());
        }
    }

    public void SeleccionarPlaylist2(Reproduccion newPlaylist2){
        for (int i = 0; i < newPlaylist2.ListaReproduccion2.size(); i++) {
            System.out.println("Autor: "+ newPlaylist2.ListaReproduccion2.get(i).getAutor());
            System.out.println("Cancion: "+ newPlaylist2.ListaReproduccion2.get(i).getNombre());
            System.out.println("Genero: "+ newPlaylist2.ListaReproduccion2.get(i).getGenero());
        }
    }

    public String CambiarCancion(){
        System.out.println("1) Cambiar cancion para adelante");
        System.out.println("2) Cambiar cancion para atras");

        return eleccion = scan.next();
    }

    public void InfoCancion(Reproduccion newPlaylist){
        System.out.println("Autor: "+ newPlaylist.ListaReproduccion.get(newPlaylist.posicionCorrecta).getAutor());
        System.out.println("Cancion: "+ newPlaylist.ListaReproduccion.get(newPlaylist.posicionCorrecta).getNombre());
        System.out.println("Genero: "+ newPlaylist.ListaReproduccion.get(newPlaylist.posicionCorrecta).getGenero());
    }

    public String Radio(){
        System.out.println("1) Cambiar Banda");
        System.out.println("2) Cambiar emisora");
        System.out.println("3) Guardar emisora");
        System.out.println("4) Cargar emisora");

        return eleccion = scan.next();
    }

    public String Emisora(){
        System.out.println("1) Cambiar emisora para adelante");
        System.out.println("2) Cambiar emisora para atras");

        return eleccion = scan.next();
    }

    public void GuardarEmisora(Radio newRadio){
        System.out.println("Escriba la emisora que desea guardar");
        eleccion3 = scan.nextDouble();
        scan.nextLine();
        newRadio.setEmisora(eleccion3);
    }

    public void SeleccionarEmisora(Radio newRadio){
        for (int i = 0; i < newRadio.ListaEmisoras.size(); i++) {
            System.out.println("Emisora: "+ newRadio.ListaEmisoras.get(i).getEmisora());
        }
    }

    public String Telefono(){
        System.out.println("1) Conectar/Desconectar Telefono");
        System.out.println("2) Mostrar Contactos");
        System.out.println("3) Llamar a contacto");
        System.out.println("4) Finalizar Llamada");
        System.out.println("5) Poner llamada en espera");

        return eleccion = scan.next();
    }

    public String ConectarDesconectar(){
        System.out.println("1) Conectar Telefono");
        System.out.println("2) Desconectar Telefono");

        return eleccion = scan.next();
    }

    public void MostrarContactos(Telefono newContacto){
        for (int i = 0; i < newContacto.ListaContactos.size(); i++) {
            System.out.println("Nombre: "+ newContacto.ListaContactos.get(i).getNombre());
            System.out.println("Apellido: "+ newContacto.ListaContactos.get(i).getApellido());
        }
    }

    public void Invalido(){
        System.out.println("Esta opcion es invalida");
    }

    public void Salir(){
        System.out.println("Apagando......");
    }

    public void FinPlaylist(){
        System.out.println("Ya llegaste al fin de la playlist");
    }

    //Funcion obtenida de JuanPablo Solis El mejor programador
    public void MostrarMensaje(int text) {
        System.out.println("\n" + text);
    }

    //Funcion obtenida de JuanPablo Solis El mejor programador
    public void MostrarMensaje2(String text) {
        System.out.println("\n" + text);
    }

    //Funcion obtenida de JuanPablo Solis El mejor programador
    public void MostrarMensaje3(Double text) {
        System.out.println("\n" + text);
    }
}
