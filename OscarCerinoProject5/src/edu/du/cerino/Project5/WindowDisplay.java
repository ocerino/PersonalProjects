package edu.du.cerino.Project5;

import java.awt.*;
import java.util.*;



public class WindowDisplay implements DrawListener {

	private ArrayList<Window> windows;
	private Draw canvas;
	private double xP; 
	private double yP; 
	private double wX; 
	private double wY;  
	private ArrayList<Window> secondWindows; 
	private boolean reset;

	public WindowDisplay(int xS, int yS) {
		canvas = new Draw (); 
		canvas.setXscale(0, xS); 
		canvas.setYscale(0, yS); 
		canvas.addListener(this);
		windows = new ArrayList<Window>(); 
		secondWindows = new ArrayList <Window>(); 
		reset=true;
	}

	public void addWindow(double x, double y, double w, double h, Color c) {
		Window window = new Window(x, y, w, h, c);
		windows.add(window);
		if(reset)
		{
		Window resetWindow; 
		resetWindow = new Window (x, y, w, h, c); 
		secondWindows.add(resetWindow); 
		}

	}

	public void draw() {
		canvas.clear(); 
		for (int i =0; i< windows.size(); i ++)
		{
			Window w  = windows.get(i);
			w.draw();
		}
	}
	
	public void secondDraw ()
	{
		canvas.clear(); 
		for (int i=0; i <secondWindows.size(); i ++)
		{
			Window w3 = windows.get(i); 
			Window w4 = secondWindows.get(i); 
			w3.draw(); 
			w4.draw(); 
		}
	}

	public void reset() {
		secondDraw(); 
		reset=false;
		windows.clear(); 
		for (int i = 0; i < secondWindows.size(); i ++)
		{
			Window w2 = secondWindows.get(i); 
			windows.add(w2); 
			 
		}
	}

	@Override
	public void mousePressed(double x, double y) {

		for (int i=windows.size()-1; i >= 0; i --)
		{
			
			if (windows.get(i).isInsideWindow(x, y) == true )
			{
				Window n = windows.get(i); 
				 
				
				windows.remove(i);
				windows.add(n); 
				
				xP = x; 
				yP = y; 
				
				wX = n.xPos; 
				wY = n.yPos; 
				this.draw(); 
				return; 

			}
		}

	}

	@Override
	public void mouseDragged(double x, double y) {
		for (int i = windows.size()-1; i >= 0 ; i --) 
		{
			if (windows.get(i).isInsideWindow(x, y) == true)
			{
				windows.get(i).xPos = x + (wX- xP); 
				windows.get(i).yPos = y + (wY -yP); 
				this.draw();
				return; 
				
			}
		}
		
	}

	@Override
	public void mouseReleased(double x, double y) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(char c) {
		if (c == 'r') {
			reset();
		} else if (c == 'q') {
			System.exit(0);
		}

	}

	@Override
	public void keyPressed(int keycode) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(int keycode) {
		// TODO Auto-generated method stub

	}

	private class Window {
		private double xPos, yPos, width, height;
		private Color color;

		public Window(double x, double y, double w, double h, Color c) {
			
			xPos = x;
			yPos = y;
			width = w;
			height = h;
			color = c;
		}

		public void draw() {
			canvas.setPenColor(color);
			canvas.filledRectangle(xPos, yPos, width / 2, height / 2);
		}

		public boolean isInsideWindow(double x, double y) {

			if ((x >xPos -width/2 && x<xPos + width/2 && y <yPos + height/2 && y> yPos - height/2)) {

				return true;
			} else {
				return false;
			}
		}
	}
}
