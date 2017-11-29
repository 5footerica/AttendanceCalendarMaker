# AttendanceCalendarMaker
Modularity/Classes Assignment (Module 5, Part 1)

Required File names of Your Submissions: AttendanceCalendarMaker.java
and   ClassDay.java

The Usual Coding Requirements/Restrictions:
1.     Do NOT use any language constructs that have not been covered in class through the current module.
2.     Be sure to make your code readable by using meaningful variable names, proper indentation and spacing.
In other words, make sure you follow ALL coding conventions for this course!
3.     All methods must be documented with an appropriate description immediately before the method in a method  prologue.  This is similar to a program prologue, but only describes the method that follows. Method descriptions were described in the Style section of this module.
4.     Be sure to name all required methods and classes EXACTLY as they are named below and be sure to use the EXACT same parameter list in the EXACT same order as given below.
5.     Your return types should also match the requirements below.
NOTE: being exact with method names, return types, and parameter lists is NOT an option, but a strict requirement for this assignment since your methods will be tested independent of your application with a test program that assumes the method names, return types, and parameter lists given below in the section, Definitions of Required Methods.
6.     Make sure you understand the requirements the same way the customer (a.k.a, instructor) does.  If you are not sure, ask the instructor for clarification rather than make incorrect assumptions.
The Requirements

In this assignment you  will write a program in which you will need to divide a problem into parts and implement a solution in which different Java classes and methods perform the tasks of the different parts of the problem solution.  This idea of dividing the solution into separate functional parts is what modularity is all about.  When using object-oriented design, divisions of data and procedure are made at the class level as well as at the level of different methods.  In this assignment the requirements dictate that you will create an application class, AttendanceCalendarMaker, and one other class, ClassDay.  The application class will be the one that includes a main method.  You will create other static methods within this application class to divide the work into manageable parts.  Some of the methods for both classes, as well as instance variables for the ClassDay class will be required and described in the section, Definitions of Required Methods, below.

The only other class you will create besides the application class, AttendanceCalendarMaker, will be the class, ClassDay.  This  class will be used to create objects that represent a day on which a class is held and will have capabilities, i.e., methods, related to dates of class days, including a method that generates the next ClassDay object that follows the current one. This and other required methods are described in the section, Definitions of Required Methods.

The section below, Definitions of Required Methods, includes high-level method definitions given to you for you to complete their implementation. You should also look for other tasks within the application for which you want to write separate methods to simplify the overall project.  No single method should be longer than 15 to 25 lines.  You should think about the problem solution as a sequence of tasks to implement as separate methods.  Designing this way is using modularity to simplify the creation and maintenance of the software.

For this assignment you will write a program that displays the dates on which classes will be held throughout the semester.  The instructor would be able to the information in taking attendance at each class meeting.  The class meets four days a week, Monday, Tuesday, Wednesday, and Thursday.  There are 16 weeks in each semester.  Therefore, the program will format the display by printing on one line the four dates for each week, each line will have a week number to the left, and each column will be headed by the letter designating that day of the week: M for Monday, T for Tuesday, W for Wednesday, and R for Thursday.  The exact format of this calendar is given in the example execution logs below.  Study them in order to have your program produce exactly the same format.  In testing, if your program receives the same user input values as either of the examples below, your program should produce output identical to what appears below for that example execution.  However, your program must produce a calendar formatted exactly like those on this page for any valid date in a semester beginning in August or January in any valid year.

At the start of the program, the user will be asked to enter the month number of the beginning of the semester. (Note: the date formed by the three input integers is assumed to be a Monday. If the entered date is actually not a Monday on the real calendar, the program should not care and should not check - it can still produce the calendar information required.)  The month number must be either 8 (August) for the Fall semester or 1 (January) for the Spring semester.  Only these two values are valid for this input.  Next, the user will enter the day number in that month of the Monday of the first week of classes.  The entered day value must be between 1 and 31, inclusive, to be valid.  The final user input will be the integer representing the year in which the semester will occur.  The year value must not be less than 1 and must not be greater than 3000.  The program will be required to ensure that valid values are entered for each of the three inputs.  There is a required method defined below for the input of each of these items.  Each of these three input methods should loop until valid input is received and then return the valid input to the caller method.  The program must have the user enter them in the order presented here in this paragraph: month, day, year.  The tasks of prompting the user, reading the keyboard input and validating the value for each input will be done in one of three required input methods  as defined below.

Once the user has entered valid values for the three inputs, the calendar is displayed.  Mondays through Thursdays for each of the 16 weeks are shown with their corresponding dates based on the date of the first Monday of classes, which was input by the user.  Your program will need to be able to calculate the date of the next day's class meeting as it moves from day to day and week to week.  Handling a weekend means skipping the dates for Friday, Saturday, and Sunday since there are no class meeting on these three days.  You should not be concerned with any holidays or spring break.  The first date for each new week must accurately show the date for the Monday of the new week.  The program must determine when a new month begins and, in spring semesters, when an extra day in February is needed for leap years.

