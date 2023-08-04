/** This class animates a googly eye using StdSDraw. The image is a black circle of the given radius,
 * with a filled circle (to represent the eyeball) that rotates within the outer circle each time draw() is called. 
 * The no-argument constructor places the eye at the center of the screen, with a radius of 50.
 * A second constructor accepts the x position, the y-position and the radius
 * A third constructor accepts the x-position, the y-position, the radius and the starting angle
 */
public class GooglyEye {
	private double angle;
	private double xPos;
	private double yPos;
	private double radius;
	
	/**
	 * No-argument constructor, place the eye in the middle of the screen, with a radius of 50.
	 */
	public GooglyEye()
	{
		angle = 0;
		this.xPos = StdDraw.getWidth()/2;
		this.yPos = StdDraw.getHeight()/2;
		this.radius = 50;

	}
	
	/**
	 * Constructor - accepts the (x,y) position and the radius
	 * @param x x position
	 * @param y y position
	 * @param r radius
	 */
	public GooglyEye(double x, double y, double r)
	{
		angle = 0;
		this.xPos = x;
		this.yPos = y;
		this.radius = r;
	}
	
	/**
	 * Constructor - accepts the (x,y) position, the radius, and the starting rotation angle
	 * @param x x position
	 * @param y y position
	 * @param r radius
	 * @param a rotation angle
	 */
	public GooglyEye(double x, double y, double r, double a)
	{
		this.angle = a;
		this.xPos = x;
		this.yPos = y;
		this.radius = r;
	}
	
	/**
	 * Rotate the eye, 1 percent of a full rotation each time move() is called
	 */
	public void move()
	{
		angle += 0.01 % (2* Math.PI);
	}
	
	/**
	 * Draw the eye, at the current position and the current rotation angle
	 */
	public void draw()
	{
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.setPenRadius(.005);
		StdDraw.circle(xPos, yPos, radius);
		float offset = (float) Math.PI * 2 / 10;
		StdDraw.filledCircle(xPos + radius/2*Math.cos(angle), yPos + radius/2*Math.sin(angle), radius/2);
		
	}

}
