package edu.du.cerino.Project5;

public class WindowDriver {

	public static void main(String[] args) {
		WindowDisplay test = new WindowDisplay(500,500);
		test.addWindow(50,50,60,80,Draw.BLUE);
		test.addWindow(100,130,80,80,Draw.RED);
		test.addWindow(80,80,60,80,Draw.GREEN);
		test.addWindow(120,60,100,80,Draw.BLACK);
		test.draw();

	}

}
