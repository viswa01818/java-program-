package JAVAEASYEG;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class LeapYear {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Date (MM/dd/yyyy): ");
    String dateStr = sc.nextLine();
    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
    Date date = null;
    try {
      date = sdf.parse(dateStr);
    } catch (ParseException e) {
      System.out.println("Invalid Date Format");
      System.exit(0);
    }
    Calendar cal = Calendar.getInstance();
    cal.setTime(date);
    int year = cal.get(Calendar.YEAR);
    boolean isLeap = false;
    if(year % 400 == 0) {
      isLeap = true;
    } else if(year % 100 == 0) {
      isLeap = false;
    } else if(year % 4 == 0) {
      isLeap = true;
    }
    if(isLeap) {
      System.out.println("Given year is Leap Year");
    } else {
      System.out.println("Given year is Non Leap Year");
    }
  }
}
