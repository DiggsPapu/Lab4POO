import java.util.*;

public class Playlist {
    String NombreLista;
    ArrayList<Canciones> playlist;
    ArrayList<Canciones> playlist2;
    ArrayList<Canciones> playlist3;

    public Playlist(){
        playlist = new ArrayList<Canciones>();
        playlist.add(new Canciones("Titi me pregunto", "Bad Bunny"));
        playlist.add(new Canciones("New Rules", "Dua Lipa"));
        playlist.add(new Canciones("Bad Blood", "Taylor Swift"));
        playlist2 = new ArrayList<Canciones>();
        playlist2.add(new Canciones("Titi me pregunto2", "Bad Bunny2"));
        playlist2.add(new Canciones("New Rules2", "Dua Lipa2"));
        playlist2.add(new Canciones("Bad Blood2", "Taylor Swift2"));
        playlist3 = new ArrayList<Canciones>();
        playlist3.add(new Canciones("Titi me pregunto3", "Bad Bunny3"));
        playlist3.add(new Canciones("New Rules3", "Dua Lipa3"));
        playlist3.add(new Canciones("Bad Blood3", "Taylor Swift3"));
    }
}
