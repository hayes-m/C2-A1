import java.util.InputMismatchException;
import java.util.Scanner;


public class c2a1q2_2018_MarkHayes 
{

	public static void main(String[] args) 
	{

		Scanner in = new Scanner(System.in);	//initialising the scanner method

		int month = 0;		//declaring the five variables that will be used in the program
		int day;
		int monthLength;
		String monthName;
		String indicator;
		
		while (month > 12 || month < 1)	//a while loop to restart prompt if the user inputs numbers out of range		
		{
			try 
			{
				System.out.print("Please enter months between 1 and 12: ");	//ensures input for hours remains within boundaries of time
				month = in.nextInt();
			}
			catch (InputMismatchException ime)		//ensures input is an integer
			{
				System.out.print("Invalid input. ");	//error message to prompt for correct input
				in.nextLine();
			}

		}

		switch (month) {		//a switch statement which assigns string values to the 'month' integer input
		case 1: monthName = "January";
		break;
		case 2: monthName = "February";
		break;
		case 3: monthName = "March";
		break;
		case 4: monthName = "April";
		break;
		case 5: monthName = "May";
		break;
		case 6: monthName = "June";
		break;
		case 7: monthName = "July";
		break;
		case 8: monthName = "August";
		break;
		case 9: monthName = "September";
		break;
		case 10: monthName = "October";
		break;
		case 11: monthName = "November";
		break; 
		case 12: monthName = "December";
		break;
		default: monthName = ("Invalid input");
		}


		System.out.print("Please enter a day: ");		//prompts user for a day

		while (!in.hasNextInt())	//loop to ensure numerical input
		{
			in.next();
			System.out.print("Invalid input; please input a number: ");
		}
		day = in.nextInt();	//assigns numerical 'day' input to a variable

		if (month == 2) 	//if statement to assign number of days to each month
		{
			monthLength = 29;		//February
		}
		else if ((month == 4) || (month == 6) || (month == 9) || (month == 11))		//April, June, September, and November
		{
			monthLength = 30;
		}
		else 		//remaining months
		{
			monthLength = 31;
		}

		
		while (day > monthLength || day <= 0)	//a loop to ensure that number of days is accurate to the month
		{
			System.out.print("Days out of range for " + monthName + ". Please enter a day between 1 and " + monthLength);
			day = in.nextInt();
		}
		
		in.close();		//closes scanner

		if ((day == 1) || (day == 21) || (day == 31))
		{
			indicator = ("st");		//assigning ordinal indicators for numbers that need to end in 'st'
		}
		else if ((day == 2) || (day == 22))
		{
			indicator = ("nd");		//assigning ordinal indicators for numbers that need to end in 'nd'
		}
		else if ((day == 3) || (day == 23))
		{
			indicator = ("rd");		//assigning ordinal indicators for numbers that need to end in 'rd'
		}
		else 
		{
			indicator = ("th");		//assigning all other ordinal indicators
		}

		System.out.println("The date entered is the " + day + indicator + " of " + monthName + "");	//final output if all conditions are met correctly

	}
}





