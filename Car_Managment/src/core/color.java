package core;

public enum color {
	WHITE(5000),BLACK(10000),RED(2000),GREY(8000);
	
	private double additionalcost;
	private color(double additionalcost)
	{
		this.additionalcost=additionalcost;
	}
	
	public void setAdditionalcost(double additionalcost)
	{
		this.additionalcost=additionalcost;
		
	}
	public double getAddionalcost()
	{
		return additionalcost;
	}
	
}