Two examples of what your program must look like as it executes follow.  User input is shown here in bold but on your console user input will not appear in bold.
Example Execution #1:

Welcome to the Attendance Calendar Maker
for classes meeting Mondays through Thursdays for 16 weeks . . .



Please enter the starting month(8-Aug or 1-Jan): 5
Semesters begin in either August (8) or January (1).
Please enter the starting month(8-Aug or 1-Jan): 0
Semesters begin in either August (8) or January (1).
Please enter the starting month(8-Aug or 1-Jan): 8
Please enter the date of the first Monday (1..31): 0
Day value must be between 1 and 31, inclusive
Please enter the date of the first Monday (1..31): 32
Day value must be between 1 and 31, inclusive
Please enter the date of the first Monday (1..31): 21
Please enter the year containing this semester: 0
Year value must be between 1 and 3000, inclusive
Please enter the year containing this semester: 2017
 
Attendance calendar for Fall 2017
  Wk   M     T     W     R
   1  8/21  8/22  8/23  8/24
   2  8/28  8/29  8/30  8/31
   3  9/04  9/05  9/06  9/07
   4  9/11  9/12  9/13  9/14
   5  9/18  9/19  9/20  9/21
   6  9/25  9/26  9/27  9/28
   7 10/02 10/03 10/04 10/05
   8 10/09 10/10 10/11 10/12
   9 10/16 10/17 10/18 10/19
  10 10/23 10/24 10/25 10/26
  11 10/30 10/31 11/01 11/02
  12 11/06 11/07 11/08 11/09
  13 11/13 11/14 11/15 11/16
  14 11/20 11/21 11/22 11/23
  15 11/27 11/28 11/29 11/30
  16 12/04 12/05 12/06 12/07
 
 Attendance Calendar Maker terminating.
 
Example Execution #2:

Welcome to the Attendance Calendar Maker
for classes meeting Mondays through Thursdays for 16 weeks . . .



Please enter the starting month(8-Aug or 1-Jan): 1
Please enter the date of the first Monday (1..31): 22
Please enter the year containing this semester: 2024
 
Attendance calendar for Spring 2024
  Wk   M     T     W     R
   1  1/22  1/23  1/24  1/25
   2  1/29  1/30  1/31  2/01
   3  2/05  2/06  2/07  2/08
   4  2/12  2/13  2/14  2/15
   5  2/19  2/20  2/21  2/22
   6  2/26  2/27  2/28  2/29
   7  3/04  3/05  3/06  3/07
   8  3/11  3/12  3/13  3/14
   9  3/18  3/19  3/20  3/21
  10  3/25  3/26  3/27  3/28
  11  4/01  4/02  4/03  4/04
  12  4/08  4/09  4/10  4/11
  13  4/15  4/16  4/17  4/18
  14  4/22  4/23  4/24  4/25
  15  4/29  4/30  5/01  5/02
  16  5/06  5/07  5/08  5/09
 
 Attendance Calendar Maker terminating.
Your program should display calendars in this EXACT format.  This includes the program's introduction lines, as well as the termination statement.  Use printf (discussed in the textbook) to get the exact spacing correct across each line.  For example, all four slashes on a line are in the same column as the slashes on the lines above and/or below them.   Spacing is uniform between dates, numbers are right-aligned, day numbers are zero-padded, etc.  You should consider the separate tasks involved in getting this work done as you design your solution.  Your main method should be the driver of the program showing the reader which methods are being used to do what parts and when.  You may decide to have other tasks to separate out into Java methods, but all of the methods described in the following section are required.  In implementing the following methods you must use the  exact names of the methods given below, the exact parameter lists (including same types and numbers of parameters) and the exact return values shown below.  These required methods will be tested in your submitted code independently, i.e., without executing the entire application.  So, each method defined in the following required list MUST work exactly as defined here.  Don't guess or assume anything: if you have a question, ask your instructor (more than 2 days before the due date).

Definitions of Required Methods (and instance variables for ClassDay)

Static Methods Required in the application class, AttendanceCalendarMaker:

int getMonth()
This method will prompt the user for the number of the month in which the semester begins.   The user's input will be read and validated as being either 8 (August) or 1 (January).  The method will display an error message, prompt again, and read a new input as long as the input is not valid.  The valid input value read will be returned to the caller.

int getDay()
This method will prompt the user for the day number of the Monday on which classes begin in the month in which the semester begins.  The user's input will be read and validated as being 1 and 31, inclusive.  The method  will display an error message, prompt again, and read a new input as long as the input is not valid.  The valid input value read will be returned to the caller.

