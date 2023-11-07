package core;

import java.time.LocalDate;

public class Car {
/*
 *  chasisNo(string) : Unique ID, color(enum) , basePrice(double) ,
 *  manufactureDate(LocalDate),company,isAvailable*/	
	private String chasis_no;
	private color color;
	private double baseprice;
	private LocalDate manudate;
	private String Companyname;
	private boolean isavailable;//chasis_no,colour,price,validate,companyname
	public Car(String chasis_no, color color, double baseprice, LocalDate manudate, String companyname) {
		super();
		this.chasis_no = chasis_no;
		this.color = color;
		this.baseprice = baseprice;
		this.manudate = manudate;
		Companyname = companyname;
		this.isavailable = isavailable;
	}
	@Override
	public String toString() {
		return "Car [chasis_no=" + chasis_no + ", color=" + color + ", baseprice=" + baseprice + ", manudate="
				+ manudate + ", Companyname=" + Companyname + ", isavailable=" + isavailable + "]";
	}
	@Override
	public boolean equals(Object o) {
		if(o instanceof Car)
		{
			System.out.println("in equals ");
			Car c =(Car)o;
			return this.chasis_no.equals(c.chasis_no);
		}
		return false ;
	}
	
	
	
	
	
}


















