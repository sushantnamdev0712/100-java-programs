class Clock
{
    private int hr; 
    private int min; 
    private int sec; 
    public Clock(int hours, int minutes, int seconds)
    {
	      setTime(hours, minutes, seconds);
    }
          
    public Clock()
    {
        setTime(0, 0, 0);
    }

          public void setTime(int hours, int minutes, int seconds)
    {
	      if(0 <= hours && hours < 24)
		       hr = hours;
	      else
		       hr = 0;

        if(0 <= minutes && minutes < 60)
		       min = minutes;
	      else
		       min = 0;

	      if(0 <= seconds && seconds < 60)
		       sec = seconds;
	      else
	         sec = 0;
    }

    public int getHours()
    {
	        return hr;
    }

    public int getMinutes()
    {
	        return min;
    }

    public int getSeconds()
    {
	        return sec;
    }

    public void setHours()
    {
 	        if(hr < 10)
	           System.out.print("0");
          System.out.print(hr + ":");

	        if(min < 10)
	           System.out.print("0");
	        System.out.print(min + ":");

	        if(sec < 10)
	           System.out.print("0");
	        System.out.print(sec);
    }

         
    public void setseconds()
    {
          sec++;
	        if(sec > 59)
	        {
	           sec = 0;
	           incrementMinutes();
	        }
    }

      	 
    public void setMinutes()
    {
	        min++;
	        if(min > 59)
	        {
	           min = 0;
	           incrementHours(); 
	        }
    }

         	
    public void incrementHours()
    {
	      hr++;
	      if(hr > 23)
 	         hr = 0;
    }

         
    public boolean equals(Clock otherClock)
	  {
        return(hr == otherClock.hr
 	             && min == otherClock.min
               && sec == otherClock.sec);
    }
          
    public void makeCopy(Clock otherClock)
	  {
        hr = otherClock.hr;
        min = otherClock.min;
        sec = otherClock.sec;
    }

 	      
    public Clock getCopy()
    {
	      Clock temp = new Clock();

	      temp.hr = hr;
	      temp.min = min;
	      temp.sec = sec;

	      return temp;
    }

    public String toString()
    {
        String str = "";

        if(hr < 10)
	         str = "0";
        str = str + hr + ":";

        if(min < 10)
	         str = str + "0" ;
        str = str + min + ":";

        if(sec < 10)
	         str = str + "0";
        str = str + sec;

        return str;
    }
}