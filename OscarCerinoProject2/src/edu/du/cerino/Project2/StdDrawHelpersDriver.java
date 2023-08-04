package edu.du.cerino.Project2;

public class StdDrawHelpersDriver {

	public static void main(String[] args) {
		StdDraw.setCanvasSize(500, 500);
		StdDraw.setXscale(0, 500);
		StdDraw.setYscale(0, 500);
		//Draws Ngons
		StdDraw.setPenColor(StdDrawHelpers.MAROON);
		StdDrawHelpers.filledRegularNgon(100.0, 200.0, 50.0, 7);
		StdDraw.setPenColor(StdDrawHelpers.PERRIWINKLE);
		StdDrawHelpers.filledRegularNgon(350, 400, 100, 21);
		//Draws Spirals
		StdDraw.setPenRadius(0.01);
		StdDraw.setPenColor(StdDrawHelpers.PERRIWINKLE);
		StdDrawHelpers.spiral(250.0, 100.0, 100.0, 10.0, 420);
		StdDraw.setPenColor(StdDrawHelpers.OLIVEDRAB);
		StdDrawHelpers.spiral(100.0, 400.0, 100.0, 8.0, 999);
		
		System.out.println("There were " + StdDrawHelpers.getNgonCount()+ " calls to StdDrawHelpers.filledRegularNgon()");
		System.out.println("There were " + StdDrawHelpers.getSpiralCount()+ " calls to StdDrawHelpers.spiral()");
	}

}
