
package airportSecurityState.airportStates;


public class Helper {
    
    private int dayValue;
    private String itemValue;
    
    public int noOfTrav=0;
    public int noOfDays=1;
    public int noOfPro=0;
    
    AirportState temp;
    
    /**
     * constructor of class Helper
     * @param d
     */
    public Helper(AirportState d){
        
        
        temp= d;
        
        
    }
    /**
     * Split the input string and call the set the values of total number of prohibited items, total number of days and total number of days
     * @param s
     */
    public void stringSplitter(String s){
        String[] parts=s.split(";");
        String part1=parts[0];
        String part2=parts[3];
        String dayString[]=part1.split(":");
        int dayValue=Integer.parseInt(dayString[1]);
        String itemString[]=part2.split(":");
        String itemValue=itemString[1];
            
        noOfTrav++;
        if(dayValue==noOfDays){
        }else{
              noOfDays++;
        }
        if(itemValue.equals("Gun") || itemValue.equals("NailCutter") || itemValue.equals("Blade") || itemValue.equals("Knife"))
              noOfPro++;
        temp.set(noOfTrav,  noOfDays, noOfPro);
        
    }
    
    /**
     * return Average Traffic Per Day
     * @return
     */
    public int avgTraf(){
        
        int tempDate=temp.getNoOfDays();
        int tempTrav=temp.getNoOfTrav();
        
        int avgTraf=tempTrav/tempDate;
        return avgTraf;
  
    }
    
    /**
     * return Average Prohibited Items Per Day
     * @return
     */
    public int avgPro(){
    
        int tempDate=temp.getNoOfDays();
        int tempPro=temp.getNoOfPro();
       
        int avgPro=tempPro/tempDate;
        return avgPro;
  
    }
    
    
}
