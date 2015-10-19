package slo.model;

public class SloStuff 
{
	private String yourName;
	private int randomInt;
	private int userInt;
	
	
	public SloStuff()
	{
		yourName = "";
		randomInt = 0;
		userInt = 0;
	}
	
	public SloStuff(String yourName, int randomInt, int userInt)
	{
		this.yourName = yourName;
		this.userInt = userInt;
	}
	
	
	
	
	
	// The Getters
	
	public String getYourName()
	{
		return yourName;
	}
	
	
	public int getUserInt()
	{
		return userInt;
	}
	
	
	
	
	
	
	// The Setters
	
	public void setYourName(String yourName)
	{
		this.yourName = yourName;
	}
	
	
	public void setUserInt(int userInt)
	{
		this.userInt = userInt;
	}

	
	
	public String toString()
	{
		String SloStuffInfo = "Your name is " + yourName + " and the random number was: " + userInt;
		
		return SloStuffInfo;
	}
	
	

}
