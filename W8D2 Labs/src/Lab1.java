
public class Lab1 
{
	public static void main(String[] args)
	{
		GooglyEye[] eye = new GooglyEye[10];
		
		StdDraw.setCanvasSize(500, 500);
		StdDraw.setXscale(0, StdDraw.getWidth());
		StdDraw.setYscale(StdDraw.getHeight(), 0);
		
		for(int i=0; i < eye.length;i ++)
		{
			eye[i] = new GooglyEye(StdDraw.getWidth()*Math.random(), StdDraw.getHeight()*Math.random(),25,5);
		}
		
		StdDraw.enableDoubleBuffering();
		while (true) 
		{
			
			StdDraw.clear();
			
			for(int i=0; i < eye.length; i++)
			{
				eye[i].draw();
				eye[i].move();
			}

			StdDraw.show();
			StdDraw.pause(1);
		}
	}
}
