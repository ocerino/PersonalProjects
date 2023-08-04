
public class Driver 
{
	public static void main(String[]args)
	{
		Car[] cars = new Car[3];
		
		StdDraw.setCanvasSize(500, 500);
		StdDraw.setXscale(0, StdDraw.getWidth());
		StdDraw.setYscale(0, StdDraw.getHeight());
		
		cars[0] = new Car();
		for(int i=1; i < cars.length;i ++)
		{
			cars[i] = new Car(StdDraw.getWidth()*Math.random(), StdDraw.getHeight()*Math.random());
		}
		
		StdDraw.enableDoubleBuffering();
		while (true) 
		{
			
			StdDraw.clear();
			
			
			for(int i=0; i < cars.length; i++)
			{
				cars[i].draw();
				cars[i].move();
			}

			StdDraw.show();
			StdDraw.pause(1);
		}
	}
}
