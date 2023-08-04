package edu.du.cerino.Project2;

import java.awt.Color;

public class StdDrawHelpers {
	//Static variables for count
	private static int ngonCount=0;
	private static int spiralCount=0;
	//New StdDraw color constants
	public static final Color MAROON = new Color(128,0,0);
	public static final Color OLIVEDRAB = new Color(107,142,35);
	public static final Color PERRIWINKLE = new Color(204,204,255);
	//Draws Ngon
	public static void filledRegularNgon(double centerX, double centerY, double radius, int n)
	{
		double [] x = new double [n];
		double [] y = new double [n];
		for(int i=0;i<n;i++)
		{
			x[i] = (centerX + radius * Math.cos( i * (2 * Math.PI / n)));
			y[i] = (centerX + radius * Math.sin( i * (2 * Math.PI / n)));
		}
		StdDraw.filledPolygon(x, y);
		setNgonCount(getNgonCount() + 1);
	}
	//Draws spiral
	public static void spiral(double centerX, double centerY, double maxRadius, double numTurns, int numSegments)
	{
		double x1 = centerX;
		double y1 = centerY;
		
		for(int i = 0; i < numSegments; i++) 
		{
			double x2 = (centerX) + i*(maxRadius / numSegments) * Math.cos(i * 2 * Math.PI / maxRadius);
			double y2 = (centerY) + i *(maxRadius / numSegments) * Math.sin(i* 2 * Math.PI / maxRadius);
			StdDraw.line(x1, y1, x2, y2); 
			x1 = x2;
			y1 = y2;
		}
		setSpiralCount(getSpiralCount() + 1);
	}
	//Getters and setters for the counts
	public static int getNgonCount() {
		return ngonCount;
	}
	public static void setNgonCount(int ngonCount) {
		StdDrawHelpers.ngonCount = ngonCount;
	}
	public static int getSpiralCount() {
		return spiralCount;
	}
	public static void setSpiralCount(int spiralCount) {
		StdDrawHelpers.spiralCount = spiralCount;
	}
}
