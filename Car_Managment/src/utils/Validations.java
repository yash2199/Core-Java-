package utils;

import java.time.LocalDate;
import core.Car;
import core.color;
import custom_exception.InvalidInputException;

public class Validations {
	//parse and validate :check wheather car color present or not 
public static color parseandvalidate(String clr) throws IllegalArgumentException
{
return color.valueOf(clr.toUpperCase());	
}
//add a method to parse n validate manu. date : after 1st Jan 2022
public static LocalDate validatedate(String date) throws InvalidInputException
{
	LocalDate manufck=LocalDate.parse(date);
	LocalDate checkdate = LocalDate.of(22,1,1);
	if(manufck.isBefore(checkdate))
		throw new InvalidInputException("please enter correct date");
		return manufck;
}

//add a method to validate all i/ps
/*String chasis_no, core.color color, double baseprice, Date manudate, String companyname,
			boolean isavailable*/
public static Car validateallinputs(String chasis_no,String col,double price,String manufacturedate,String company)throws IllegalArgumentException,InvalidInputException
{
	color colour=parseandvalidate(col);
	LocalDate validate=validatedate(manufacturedate);
	return new Car(chasis_no,colour,price,validate,company);
	}


}
