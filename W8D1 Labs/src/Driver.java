
public class Driver 
{

	public static void main(String[] args) 
	{
		BouncingBall ball = new BouncingBall();

		StdDraw.setCanvasSize(500, 500);
		StdDraw.setXscale(0, StdDraw.getWidth());
		StdDraw.setYscale(StdDraw.getHeight(), 0);

		StdDraw.enableDoubleBuffering();
		while (true) 
		{
			StdDraw.clear();
			ball.draw();
			ball.move();
			StdDraw.show();
			StdDraw.pause(5);

		}
	}
	
}
