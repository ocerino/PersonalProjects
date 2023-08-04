package edu.du.cerino.MiniProject1;

public class MiniProject1 {

	public static void main(String[] args) {
		int xPosition, yPosition;
		int width = 200;
		int height = 200;
		int count = 0;
		StdDraw.setCanvasSize(width, height);
		StdDraw.setXscale(0, width);
		StdDraw.setYscale(0, height);

		StdDraw.enableDoubleBuffering();
		for (int i = 0; i < 5000; i++)
		{
			xPosition = (int) (Math.random() * width);
			yPosition = (int) (Math.random() * height);

			if (xPosition >= yPosition && xPosition <= width / 2) {
				StdDraw.setPenColor(0, 255, 255); //aqua
			} 
			else if (xPosition > yPosition && xPosition > width / 2) {
				StdDraw.setPenColor(255, 0, 255); //purple
			} 
			else if (xPosition < yPosition && xPosition <= width / 2) {
				StdDraw.setPenColor(255, 255, 0); //yellow
			} 
			else if (xPosition <= yPosition && xPosition > width / 2) {
				StdDraw.setPenColor(0, 100, 100); //green gray?
			}

			StdDraw.filledCircle(xPosition, yPosition, 5);

			StdDraw.show();
			StdDraw.pause(5);
			count++;

		}
	}
}
