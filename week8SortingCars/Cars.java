/********************************************************
 *
 *  Project :  Week 8 Project Sorting Cars
 *  File    :  Cars.java
 *  Name    :  Jia Gapuz
 *  Date    :  10/21/2023
 *
 *  Description : 
 *
 *    1) The following code sorts cars given attributes such as color, make, year, and license plate number
 *    2) Arrays
 *    3) Selection sort, Insertion sort, and Shell sort
 *    4) Cars.csv files
 *    5) Sort.csv
 *
 *  Changes :  No changes since 10/21/2023
 *
 ********************************************************/
package week8SortingCars;

public class Cars implements Comparable<Cars>
{
    private String licence_number;
    private String state;
    private int year;
    private String color;
    private String model;
   
    
     //Parsing Constructor
    public Cars(String record)//09:08:45
    {
        String[] fields =  record.split(",");
        licence_number = fields[0];
        state = fields[1];
        year = Integer.parseInt(fields[2]);
        color = fields[3];
        model = fields[4];
        
       
    }
    
    public String toString()
    {
    	return String.format("  %d,   %s,   %s,   %s,   %s" ,this.year, this.state, this.licence_number, this.color, this.model);
    }


   public int compareTo(Cars o) 
   {
	   if (this.year < o.year) return -1;
	   if (this.year > o.year) return +1;
	   
	   if (this.state.compareTo(o.state) == -1) return -1;
	   if (this.state.compareTo(o.state) == 1) return +1; 
	   
	   if (this.licence_number.compareTo(o.state) == -1) return -1;
	   if (this.licence_number.compareTo(o.state) == 1) return +1; 
	   
	   
	   return 0;
   }
   
   
    
}

