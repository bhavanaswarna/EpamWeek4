package com.epam;
import java.io.*;
import java.util.Scanner;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
class B
{
	private static final Logger LOGGER = LogManager.getLogger(B.class);
	static void meth()
	{
		double MatCost,Area;
	    Scanner sc=new Scanner (System. in);
	    LOGGER.info("Choose material cost which you want to use for construction from below");
	    LOGGER.info("1.StandardMaterial cost:1200");
	    LOGGER.info("2.AboveStandardMaterialcost:1500");
	    LOGGER.info("3.HighStandardMaterialcost:1800");
	    LOGGER.info("4.HighStandardMaterialcost and fully automated home:2500");
	    LOGGER.info("Enter the cost of material:");
	    MatCost=sc.nextDouble();
	    LOGGER.info("Enter area of house:");
	    Area=sc.nextDouble();
	    B.calculate(MatCost,Area);
	    
	    LOGGER.info("successfully executed ");
	}
	static void calculate(double t,double r)
	{
		double cost;
		cost=t*r;
		LOGGER.info("Cost of the house:"+cost);
	}
	
}
public class HouseConstruction {
	public static void main( String[] args )
    {
        B.meth();   
    }


}
