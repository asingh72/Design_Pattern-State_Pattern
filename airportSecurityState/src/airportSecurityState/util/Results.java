
package airportSecurityState.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Results implements FileDisplayInterface, StdoutDisplayInterface {
    private String finalResultPath;
    private  ArrayList<String> test = new ArrayList<String>(); 
    /**
     * constructor for Results class
     * @param fileName 
     */
    public Results(String fileName){
		finalResultPath = fileName;
            MyLogger.writeMessage("Hello from Results class", MyLogger.DebugLevel.CONSTRUCTOR);

	}
    
    /**
     * write to output file
     * @param s 
     */
    @Override
    
    public void writeToFile(String s){
        
        try{
        
            PrintWriter writer = new PrintWriter(finalResultPath);
            MyLogger.writeMessage("Writing to file", MyLogger.DebugLevel.FROM_RESULTS);
           
           
           
        for(String res:test)
        {
            
            writer.write(res+"\n");
        }
             writer.flush();
            
            
        }catch(IOException e){
        
        }
    
        
    }/**
     * Stores results to results array list 
     * @param testResults 
     */
    public void storeNewResult(String testResults){
        
        MyLogger.writeMessage("Storing new results", MyLogger.DebugLevel.IN_RESULTS);

        test.add(testResults);
    }

    //@Override
    public void writeToStdout() {
        for (String s : test){
            System.out.println(s);
	}
    }

   
    
    
    
    
 
    
}

