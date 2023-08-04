
public class Driver {

	public static void main(String[] args) 
	{
		Firework fw1 = null;
		
		StdDraw.setCanvasSize(500,500);
		StdDraw.setXscale(0, StdDraw.getWidth());
		StdDraw.setYscale(StdDraw.getHeight(),0);
		
		StdDraw.enableDoubleBuffering();
		while(true)
		{
			StdDraw.clear();
			if(fw1 != null)
			{
				fw1.display();
				fw1.explode();
			}
			
			if(StdDraw.isMousePressed())
			{
				fw1 = new Firework(StdDraw.mouseX(), StdDraw.mouseY());
			}
			
			StdDraw.show();
			StdDraw.pause(10);
		}
	}

}
