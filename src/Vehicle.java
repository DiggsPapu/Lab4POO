import java.util.ArrayList;

/**
 * Vehicle
 */
public class Vehicle implements IStereo{
    /**
     * The attributes
     */
private boolean onOff;
private int vol;
private String mode;
private boolean FMAM;
private int actualStation;
private ArrayList<String> stations;
private ArrayList<Integer> favStations;
private ArrayList<String> reproductionList;
private int actualsong;
private ArrayList<String> contactList;
private int actualPersonInCall;
private boolean connectphone;
private boolean inCall;
/**
 * The hereditary by interface methods
 */
@Override
public boolean getOnOff() {
    // TODO Auto-generated method stub
    return onOff;
}
@Override
public void setOnOff(boolean onOff) {
    // TODO Auto-generated method stub
    this.onOff = onOff;
}
@Override
public int getVol() {
    // TODO Auto-generated method stub
    return vol;
}
@Override
public void setVol(int vol) {
    // TODO Auto-generated method stub
    this.vol = vol;
}
@Override
public String getMode() {
    // TODO Auto-generated method stub
    return mode;
}
@Override
public void setMode(String mode) {
    // TODO Auto-generated method stub
    this.mode = mode;

}
@Override
public void changeSong(int set) {
    // TODO Auto-generated method stub
    this.actualsong = set;
}
@Override
public void callContact(int set) {
    // TODO Auto-generated method stub
    this.actualPersonInCall = set;
}
@Override
public int getPersonaInCall() {
    // TODO Auto-generated method stub
    return actualPersonInCall;
}
@Override
public void setConnectPhone(boolean set) {
    // TODO Auto-generated method stub
    this.connectphone = set;
}
@Override
public boolean getInCall() {
    // TODO Auto-generated method stub
    return inCall;
}
@Override
public void setInCall(boolean set) {
    // TODO Auto-generated method stub
    this.inCall = set;   
}
@Override
public boolean getFMAM() {
    // TODO Auto-generated method stub
    return FMAM;
}
@Override
public void setFMAM(boolean station) {
    // TODO Auto-generated method stub
    this.FMAM = station;
}
@Override
public int getActualStation() {
    // TODO Auto-generated method stub
    return actualStation;
}
@Override
public void setActualStation(int station) {
    // TODO Auto-generated method stub
    this.actualStation = station;
}
@Override
public void saveStation(int pos, int station) {
    // TODO Auto-generated method stub
    favStations.add(pos, station);
}
public ArrayList<String> getStations() {
    return stations;
}
public ArrayList<String> getContactList() {
    return contactList;
}
public ArrayList<Integer> getFavStations() {
    return favStations;
}
public ArrayList<String> getReproductionList() {
    return reproductionList;
}
}