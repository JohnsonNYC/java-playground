package FirstProject.DataStructures;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
  public static void main(String[] args) {
    // Parsing a string to localDate
    LocalDate date = LocalDate.parse("13/Mar/2013", DateTimeFormatter.ofPattern("dd/MMM/yyyy"));
    System.out.println("Parsed LocalDate: " + date);

    // Parsing a string to LocalDateTime
    LocalDateTime dateTime = LocalDateTime.parse("12-Jul-2017 21:24:51", DateTimeFormatter.ofPattern("dd-MMM-yyy HH:mm:ss"));
    System.out.println("Parsed LocalDateTime: " + dateTime);

    //LocalDate and LocalTime components can be extracted from LocalDateTime;
    System.out.println("LocalTime from LocalDateTime: " + dateTime.toLocalTime());

    //Formatting LocalDateTime to String
    System.out.println("Formatted date: " + dateTime.format(DateTimeFormatter.ofPattern("dd/Mm/yyyy")));
  }
}
