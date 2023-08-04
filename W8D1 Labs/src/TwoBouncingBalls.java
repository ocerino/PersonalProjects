
public class TwoBouncingBalls {

	public static void main(String[] args) 
	{
		BouncingBall ball = new BouncingBall();
		BouncingBall ball2 = new BouncingBall(100, 200, 4, 6);
		BouncingBall ball3 = new BouncingBall(50,355,2,9,100,100,155,100,155);

		StdDraw.setCanvasSize(500, 500);
		StdDraw.setXscale(0, StdDraw.getWidth());
		StdDraw.setYscale(StdDraw.getHeight(), 0);

		StdDraw.enableDoubleBuffering();
		while (true) 
		{
			StdDraw.clear();
			ball.draw();
			ball.move();
			ball2.draw();
			ball2.move();
			ball3.draw();
			ball3.move();
			StdDraw.show();
			StdDraw.pause(5);
			
			if(StdDraw.hasNextKeyTyped())
			{
			      if(StdDraw.nextKeyTyped() == 'r')
			      {
			           ball.randomReset();
			           ball2.randomReset();
			           ball3.randomReset();
			       }
			}

		}
	}

}
