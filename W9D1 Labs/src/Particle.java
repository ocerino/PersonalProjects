import java.awt.*;

public class Particle 
{
	//Data Members
	private Color color;
	private double xPos;
	private double yPos;
	private double xVel;
	private double yVel;
	private double yAcc;
	private int lifetime;
	
	//Constructors
	public Particle()
	{
		this.xPos = StdDraw.getWidth()/2;
		this.yPos = StdDraw.getHeight()/2;
		setParameters();
	}
	public Particle(double xPos, double yPos)
	{
		this.xPos = xPos;
		this.yPos = yPos;
		setParameters();
	}
	
	public Particle(double xPos, double yPos, double xVel, double yVel, int ltime, Color color)
	{	
		this.xPos = xPos;
		this.yPos = yPos;
		this.xVel = xVel;
		this.yVel = yVel;
		this.yAcc = 0.1;
		this.lifetime = ltime;
		this.color = color;
	}
	
	//Methods
	private void setParameters()
	{
		this.xVel = Math.random()*20 - 10;
		this.yVel = -Math.random()*20;
		this.yAcc = 0.7;
		this.lifetime = (int) (Math.random()*150);
		this.color = new Color((int) (Math.random()*256),(int) (Math.random()*256),(int) (Math.random()*256));
	}
	
	public void display()
	{
		if(lifetime>0)
		{
			StdDraw.setPenColor(this.color);
			StdDraw.filledRectangle(this.xPos, this.yPos, 5, 5);
			lifetime--;
		}
	}
	
	public void move()
	{
		if(lifetime >0)
		{
			this.xPos += this.xVel;
			this.yPos += this.yVel;
			this.yVel += yAcc;
		}
	}
}
