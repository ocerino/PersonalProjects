
public class Animation 
{

	public static void main(String[] args) 
	{
		StdDraw.setCanvasSize(500,500);
		StdDraw.setXscale(0,StdDraw.getWidth());
		StdDraw.setYscale(StdDraw.getHeight(), 0);
		
		float x = 25;
		float xVelocity = 1;
		
		StdDraw.enableDoubleBuffering();
		while(true)
		{
			StdDraw.clear(150,150,150);
			
			StdDraw.setPenColor(255,0,0);
			StdDraw.filledRectangle(x,StdDraw.getHeight()/2, 25, 25);
			
			x += xVelocity;
			
			if(x > StdDraw.getWidth() - 25 || x < 25)
			{
				xVelocity *= -1;
			}
			
			StdDraw.show();
		}
	}

}
