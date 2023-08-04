
public class Question_2 
{

	public static void main(String[] args) 
	{
		StdDraw.setCanvasSize(1700,850);
		StdDraw.setXscale(0,StdDraw.getWidth());
		StdDraw.setYscale(StdDraw.getHeight(), 0);
		
		float x = 25;
		float xVelocity = 1;
		
		StdDraw.enableDoubleBuffering();
		while(true)
		{
			StdDraw.clear(150,150,150);
			
			StdDraw.setPenColor(0,255,0);
			StdDraw.filledEllipse(x,StdDraw.getHeight()/2, 25, 25);
			
			x += xVelocity;
			
			if(x > StdDraw.getWidth() - 25 || x < 25)
			{
				xVelocity *= -1;
			}
			
			StdDraw.show();
		}
	}
}
