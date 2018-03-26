
package airportSecurityState.driver;

import airportSecurityState.airportStates.AirportState;
import airportSecurityState.airportStates.Helper;
import airportSecurityState.airportStates.High;
import airportSecurityState.airportStates.Low;
import airportSecurityState.airportStates.Moderate;
import airportSecurityState.util.FileProcessor;
import airportSecurityState.util.MyLogger;
import java.io.BufferedReader;
import java.io.FileReader;



public class Driver {
    
    
    public static void main(String args[])throws Exception{
             
   
        String input=null;
        String output=null;
        String debugInputS=null;
        if(args.length != 3){
            throw new RuntimeException("Expected 3 args");
        }
        else{
            input=args[0];
            output=args[1];
            debugInputS=args[2];
        }
        
        int debugInputI=Integer.parseInt(debugInputS);
        if(debugInputI>=0 && debugInputI<=4)
            MyLogger.setDebugValue(debugInputI);
        else
            throw new RuntimeException("DebugValue should be in the range of 0 to 4");
            
    
        try{
            
            
        BufferedReader r=new BufferedReader(new FileReader(input));
        FileProcessor fp=new FileProcessor(r,input);
       
       
        
        AirportState demo=new AirportState(output);
        Helper h=new Helper(demo);
        
        
        
        
        for(int i=0;i<fp.countLines;i++)
        {
            String in=fp.readLine();
            
            h.stringSplitter(in);
            
          
          
            if(demo.getState() instanceof Low){
                
                demo.getState().tightenOrLoosenSecurity(h);
              
            }else if(demo.getState() instanceof High){
              
                demo.getState().tightenOrLoosenSecurity(h);
              
            }else if(demo.getState() instanceof Moderate){
              
                demo.getState().tightenOrLoosenSecurity(h);
              
            }
            
            
        }
        
        demo.r.writeToFile("");
        
        }catch(Exception ex){
    
        }
        
        
    
    }

}
