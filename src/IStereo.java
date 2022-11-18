/**
 * Interface to emulate an stereo
 */
public interface IStereo {
    /**
     * To get if on or off
     * @return
     */
public boolean getOnOff();
/**
 * To set on or off
 * @param onOff
 */
public void setOnOff(boolean onOff);
/**
 * To get the volume
 * @return
 */
public int getVol();
/**
 * To set the vol
 * @param vol
 */
public void setVol(int vol);
/**
 * To get the mode
 * @return
 */
public String getMode();
/**
 * To set the mode
 * @param mode
 */
public void setMode(String mode);  
/**
 * To change a song
 * @param set
 */
public void changeSong(int set);
/**
 * To call a contact
 * @param set
 */
public void callContact(int set);
/**
 * To get the persona that is in the call
 * @return
 */
public int getPersonaInCall();
/**
 * To set if the phone is connected
 * @param set
 */
public void setConnectPhone(boolean set);
/**
 * To get in a call
 * @return
 */
public boolean getInCall();
/**
 * To set if is in a call
 * @param set
 */
public void setInCall(boolean set);
/**
 * To get if is in fm or am
 * @return
 */
public boolean getFMAM();
/**
 * To set if is fm or am
 * @param station
 */
public void setFMAM(boolean station);
/**
 * To get the actual station
 * @return
 */
public int getActualStation();
/**
 * To set the actual station
 * @param station
 */
public void setActualStation(int station);
/**
 * to save the station
 * @param pos
 * @param station
 */
public void saveStation(int pos, int station);
} 
