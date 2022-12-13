class Clock1
{
	int hours;
	int minutes;
	int seconds;
	public clock(int hr,int min,int sec)
	{
		setTime(int hours,int minutes,int seconds);
	}
	
	public void setTime()
	{
		setTime(0,0,0);
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

	
}