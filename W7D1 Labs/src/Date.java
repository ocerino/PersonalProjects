
public class Date
{
	//Properties
	private int day;
	private int month;
	private int year;
	
	//Methods
	
	//Constructors
	public Date()
	{
		this.setDate(1, 1, 1900);
	}
	
	//Constructors that takes parameters
	public Date(int m, int d, int y)
	{
		this.setDate(m, d, y);
	}
	
	//Methods:
	public boolean setDate(int m, int d, int y)
	{
		if(y > 0 && m > 0 && m <= 12 && d > 0 && d <= 31)
		{
			this.month = m;
			this.day = d;
			this.year = y;
			return true;
		}
		else
		{
			this.month = 1;
			this.day = 1;
			this.year = 1900;
			return false;
		}
	}
	
	public String toString()
	{
		return this.month + "/" + this.day + "/" + this.year;
	}
	
	public boolean isLeapYear()
	{
		return this.year%4 == 0 && !(year%100 == 0 && year%400 !=0);
	}
	
	public boolean isHalloween()
	{
		if(this.month == 10 && this.day == 31)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int dayOfYear()
	{
		return (this.month*30 + this.day);
	}
	
	public boolean equals(Date other)
	{
		return this.year == other.year && this.month == other.month && this.day == other.day;
	}
	
	public int daysUntil(Date other)
	{
		return (other.year - this.year)*360 + (other.month - this.month)*30 + (other.day - this.day);
	}
}
