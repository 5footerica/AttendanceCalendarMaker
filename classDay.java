class ClassDay{
    int month;
    int day;
    char dayOfWeek;
    int year;
    
  public void initDay(int m, int d, char dow, int y){
      month=m;
      day=d;
      dayOfWeek=dow;
      year=y;
  }
  
  public ClassDay nextDay(){
      int newDay;
      int newMonth;
      char newdow;
      int newYear;
      if (dayOfWeek == 'M'){
          if(day >= findMaxDays(month,year)){
              day=day++ - findMaxDays(month,year);
              dayOfWeek='T';
              month=month++;
          }
          else {
        	  day=day++;
        	  dayOfWeek='T';
          }

      }else if(dayOfWeek == 'T'){
    	  if(day >= findMaxDays(month,year)){
              day=day++ - findMaxDays(month,year);
              dayOfWeek='W';
              month=month++;
          }
          else {
        	  day=day++;
        	  dayOfWeek='W';
          }

          
      }else if(dayOfWeek == 'W'){
    	  if(day >= findMaxDays(month,year)){
              day=day++ - findMaxDays(month,year);
              dayOfWeek='R';
              month=month++;
          }
          else {
        	  day=day++;
        	  dayOfWeek='R';
          }

          

      }else if(dayOfWeek == 'R'){
    	  if(day >= findMaxDays(month,year)){
              day=day+4 - findMaxDays(month,year);
              dayOfWeek='M';
              month=month++;
          }
          else {
        	  day=day+4;
        	  dayOfWeek='M';
          }
    	
      }
      newDay=day;
      newMonth=month;
      newdow=dayOfWeek;
      newYear=year;
      ClassDay myDay= new ClassDay();
      myDay.initDay(newDay,newMonth,newdow,newYear);

 
  return myDay;
  }
      
  
  
  public String toString(){
      return String.format("%7d/%02d", month,day);
      
  }
    
private boolean isLeapYear(int y){
	y=year;
    return (y%4==0);
}
private int findMaxDays(int month, int year){
	int maxDays = 0;
	
	
		if (month==1 || month==3 || month==5 || month==8 || month ==10 || month==12){
		      maxDays = 31;
		}
		   
		  if (month==4 || month==6 || month==9 ||month==11){
		      maxDays = 30;
		      }
		      
		  
		  if (month==2){
			  if (isLeapYear(year)==true) {
		      maxDays=29;
			  }
		      else{
		         maxDays = 28;
		      }      
		  	}
		  return maxDays;
		}
}

  

