package edu.du.cerino.Lab14;

public class Lab14 {
	public static void main(String[] args)
	{
		MovingCircle[] circles = new MovingCircle [3];
		
		circles[0] = new NormalCircle(.1);
		circles[1] = new WobblyCircle(.1);
		circles[2] = new SpeedyCircle(.1);
		StdDraw.setCanvasSize(500,500);
		StdDraw.setXscale(0,1);
		StdDraw.setYscale(0,1);
		
		StdDraw.enableDoubleBuffering();
		while(true) {
			StdDraw.clear();
			for(int i=0;i<3;i++)
			{
				circles[i].draw();
				circles[i].move();
			}
			StdDraw.show();
			StdDraw.pause(10);
		}
	}

}
