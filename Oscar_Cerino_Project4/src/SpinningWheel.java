
/** This class animates a Spinning wheel using StdSDraw. The image is a red circle of the given radius with 10 blue spokes.
 * The wheel rotates each time draw() is called. 
 * The no-argument constructor places the wheel at the center of the screen, with a radius of 50.
 * A second constructor accepts the x position, the y-position and the radius
 */
public class SpinningWheel {
	private float angle;
	private float time;
	private double xPos;
	private double yPos;
	private float radius;
	
	/**
	 *  No-argument constructor
	 */
	public SpinningWheel()
	{
		angle = 0;
		time = 0;
		this.xPos = StdDraw.getWidth()/2;
		this.yPos = StdDraw.getHeight()/2;
		this.radius = 50;

	}
	
	public SpinningWheel(double x, double y)
	{
		angle = 0;
		time = 0;
		this.xPos = x;
		this.yPos = y;
		this.radius = 18;

	}
	
	/**
	 * Constructor - initialize the (x,y) position of the wheel, with a radius r
	 * @param x
	 * @param y
	 * @param r
	 */
	public SpinningWheel(float x, float y, float r)
	{
		angle = 0;
		time = 0;
		this.xPos = x;
		this.yPos = y;
		this.radius = r;
	}
	
	/**
	 *  The wheel spins, 1 percent of a full rotation each time move() is called
	 */
	public void move(double xVel)
	{
		this.xPos += xVel;
		angle += 0.01 % (2* Math.PI);
	}
	
	/**
	 * Draw the wheel at the current position and with the current angle rotation .
	 */
	public void draw()
	{
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.circle(xPos, yPos, radius);
		StdDraw.setPenColor(StdDraw.BLUE);
		float offset = (float) Math.PI * 2 / 10;
		for(int i=0; i < 10; i++)
		{
			StdDraw.line(xPos + Math.cos(angle + i * offset) * radius, yPos + Math.sin(angle + i * offset) * radius, xPos + Math.cos(angle+ Math.PI  + i * offset) * radius, yPos + Math.sin(angle+Math.PI + i * offset) * radius);
		}
		
	}

}
