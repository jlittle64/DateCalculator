/**
 * This program reads a year, month, and day, and processes it
 * only if the year is in the range 1900 to 2100 (both inclusive)
 * For input years in proper range, the program determines whether
 * the date is valid, and if valid, further determines the day of
 * that date in its year, and then the day of that date in its week.
 *
 * @author (Joshua Little)
 * @version (Feburary 19, 2019)
 */
import java.util.*;
public class DateTester
{
    public static void main(String[]args){

        System.out.println("This program reads a year, month, and day, and processes it");//Description
        System.out.println("only if the year is in the range 1900 to 2100 (both inclusive).");
        System.out.println("For input years in proper range, the program determines whether");
        System.out.println("the date is valid, and if valid, further determines the day of");
        System.out.println("that date in its year, and then the day of that date in its");
        System.out.println("week.");
        System.out.println("");
        System.out.println("Author: Joshua Little   Version: February 19, 2019");//Author & Date

        Scanner input = new Scanner (System.in);//Scanner
        int year = 0;//Year Variable
        int month = 0;//Month Variable
        int day = 0;//Day Variable

        System.out.println("");//Blank Line
        System.out.print("Want to run? (enter y to run) : ");//Prompt user to run
        char runP = input.next().charAt(0);//User's answer

        while(runP == 'y' || runP == 'Y'){//loop to keep running program

            System.out.println("");//Blank line
            System.out.print("Enter year, month, and day, seperated by space: ");//Prompt user for date
            year = input.nextInt();//Takes in Year, Month, and Day
            month = input.nextInt();
            day = input.nextInt();

            if(year >= 1900 && year <= 2100){
                if(MyCalendar.isValidDate(year, month, day)){

                    System.out.println("The above date is valid.");
                    System.out.println("Day of that date in its year: " + MyCalendar.dayOfYear(year, month, day));//Calls dayOfYear method in MyCalendar
                    System.out.println("Day of that date in its week: " + MyCalendar.dayOfWeek(year, month, day));//Calls dayOfWeek method in MyCalendar
                    System.out.println("");

                } else{

                    System.out.println("The above date is not valid.");//Given an invalid Month or Day
                    System.out.println("");

                }
            }else{
                System.out.println("Years outside the range 1900-2100 are not processed.");//Given an invalid Year
                System.out.println("");
            }

            System.out.print("Want to run? (enter y to run) : ");//Prompt user if they want to run program again
            runP = input.next().charAt(0);

        }

        System.out.println("");
        System.out.println("Program has terminated.");//Program has Terminated
    }
}
