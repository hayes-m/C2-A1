import java.util.InputMismatchException;
import java.util.Scanner;

public class c2a1q4_2018_MarkHayes {

	static int hours = 0;	//a class variable for hours to be accessed by both main and getTimeName method
	static int minutes = -1;	//a class variable for minutes set to -1 so that 0 is an option for a time on the hour
	static String hoursInWords;	//class variable for the string of hour numerals in English
	static String minutesInWords;	//class variable for the string of hour numerals in English

	public static void main(String[] args) 
	{

		Scanner in = new Scanner(System.in);	//initialising the scanner method

		while (hours > 12 || hours < 1)	//a while loop to restart prompt if the user inputs numbers out of range		
		{
			try 
			{
				System.out.print("Please enter hours between 1 and 12: ");	//ensures input for hours remains within boundaries of time
				hours = in.nextInt();
			}
			catch (InputMismatchException ime)		//ensures input is an integer
			{
				System.out.print("Invalid input. ");	//error message to prompt for correct input
				in.nextLine();
			}

		}

		while (minutes > 59 || minutes < 0)		//a while loop to restart prompt if the user inputs numbers out of range	
		{
			try 
			{
				System.out.print("Please enter the minutes between 0 and 59: ");  //ensures input for hours remains within boundaries of time
				minutes = in.nextInt();
			}
			catch (InputMismatchException ime)	//ensures input is an integer
			{
				System.out.print("Invalid input. ");	//error message to prompt for correct input
				in.nextLine();
			}
		}	
		in.close();		//closes scanner

		if (minutes > 30) 		//sets boundaries for user input exceeding 30 minutes, which would give 'to' an hour, rather than 'past'
		{				
			minutes = postThirty(minutes);		//invokes method for values over 30 minutes
			hours = endOfClock(hours);		//invokes method to loop clock 
			getTimeName(hours, minutes);	//invokes method to translate numbers to words


			if (minutes % 5 == 0) 	//minutes divisible by five lose the 'minutes' following their printing - e.g "five to six" rather than "five minutes to six"
			{
				System.out.println("The time is " + minutesInWords + " to " + (hoursInWords));
			}
			else if(minutes == 1) 		//one minute to an hour is singular and so loses the 's'
			{
				System.out.println("The time is " + minutesInWords + " minute to " + (hoursInWords));
			}
			else //remaining minutes between 30 and 59
			{
				System.out.println("The time is " + minutesInWords + " minutes to " + (hoursInWords));
			}

		}
		else
		{

			getTimeName(hours, minutes);	//invokes method to translate

			if (minutes == 0) 		//prints an "o'clock" for a time that lands on the hour
			{
				System.out.println("The time is " + hoursInWords + " o'clock.");
			}
			else if(minutes == 1) 		//singular expression for one minute
			{
				System.out.println("The time is " + minutesInWords + " minute past " + hoursInWords);
			}

			else if (minutes % 5 == 0)		//minutes divisible by five lose the 'minutes' following their printing
			{
				System.out.println("The time is " + minutesInWords + " past " + hoursInWords);
			}
			else 		//remaining minutes between 0 and 30
			{
				System.out.println("The time is " + minutesInWords + " minutes past " + hoursInWords);
			}
		}
	}


	public static int postThirty(int minutes) //method to reuse the switch statement for 30 minutes in the second half of the hour
	{
		minutes = 60 - minutes;				//method returns the subtraction of input from 60 to reuse values in the 'minutes' switch statement
		return minutes;			//returns new value of minutes
	}

	public static int endOfClock(int hours)		//method to show minutes are now counting up to and printing the next hour instead of the current
	{
		if (hours == 12)
		{
			hours -= 11;		//if a user inputs '12', this loops the clock back to 1 as there is no other value afterwards
		}
		else 
		{
			hours += 1;		//increments the time to display the upcoming hour with input over 30 minutes
		}
		return hours;		//returns new value of hours
	}


	public static String getTimeName(int hours, int minutes)		//method to translate numerals to words for a user's input
	{			

		switch (hours) {		//a switch statement which assigns string values to the 'hours' integer input
		case 1: hoursInWords = "one";
		break;
		case 2: hoursInWords = "two";
		break;
		case 3: hoursInWords = "three";
		break;
		case 4: hoursInWords = "four";
		break;
		case 5: hoursInWords = "five";
		break;
		case 6: hoursInWords = "six";
		break;
		case 7: hoursInWords = "seven";
		break;
		case 8: hoursInWords = "eight";
		break;
		case 9: hoursInWords = "nine";
		break;
		case 10: hoursInWords = "ten";
		break;
		case 11: hoursInWords = "eleven";
		break; 
		case 12: hoursInWords = "twelve";
		break;
		default: hoursInWords = ("Invalid input");
		}

		switch (minutes) {		//a switch statement which assigns string values to the 'minutes' integer input
		case 1: minutesInWords = "one";
		break;
		case 2: minutesInWords = "two";
		break;
		case 3: minutesInWords = "three";
		break;
		case 4: minutesInWords = "four";
		break;
		case 5: minutesInWords = "five";
		break;
		case 6: minutesInWords = "six";
		break;
		case 7: minutesInWords = "seven";
		break;
		case 8: minutesInWords = "eight";
		break;
		case 9: minutesInWords = "nine";
		break;
		case 10: minutesInWords = "ten";
		break;
		case 11: minutesInWords = "eleven";
		break; 
		case 12: minutesInWords = "twelve";
		break;
		case 13: minutesInWords = "thirteen";
		break;
		case 14: minutesInWords = "fourteen";
		break;
		case 15: minutesInWords = "a quarter";
		break;
		case 16: minutesInWords = "sixteen";
		break;
		case 17: minutesInWords = "seventeen";
		break;
		case 18: minutesInWords = "eighteen";
		break;
		case 19: minutesInWords = "nineteen";
		break;
		case 20: minutesInWords = "twenty";
		break;
		case 21: minutesInWords = "twenty-one";
		break;
		case 22: minutesInWords = "twenty-two";
		break;
		case 23: minutesInWords = "twenty-three";
		break;
		case 24: minutesInWords = "twenty-four";
		break;
		case 25: minutesInWords = "twenty-five";
		break;
		case 26: minutesInWords = "twenty-six";
		break;
		case 27: minutesInWords = "twenty-seven";
		break;
		case 28: minutesInWords = "twenty-eight";
		break;
		case 29: minutesInWords = "twenty-nine";
		break;
		case 30: minutesInWords = "half";
		break;
		default: minutesInWords = ("o'clock");
		}
		return minutesInWords;
	}
}





