package tester;

import core.*;

import java.time.LocalDate;
import java.util.Scanner;
import static utils.Validations.*;

public class Test {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter car details chasis_no,col,price,manufacturedate,company");
			//String chasis_no,String col,double price,String manufacturedate,String company
			Car car = validateallinputs(sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.next());
			System.out.println(car);
			System.out.println("enter color");
			color c1=parseandvalidate(sc.next());
			System.out.println(c1);
			System.out.println("enter date");
			LocalDate d1 =validatedate(sc.next());
			System.out.println(d1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
