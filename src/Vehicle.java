import java.util.ArrayList;

/**
 * Vehicle
 */
public abstract class Vehicle implements IStereo{
private boolean onOff;
private int vol;
private String mode;
private boolean FMAM;
private ArrayList<String> stations;
private ArrayList<String> favStations;
private ArrayList<String> reproductionList;
private int actualsong;
private ArrayList<String> contactList;
private int actualPersonInCall;
private boolean connectphone;
private boolean inCall;
}