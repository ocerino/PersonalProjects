
public class Project6 {

	public static void main(String[] args) 
	{
		BouncingBall [] balls = new BouncingBall[5];
		StdDraw.setCanvasSize(500, 500);
		StdDraw.setXscale(0, StdDraw.getWidth());
		StdDraw.setYscale(StdDraw.getHeight(), 0);
		
		for(int i=0; i < balls.length;i ++)
		{
			balls[i] = new BouncingBall(StdDraw.getWidth()*Math.random(), StdDraw.getHeight()*Math.random(),Math.random()*4 - 2,Math.random()*4 - 2);
		}
		
		StdDraw.enableDoubleBuffering();
		
		while (true) 
		{
			StdDraw.clear();
			for(int i =0;i<balls.length;i++)
			{
				balls[i].draw();
				if(balls[i].isFrozen() == false)
				{
					balls[i].move();
				}
				
				for(int j=i+1;j<balls.length;j++)
				{
					if(isColliding(balls[j])==true)
					{
						
					}
				}
			}
			StdDraw.show();
			StdDraw.pause(5);
		}
		
		
	}
	
	public static boolean checkGameEnd()
	{
		if()
		{
			
		}
		
		return false;
	}

}
