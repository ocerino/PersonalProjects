
public class Time24Hour 
{
	private int hour;
	private int minute;
	
	public Time24Hour()
	{
		this.setTime(4,20);
	}
	
	public Time24Hour(int h, int m)
	{
		this.setTime(h, m);
	}
	
	public boolean setTime(int h, int m)
	{
		if(h<=23 && m <=59)
		{
			this.hour = h;
			this.minute = m;
			return true;
		}
		else
		{
			this.hour = 4;
			this.minute = 20;
			return false;
		}
	}
	
	public boolean equals(Time24Hour t)
	{
		return this.hour == t.hour && this.minute == t.minute;
	}
	
	public boolean precedes(Time24Hour t)
	{
		if (this.hour <t.hour || this.hour == t.hour && this.minute < t.minute)
		{
			return true;
		}
		return false;
	}
	
	public String toString()
	{
		if(this.hour<10 && this.minute<10)
		{
			return "0" + this.hour + ":" + "0" + this.minute;
		}
		else if(this.hour>=10 && minute>=10)
		{
			return this.hour + ":" + this.minute;
		}
		else if(this.hour>=10 && minute<10)
		{
			return this.hour + ":" + "0" + this.minute;
		}
		else
		{
			return "0" + this.hour + ":" + this.minute;
		}
	}
	
	
}
