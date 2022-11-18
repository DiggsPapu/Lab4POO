public interface IStereo {
public boolean getOnOff();
public void setOnOff(boolean onOff);
public int getVol();
public void setVol(int vol);
public String getMode();
public void setMode(String mode);  
public void changeSong(int set);
public void callContact(int set);
public int getPersonaInCall();
public void setConnectPhone(boolean set);
public boolean getInCall();
public void setInCall(boolean set);

} 
