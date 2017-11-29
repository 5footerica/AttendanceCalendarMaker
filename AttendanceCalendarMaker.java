import java.util.Scanner;
public class AttendanceCalendarMaker {

      public static Scanner in = new Scanner(System.in);

      public static int getMonth(){

      int month;

      System.out.print("Please enter the starting month(8-Aug or 1-Jan): ");
      month = in.nextInt();

      while (month != 8 && month != 1){
          System.out.println("Semesters begin in either August (8) or January (1).");
          System.out.print("Please enter the starting month(8-Aug or 1-Jan): ");
          month = in.nextInt();
      }
              return month;
      }

      public static int getDay(){

         int day;

         System.out.print("Please enter the date of the first Monday (1...31): ");
         day = in.nextInt();

          while (day <1 || day > 31){
          System.out.println("Day value must be between 1 and 31, inclusive.");
          System.out.print("Please enter the date of the first Monday (1...31): ");
          day = in.nextInt();
      }
         return day;
      }

     public static int getYear(){

      int year;

      System.out.print("Please enter the year containing this semeseter: ");
      year = in.nextInt();

      while (year <1 || year > 3000){
          System.out.println("Year value must be between 1 and 3000, inclusive.");
          System.out.print("Please enter the year containing this semeseter: ");
          year = in.nextInt();
      }
     return year;
     }



    public static void main(String[] args){
        System.out.println("Welcome to the Attendance Calendar Maker\nfor classes meeting Mondays through Thursdays for 16 weeks . . .\n\n\n");
        int month=getMonth();

        int day=getDay();

        int year=getYear();
        
        String season;
        if (month == 8){
            season="Fall";
        }else {
            season="Spring";
                }


        
        System.out.println("Attendance calendar for "+ season + " " +year);
        ClassDay current= new ClassDay();
        current.initDay(month,day,'M',year);
        System.out.println("Wk    M    T    W    R");
        int week=1;
        int days=1;
        while (week<=16) {
                System.out.print(week);
                while (days<=4) {
                    System.out.print(current);
                    current=current.nextDay();
                }
                System.out.print("\n");
                week=week++;

        }

        System.out.print("\nAttendance Calendar Maker terminating.");

    }

}
