public class Controlador {
    public Vista vista;

    public Controlador(){
        vista = new Vista();
    }

    public void principal(){
        boolean terminar = false;
        Canciones newSong = new Canciones();
        Reproduccion newList = new Reproduccion();

        do {

            String opcion = vista.menu();

            switch (opcion) {
                case "1":
                    
                    break;

                case "2":
                    
                    break;

                case "3":
                    String eleccion = vista.Reproduccion();
                    if(eleccion.equals("1")){
                        
                    }
                    else if(eleccion.equals("2")){

                    }
                    else if(eleccion.equals("3")){

                    }
                    
                    break;

                case "4":
                    
                    break;

                case "5":
                    
                    break;

                case "6":
                    terminar = true;
                    vista.Salir();
                    break;
            
                default:
                    vista.Invalido();
                    break;
            }
            
        } while (!terminar);
    }
}
