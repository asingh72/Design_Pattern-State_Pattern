
package airportSecurityState.airportStates;

import airportSecurityState.util.MyLogger;
import airportSecurityState.util.Results;




public class AirportState{
    
    private AirportStateI low;
    private AirportStateI moderate;
    private AirportStateI high;
    
    public Results r;
    
    private int noOfTrav;
    private int noOfDays;
    private int noOfPro;
    
    private AirportStateI current;
    
    /**
     * Constructor of class AirportSate
     * @param s
     */
    public AirportState(String s){
    
        r=new Results(s);
        low= new Low(this);
        moderate= new Moderate(this);
        high= new High(this);
        
        current=low;
        
       MyLogger.writeMessage("Hello from AirportState class", MyLogger.DebugLevel.CONSTRUCTOR);

    }
    
    /**
     * return the current state
     * @return
     */
    public AirportStateI getState(){
        return current;
    }
    
    
    void setState(AirportStateI newState){
    
    
        current= newState;
    }
    
    
    public AirportStateI getLow(){
    
        return low;
    }
    
    public AirportStateI getHigh(){
    
        return high;
    }
    public AirportStateI getModerate(){
        return moderate;
        
        
    }
    
    
    /**
     * return total number of travellers
     * @return
     */
    public int getNoOfTrav(){
    
        return noOfTrav;
    }
    
    /**
     * return total number of days
     * @return
     */
    public int getNoOfDays(){
    
        return noOfDays;
        
    }
    /**
    * return total number of prohibited items
    * @return
    */
    public int getNoOfPro(){
    
        return noOfPro;
        
    }
    
    /**
     * Sets three parameters, total number of prohibited items, total number of days and total number of days
     * @param t
     * @param d
     * @param p
     */
    public void set(int t, int d, int p){
    
        noOfTrav=t;
        noOfDays=d;
        noOfPro=p;
        
    }
    
}
