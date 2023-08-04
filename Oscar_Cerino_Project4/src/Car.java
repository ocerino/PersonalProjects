
public class Car 
{
	//Instance Variables
	private double xPosition;
	private double yPosition;
	private double xVelocity;
	private double size;
	SpinningWheel tire1;
	SpinningWheel tire2;
	
	//Constructors
	public Car()
	{
		xPosition = StdDraw.getWidth()/2;
		yPosition = StdDraw.getHeight()/2;
		xVelocity = Math.random()*4 -2;
		size = 100;
		tire1 = new SpinningWheel(xPosition-20,yPosition -(yPosition/9));
		tire2 = new SpinningWheel(xPosition+20,yPosition -(yPosition/9));
	}
	
	public Car(double xPos, double yPos)
	{
		xPosition = xPos;
		yPosition = yPos;
		xVelocity = Math.random()*4 -2;
		size = 100;
		tire1 = new SpinningWheel(xPosition-20,yPosition-(yPosition/10));
		tire2 = new SpinningWheel(xPosition+20,yPosition-(yPosition/10));
	}
	
	//Methods
	public void move() 
	{
		// Move, an an amount determined by the velocity.
		xPosition += xVelocity;

		// Bounce if you're moving beyond any of the edge
		if ((xPosition > .90 * StdDraw.getWidth() && xVelocity > 0) || (xPosition < .10 * StdDraw.getWidth() && xVelocity < 0)) 
		{
			xVelocity *= -1;
		}
		
		
	}

	public void draw() 
	{
		StdDraw.setPenColor(255, 100, 150);
		StdDraw.filledRectangle(xPosition, yPosition, size/2, size/4);
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.rectangle(xPosition, yPosition, size/2, size/4);
		tire1.draw();
		tire1.move(xVelocity);
		tire2.draw();
		tire2.move(xVelocity);
	}
}
