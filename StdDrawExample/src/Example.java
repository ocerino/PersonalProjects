
public class Example 
{

	public static void main(String[] args) 
	{
		StdDraw.setCanvasSize(200,300); //sets paramaters for width and height
		StdDraw.setXscale(0, StdDraw.getWidth()); //Sets coordinate system and returns the width
		StdDraw.setYscale(StdDraw.getHeight(), 0); //Sets coordinate system and returns the height
		
		StdDraw.clear(50,100,175);
		StdDraw.setPenColor(255,0,255);
		StdDraw.setPenRadius(0.01);
		int x = 0;
		for(int i =1; i <= 9; i ++)
		{
			StdDraw.line(x, 0, StdDraw.getWidth()/2, StdDraw.getHeight()/2);
			x += StdDraw.getWidth()/8;
		}
		for(int i = 1; i <=9; i++)
		{
			x -= StdDraw.getWidth()/8;
			StdDraw.line(x,StdDraw.getHeight(), StdDraw.getWidth()/2, StdDraw.getHeight()/2);
		}
	}

}
