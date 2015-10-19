package slo.controller;


import slo.view.SloDisplay;
import slo.model.SloStuff;

public class SloController 
{
	
	private SloDisplay myPopups;
	private SloStuff mySloStuff;
	
	
	public SloController()
	{
		myPopups = new SloDisplay();
	}
	
	
	public void start()
	{
		String yourName = myPopups.getAnswer("What is your name?");
		
		myPopups.displayResponse("Your name is: " + yourName);
		
		int randInt = (int) (Math.random()*10) +1;
		
		String tempRandomInt = myPopups.getAnswer("I'm thinking of a number between one and ten, what is it?");
		
		int randomInt;
		
		while(randomInt != randInt)
		{
			tempRandomInt = myPopups.getAnswer("That's the wrong number!");
		}
		
		if(!isInteger(tempRandomInt))
		{
			randomInt = Integer.parseInt(tempRandomInt);
		}
		else
		{
			randomInt = -12345678;
		}
		
		myPopups.displayResponse("You typed in " + randomInt);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		private boolean isInteger(String input)
		{
			boolean isInt = false;
			
			try
			{
				int validInteger = Integer.parseInt(input);
				isInt = true;
			}
			catch(NumberFormatException error)
			{
				myPopups.displayResponse("You typed in wrong");
			}
			
			return isInt;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	

}
