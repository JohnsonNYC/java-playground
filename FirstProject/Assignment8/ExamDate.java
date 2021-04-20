package FirstProject.Assignment8;

// The exam date should be after today 
    // date.isAfter(comparisonDate)  returns boolean
// The exam should not be on a weekend (Saturday or Sunday)
    // LocalDate.getDayOfWeek()  return day of the week date falls under
// The exam should be within 7 inclusive working days after today 
    // LocalDateObj.plusDays(7) returns another localDate obj
// The duration of the exam should be 2 hours
  // start time + 2 hours
// The exam can be scheduled only in one of two slots:
    // LocalDateTimeObj.isBefore(LocalDateTimeObj) boolean
    // LocalDateTimeObj.isAfter(LocalDateTimeObj) boolean
  // 9am - 12 pm || 3pm - 6pm 
public class ExamDate {
  // START "20 January, 2017, 9:30 AM"
  // END "20 January, 2017, 11:30 AM"

  // Methods
  // getDateTimeFromString(Strind dateStr) Parse string to LocalDateTime obj
  // isValidExamDateTime(String examStartString, String examEnds)
    // use getDateTimeFromString to parse String to LocalDateTime
    // Validate the Exam date and time according to rules
    // Throw Exceptions on Violations according to the following table
    // 
}
