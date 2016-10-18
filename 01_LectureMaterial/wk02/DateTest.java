public class DateTest
{ 
    public static void main(String[] args)
    {/*  This class is to test the Date class and its methods.
      *  We create some objects of class Date and get some parts back.
      */
	Date lectureDate = 
           new Date(7, "October", 2015);

        Date londonOlympicsOpening =
	   new Date(27, "July", 2012);

        System.out.println("The month of today's lecture is " 
                            + lectureDate.getMonth() + ".");

	//        System.out.println("The day of today's lecture is " 
        //                    + lectureDate.day + ".");

        System.out.println("The year of today's lecture is " 
                            + lectureDate.getYear() + ".");

        System.out.println("The weekday of today's lecture is " 
                            + lectureDate.weekDay() + ".");


        System.out.println("The month of the opening of London Olympics is " 
                            + londonOlympicsOpening.getMonth() + ".");

        System.out.println("The year of the opening of London Olympics is " 
                            + londonOlympicsOpening.getYear() + ".");

        System.out.println("The weekday of the opening of London Olympics is " 
                            + londonOlympicsOpening.weekDay() + ".");

	System.out.println(lectureDate);
	System.out.println(londonOlympicsOpening);

        lectureDate.setDay(8);
	System.out.println(lectureDate);

    }
}
