package FirstProject.DataStructures;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
// LocalDate - represents and manipulates only the date component
// LocalTime - represents  and manipulates only the time component
// LocalDateTime - represents and manipulates the date and time component

public class DateTimeDemo {
  public static void main(String[] args) {
    // Parsing a string to localDate
    LocalDate date = LocalDate.parse("13/Mar/2013", DateTimeFormatter.ofPattern("dd/MMM/yyyy"));
    // If string is not in the exact patter, DateTimeParseException will be thrown;
    // System.out.println("Parsed LocalDate: " + date);

    // Parsing a string to LocalDateTime
    LocalDateTime dateTime = LocalDateTime.parse("12-Jul-2017 21:24:51",
        DateTimeFormatter.ofPattern("dd-MMM-yyy HH:mm:ss"));
    // System.out.println("Parsed LocalDateTime: " + dateTime);

    // LocalDate and LocalTime components can be extracted from LocalDateTime;
    // System.out.println("LocalTime from LocalDateTime: " +
    // dateTime.toLocalTime());

    // Formatting LocalDateTime to String
    System.out.println("Formatted date: " + dateTime.format(DateTimeFormatter.ofPattern("dd/Mm/yyyy")));
    LocalDate date2 = LocalDate.of(2017, 07, 21);
    // System.out.println("Date 2: " +
    // date2.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy")));

    LocalTime Id = LocalTime.parse("10:15:30");
    LocalTime time = LocalTime.parse("19:12:30");
    // System.out.println(Id.until(time, ChronoUnit.HOURS));

    // Getting time difference between two dates
    LocalDate bday = LocalDate.of(1998, 11, 16);
    LocalDate today = LocalDate.now();
    // System.out.println("My age in Months : " +
    // bday.until(today,ChronoUnit.MONTHS));
    // System.out.println("My age in years : " + bday.until(today,
    // ChronoUnit.YEARS));


    
    // ------------------Exercises------------------------
    // Age Calculator - Exercise
    // Input => "2/11/1991"
    // Output => You are 24 years, 7 months and 11 days old
    String input = "1/11/1995";
    // Input in LocalDate
    LocalDate inputDate = LocalDate.parse(input, DateTimeFormatter.ofPattern("d/MM/yyyy"));

    // Today in LocalDate
    LocalDate presentDate = LocalDate.now();
    System.out.println("Today is " + presentDate);
    long ageInYears = inputDate.until(presentDate, ChronoUnit.YEARS); // Years that have elapsed
    long months = inputDate.until(presentDate, ChronoUnit.MONTHS) % 12; // Months that have elapsed
    long days = inputDate.until(presentDate, ChronoUnit.DAYS) % 365 % 30;
    System.out.println("You are " + ageInYears + " years, " + months + " months and " + days + " days old");

  }

  // ------------------Exercises------------------------
  public static boolean isAgeFiftyOrMore(LocalDate dob) {
    LocalDate today = LocalDate.now();
    if (dob.until(today, ChronoUnit.YEARS) >= 50) {
      return true;
    } else
      return false;
  }
}
// LocalDate Methods
// now()
// of()
// plusWeeks(long weeksToAdd) - copy with number of weeks to add
// minusMonth(long monthsToSub) - copy with number of months subtracted
// compateTo(chonoLocalDate date) - compare a date with another
// get()
// isLeapYear()
// parse(charSequence text) -
// isAfter(chonoLocalDate date) - Checks if date is after the specified date
// until(endExclusive, unit) - endExclusive is the end date, and unit is the
// unit to measure the amount;