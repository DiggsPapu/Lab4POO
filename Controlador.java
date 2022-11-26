public class Controlador {
    public Vista vista;

    public Controlador(){
        vista = new Vista();
    }

    public void principal(){
        boolean terminar = false;
        int Volumen = 50;
        double Emisora = 95;
        Reproduccion newPlaylist = new Reproduccion();
        Productividad newProductividad = new Productividad();
        Radio newRadio = new Radio();
        Telefono newTel = new Telefono("Franz", "Forkel");
        int posicionCancion = 0;

        do {

            String opcion = vista.menu();

            switch (opcion) {
                case "1":
                    String eleccion4 = vista.Volumen();
                    if(eleccion4.equals("1")){
                        Volumen++;
                        vista.MostrarMensaje(Volumen);
                    }else if(eleccion4.equals("2")){
                        Volumen--;
                        vista.MostrarMensaje(Volumen);
                    }
                    break;

                case "2":
                    String eleccion5 = vista.Radio();
                    if(eleccion5.equals("1")){
                        vista.MostrarMensaje2(newRadio.cambiarbanda());
                    }else if(eleccion5.equals("2")){
                        String eleccion6 = vista.Emisora();
                        if(eleccion6.equals("1")){
                            Emisora = Emisora+ 0.5;
                            vista.MostrarMensaje3(Emisora);
                            vista.MostrarMensaje2(newRadio.cambiaremisoras());
                        }else if(eleccion6.equals("2")){
                            Emisora = Emisora- 0.5;
                            vista.MostrarMensaje3(Emisora);
                            vista.MostrarMensaje2(newRadio.cambiaremisoras());
                        }
                    }else if(eleccion5.equals("3")){
                        vista.GuardarEmisora(newRadio);
                        newRadio.ListaEmisoras.add(newRadio);
                        vista.MostrarMensaje2(newRadio.guardaremisora());
                    }else if(eleccion5.equals("4")){
                        vista.SeleccionarEmisora(newRadio);
                        vista.MostrarMensaje2(newRadio.cargaremisora());
                    }
                    break;

                case "3":
                    String eleccion = vista.Reproduccion();
                    posicionCancion =0;
                    if(eleccion.equals("1")){
                        String eleccion2 = vista.EscogerPlaylist();
                        if(eleccion2.equals("1")){
                            vista.SeleccionarPlaylist(newPlaylist);
                            newPlaylist.seleccionarListaReproduccion();
                        }else if(eleccion2.equals("2")){
                            vista.SeleccionarPlaylist2(newPlaylist);
                            newPlaylist.seleccionarListaReproduccion();
                        }
                    }
                    else if(eleccion.equals("2")){
                        String eleccion3 = vista.CambiarCancion();
                        if(eleccion3.equals("1")){
                            if(posicionCancion+1 <= 2){
                                posicionCancion++;
                                vista.MostrarMensaje2(newPlaylist.cambiarCancion());
                            }else{
                                vista.FinPlaylist();
                            }
                        }else if(eleccion3.equals("2")){
                            if(posicionCancion-1 < 0){
                                posicionCancion--;
                                vista.MostrarMensaje2(newPlaylist.cambiarCancion());
                            }else{
                                vista.FinPlaylist();
                            }
                        }
                    }
                    else if(eleccion.equals("3")){
                        newPlaylist.setPosicionCorrecta(posicionCancion);
                        vista.MostrarMensaje2(newPlaylist.escucharCancion());
                        vista.InfoCancion(newPlaylist);
                    }
                    
                    break;

                case "4":
                    String eleccion7 = vista.Telefono();
                    if(eleccion7.equals("1")){
                        String eleccion8 = vista.ConectarDesconectar();
                        if(eleccion8.equals("1")){
                            vista.MostrarMensaje2(newTel.Conectar());
                        }
                        else if(eleccion8.equals("2")){
                            vista.MostrarMensaje2(newTel.desconectar());
                        }
                    }
                    else if(eleccion7.equals("2")){
                        vista.MostrarContactos(newTel);
                    }
                    else if(eleccion7.equals("3")){
                        vista.MostrarMensaje2(newTel.LlamarContacto());
                    }
                    else if(eleccion7.equals("4")){
                        vista.MostrarMensaje2(newTel.FinalizarLLamada());
                    }
                    else if(eleccion7.equals("5")){
                        vista.MostrarMensaje2(newTel.PonerEnEspera());
                    }
                    break;

                case "5":
                    vista.MostrarMensaje2(newProductividad.vertiempo());
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
