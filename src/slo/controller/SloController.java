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
		int userInt;
		
		String tempUserInt = myPopups.getAnswer("I'm thinking of a number between one and ten, what is it?");
		
		userInt = Integer.parseInt(tempUserInt);
		
		while(userInt != randInt)
		{
			tempUserInt = myPopups.getAnswer("That's the wrong number!");
		}
		
		
		
		
		if(!isInteger(tempUserInt))
		{
			userInt = Integer.parseInt(tempUserInt);
		}
		else
		{
			userInt = -12345678;
		}
		
		myPopups.displayResponse("You typed in " + userInt);
		
		
		myPopups.displayResponse(mySloStuff.toString());
		
		
	}
		
		
		
		
		
		
		
		
		
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	


