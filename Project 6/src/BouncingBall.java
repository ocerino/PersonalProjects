
public class BouncingBall 
{
	//Instance variables (properties)
	private double xPosition; // represents the center of the ball
	private double yPosition; // represent the center of the ball
	private double xVelocity; // amount the ball moves per frame, horizontally
	private double yVelocity; // amount the ball moves per frame vertically
	private double zVelocity;
	private double wVelocity;
	private double size1;
	private double size2;
	private int red;
	private int green;
	private int blue;

	public BouncingBall()
	{
			xPosition = StdDraw.getWidth()/2;
			yPosition = StdDraw.getHeight()/2;
			xVelocity = Math.random();
			yVelocity = Math.random();
			size1 = StdDraw.getWidth() / 20.0;
			size2 = StdDraw.getHeight() / 20.0;
			red = 150;
			green = 130;
			blue = 20;
			System.out.println("default creator for BouncingBall");
	}

	public BouncingBall(double x, double y, double xv, double yv)
	{
			xPosition = x;
			yPosition = y;
			xVelocity = xv;
			yVelocity = yv;
			size1 = 25;
			size2 = 25;
			red = 250;
			green = 130;
			blue = 120;
			System.out.println("Other constructor called");
	}
	
	public BouncingBall(double x, double y, double xv, double yv, double s1, double s2, int r, int g, int b)
	{
		xPosition = x;
		yPosition = y;
		xVelocity = xv;
		yVelocity = yv;
		size1 = s1;
		size2 = s2;
		red = r;
		green = g;
		blue = b;
		System.out.println("Other other constructor called");
	}

	// move the ball within the canvas, based on the velocity. Bounce if the edges
	// of the canvas are reached)
	public void move() 
	{
		// Move, an an amount determined by the velocity.
		xPosition += xVelocity;
		yPosition += yVelocity;

		// Bounce if you're moving beyond any of the edge
		if ((xPosition > .95 * StdDraw.getWidth() && xVelocity > 0) || (xPosition < .05 * StdDraw.getWidth() && xVelocity < 0)) 
		{
			xVelocity *= -1;
		}
		
		if ((yPosition > .95 * StdDraw.getHeight() && yVelocity > 0) || (yPosition < .05 * StdDraw.getHeight() && yVelocity < 0)) 
		{
			yVelocity *= -1;
		}
	}

	public void draw() 
	{
		StdDraw.setPenColor(red, green, blue);
		StdDraw.filledEllipse(xPosition, yPosition, size1, size2);
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.ellipse(xPosition, yPosition, size1, size2);
	}
	
	public void randomReset()
	{
		xPosition = Math.random()*StdDraw.getWidth();
		yPosition = Math.random()*StdDraw.getHeight();
	}

	
	public boolean isFrozen()
	{
		zVelocity = xVelocity;
		wVelocity = yVelocity;
		
		if(StdDraw.isMousePressed())
		{
			
			if(StdDraw.mouseX() <= xPosition+12.5 && StdDraw.mouseX() >= xPosition-12.5 && StdDraw.mouseY() >=yPosition-12.5 && StdDraw.mouseY() <= yPosition+12.5)
			{
				xVelocity = 0;
				yVelocity = 0;
				return true;
			}
		}
		
		return false;
	}
	
	
	public boolean isColliding(BouncingBall other) 
	{
		if(12.5>Math.sqrt((this.xPosition-other.xPosition)*(this.xPosition-other.xPosition) + (this.yPosition-other.yPosition)*(this.yPosition-other.yPosition)))
		{
			return true;
		}
		
		return false;
	}
}