int getYear()
This method will prompt the user for the integer value of the year in which the semester begins.  The user's input will be read and validated as being 1 and 3000, inclusive.  The method will display an error message, prompt again, and read a new input as long as the input is not valid.  The valid input value read will be returned to the caller.
Non-static Methods Required in the class, ClassDay:

public void initDay( int month, int day, char dayOfWeek, int year )
This method is used to set the initial values for the instance variables of this object.  If the caller needed a ClassDay object to represent the date, October 11, 2022 (a Tuesday), then the caller would use code such as:

ClassDay myDay = new ClassDay();
myDay.initDay( 10, 11, 'T', 2022 );


public ClassDay nextDay()
This method will create and return a ClassDay object that represents the next day of class following the one currently represented by the instance variables of the object executing this method.  This method is needed by the client to determine the date of the next class day.  So, this method will be creating a new ClassDay object with new values for that object’s instance vaiables, month, day, and dayOfWeek, so that the caller knows what the date of the next class meeting is by having that new ClassDay object returned to it by this method.  To determine the next class meeting date, this method will use the date of the current class meeting.  This information will be stored in the instance variables for this object (month, day, and year).  The year will never change, but is needed to determine if February has 28 or 29 days, i.e., leap.  The dayOfWeek character is the letter designating the day of the current class meeting and is needed to determine the letter for the day of the next class meeting.  The month and the day values will be used to determine the date of the next class meeting.  This could be as simple as adding one to the day number, but it might also involve resetting the day number back to 1 and changing the month.  This method's task may be one to think about dividing out into other Java methods of your own designing.

public String toString()
This method will return the String value that is used to print the current day.  For example, if the month and day of the executing object have the values 9 and 10, respectively, then this method should return the String value, "9/10".  Note: this method's use in a class is covered in Chapter 8, but setting it up and using it are rather simple.  The method will determine what goes into the return String by using the values of the month and day instance variables. 
To get these integers correctly formatted use the method, String.format, which takes the same arguments as printf but instead of printing, String.format will return the formatted String to the caller.  For example,
String dayString = String.format( "%02d", day );
will set the String variable, dayString, to the same thing that would be printed by printf in the following:
System.out.printf( "%02d", day );

The toString should NOT print anything, but only return the String described.  The client class (AttendanceCalendarMaker) will use this toString method in order to display objects of the ClassDay class.  This example shows what code in the client might look like to display a ClassDay object:
System.out.print( currentDay );

where currentDay, is an object of the class, ClassDay, that has already been created and assigned valid values to its instance variables.  The JVM will automatically call the toString method in the ClassDay class and it will return a String according to the requirements in this section.
If you have any questions on this method, let your instructor know.

private bool isLeapYear( int year )
This method returns the boolean value, true, if the formal parameter, year, is a leap year.  The method will return the boolean value, false, otherwise.  A year is leap if it is divisible by 4, but not by 100, unless it is also divisible by 400.  Examples to test this are 1900, which is NOT a leap year, and 2000, which IS a leap year.

private int findMaxDays( int month, int year ) 
This method will return the maximum number of days in the month whose number is passed to it in the first parameter.  The year parameter will be needed if the month is February (2).

** Remember: The method definition headers above should NOT be changed.  A test program run during grading will assume these six methods are named and defined with the return values and parameter lists exactly as shown here.

Private Instance Variables in the Class, ClassDay

The month, day, and year will be private instance variables of type, int, storing the three parts of the date for this class day.  The day of the week for this class day will be a private variable of type, char, storing one of the characters, 'M', 'T', 'W', or 'R'.
Important design requirement:  Your implementation of the class, ClassDay, may NOT have any other instance variables declared except for the four named in the previous sentence.

Final notes:

About your main method:  A reader should be able to read the main method and understand from that reading all that will happen as your program executes.  This is why main methods are often referred to as drivers: they show the functional flow of the entire program. For example, if you divided another application into 4 major tasks implemented as four methods, the main method  would include the calls to all four of these methods.  The main method might do a few simple tasks before, between, and after these calls, but the reader would see that the majoe part of the work is done inside these four methods.  This is the what you want to aim for as you design your application class in general and main in particular. 
The application class is called a client of the ClassDay class because it uses the ClassDay class.  The application client will get the input, create the first ClassDay object, begin displaying the calendar, then have each ClassDay object create the next ClassDay object that will need to get printed.

The class, ClassDay, however, will only include methods that deal with the current day, that is, the date whose month, day, year, and day of the week are stored in the instance variables for this object.  This class should not have any code that deals with the calendar in general.  Rather, the methods and instance variables in this class all pertain only to one single day on the calendar.  The client will use this class to represent one class day and call its nextDay method to generate subsequent days to display on the calendar.
You MUST implement all the methods described in the section, Definitions of Required Methods.  Your code will be tested partly by independent code that is NOT EXECUTING YOUR APPLICATION.  Each test your code does not pass will result in point deductions.
If you are not clear about writing any of the methods that are required, ask your instructor.
