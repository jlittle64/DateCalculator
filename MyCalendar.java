/**
 * Performs calendar-related computation 
 * only for year >= 1900 and year <= 2100.
 * 
 * @author (Joshua Little) 
 * @version (February 17, 2019)
 */

public class MyCalendar
{
    /**
     * Check for leap year
     * 
     * @param   year     int (>= 1900 and <= 2100)
     * @return  boolean  true if leap year; false, otherwise
     */
    public static boolean isLeapYear (int year)
    {
        boolean leapYear = true;//Variable created for Boolean

        leapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0; //Calculates if it is a Leap Year

        return leapYear;//returns answer
    }

    /**
     * Compute the number of days in a valid month of a valid year  
     * 
     * @param   year   int (>= 1900 and <= 2100)
     * @param   month  int (range 1-12)
     * @return  int    the number of days in the given month of the year
     */
    public static int numDays (int year,int month)
    {

        boolean leapYear = (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));//Calculates if it is a Leap Year

        int monthDays = 0;//Return Variable

        if((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12) ){//If statment to find what month

            monthDays = 31;//Sets variable equal to the number of days in specified month

        }else if(month == 2 && leapYear == true){

            monthDays = 29;//Sets variable equal to the number of days in specified month

        }else if((month == 4) || (month == 6) || (month == 9) || (month == 11)){

            monthDays = 30;//Sets variable equal to the number of days in specified month

        }else if(month == 2){

            monthDays = 28;//Sets variable equal to the number of days in specified month

        }
        
        return monthDays;//returns answer
    }

    /**
     * Check for validity of a date 
     * 
     * @param   year      int (>= 1900 and <= 2100)
     * @param   month     int
     * @param   day       int
     * @return  booolean  true if valid date; false, otherwise
     */
    public static boolean isValidDate (int year,int month, int day)
    {
        boolean validDate = true;//Return Variable

        boolean leapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;//Calculates if it is a Leap Year

        if(year >= 1900 && year <= 2100){//Checks Year

            if(month >= 1 && month <= 12){//Checks Month

                if(((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)) && (day >= 1 && day <= 31)){
                    //Then Checks the Day
                    validDate = true;

                }else if(month == 2 && leapYear == true && (day >= 1 && day <=29)){

                    validDate = true;

                }else if(((month == 4) || (month == 6) || (month == 9) || (month == 11)) && (day >= 1 && day <= 30)){

                    validDate = true;

                }else if(month == 2 && (day >= 1 && day <=28)){

                    validDate = true;

                }else{

                    validDate = false;

                }
            }else{

                validDate = false;

            }
        }else{

            validDate = false;

        }

        return validDate;//returns answer

    }

    /**
     * Compute the day of the year for a valid date  
     * 
     * @param   year   int (>= 1900 and <= 2100)
     * @param   month  int (range 1-12)
     * @param   day    int (range 1-numDays(year, month))
     * @return  int    the day of the year
     */    
    public static int dayOfYear (int year, int month, int day)
    {
        int numDays = 0;//Return Variable

        boolean leapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0; //Calculates if it is a Leap Year

        if(month == 1 ){
            numDays = day;//Jan
        }
        if(month == 2 ){
            numDays = 31 + day;//Feb
        }
        if(month == 3 ){
            numDays = 59 + day;//March
            if (leapYear == true){//Adds one if it is a Leap year
            numDays = numDays + 1;
         }
        }
        if(month == 4 ){
            numDays = numDays + 90 + day;//April
            if (leapYear == true){//Adds one if it is a Leap year
            numDays = numDays + 1;
         }
        }
        if(month == 5 ){
            numDays = numDays + 120 + day;//May
            if (leapYear == true){//Adds one if it is a Leap year
            numDays = numDays + 1;
         }
        }
        if(month == 6 ){
            numDays = numDays + 151 + day;//June
            if (leapYear == true){//Adds one if it is a Leap year
            numDays = numDays + 1;
         }
        }
        if(month == 7 ){
            numDays = numDays + 181 + day;//July
            if (leapYear == true){//Adds one if it is a Leap year
            numDays = numDays + 1;
         }
        }
        if(month == 8 ){
            numDays = numDays + 212 + day;//August
            if (leapYear == true){//Adds one if it is a Leap year
            numDays = numDays + 1;
         }
        }
        if(month == 9 ){
            numDays = numDays + 243 + day;//September
            if (leapYear == true){//Adds one if it is a Leap year
            numDays = numDays + 1;
         }
        }
        if(month == 10 ){
            numDays = numDays + 273 + day;//October
            if (leapYear == true){//Adds one if it is a Leap year
            numDays = numDays + 1;
         }
        }
        if(month == 11 ){
            numDays = numDays + 304 + day;//November
            if (leapYear == true){//Adds one if it is a Leap year
            numDays = numDays + 1;
         }
        }
        if(month == 12 ){
            numDays = numDays + 334 + day;//December
            if (leapYear == true){//Adds one if it is a Leap year
            numDays = numDays + 1;
         }
        }

        return numDays;//returns answer

    }

    /**
     * Compute the day of the week for a valid date  
     * 
     * @param   year    int (>= 1900 and <= 2100)
     * @param   month   int (range 1-12)
     * @param   day     int (range 1-numDays(year, month))
     * @return  String  the day of the week
     */    
    public static String dayOfWeek (int year, int month, int day)
    {
        int d = day;//using specified variables to follow formula exactly
        int m = month;
        int y = year;

        if (m == 1){
            m=13;
            y = y - 1;
        }
        if (m == 2){
            m=14;
            y = y - 1;
        }

        int p = 26 * (m + 1) / 10;
        int q = y % 100;
        int r = y / 100;
        int s = (d + p + q + q/4 + r/4 + 5 * r) % 7;
        int t = (s + 6) % 7;

        String dayOfWeek = "";

        if(t == 0){//if statment to find what day of the week it is
            dayOfWeek = "Sunday";
        }
        if(t == 1){
            dayOfWeek = "Monday";
        }
        if(t == 2){
            dayOfWeek = "Tuesday";
        }
        if(t == 3){
            dayOfWeek = "Wednesday";
        }
        if(t == 4){
            dayOfWeek = "Thursday";
        }
        if(t == 5){
            dayOfWeek = "Friday";
        }
        if(t == 6){
            dayOfWeek = "Saturday";
        }

        return dayOfWeek;//returns answer
    }
}