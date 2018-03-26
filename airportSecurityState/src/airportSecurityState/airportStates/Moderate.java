package airportSecurityState.airportStates;

import airportSecurityState.util.MyLogger;


public class Moderate implements AirportStateI{

    private AirportState state;
    
    /**
     * constructor of Moderate state class
     * @param newState
     */
    Moderate(AirportState newState){
        
        state= newState;
        MyLogger.writeMessage("Hello from Moderate class", MyLogger.DebugLevel.CONSTRUCTOR);
        
    }

    /**
     * override method of interface AirportStateI
     * @param h
     */
    @Override
    public void tightenOrLoosenSecurity(Helper h){
        
        int avgTraf=h.avgTraf();
        int avgPro=h.avgPro();
  
        if(avgTraf >=8 || avgPro >= 2){
            state.r.storeNewResult("2 4 6 8 10");
            MyLogger.writeMessage("2 4 6 8 10", MyLogger.DebugLevel.IN_RUN);
            state.getHigh();
            
        }else if(avgTraf >=0 && avgTraf < 4 || avgPro >= 0 && avgPro <1){
            state.r.storeNewResult("2 3 5 8 9");
            MyLogger.writeMessage("1 3 5 7 9", MyLogger.DebugLevel.IN_RUN);
            state.getLow();
            
        }else{
           state.r.storeNewResult("1 3 5 7 9");
           MyLogger.writeMessage("2 3 5 8 9", MyLogger.DebugLevel.IN_RUN);
            state.getModerate();
        }
        
        
    }
    
}
