package edu.du.gutierrezgutierelizabeth;

import java.awt.Color;
import java.awt.Window;
import java.util.ArrayList;

public class WindowDisplay implements DrawListener
{
	private Draw canvas;
	private double xScale; 
	private double yScale; 
	//create a global xPos and yPos 
	private double xP; 
	private double yP; 
	private double wX; 
	private double wY; 
	private ArrayList<Windows> window; 
	private ArrayList<Windows> secondWindow; 
	private boolean reset;
	 
	//constructor 
	public  WindowDisplay (double xS, double yS)
	{
		canvas = new Draw (); 
		canvas.setXscale(0, 300); 
		canvas.setYscale(0, 300); 
		canvas.addListener(this);
		this.xScale = xS; 
		this.yScale = yS; 
		//create a window 
		window = new ArrayList<Windows>(); 
		//second window for resetting
		secondWindow = new ArrayList <Windows>(); 
		reset=true;
	}
	@Override
	public void mousePressed(double x, double y) 
	{
		
		//check if the value is inside and reset it to the top
		for (int i=window.size()-1; i >= 0; i --)
		{
			
			if (window.get(i).check(x, y) == true )
			{
				Windows n = window.get(i); 
				 
				
				window.remove(i);
				System.out.println ("here"); 
				window.add(n); 
				//store the values of the new window 
				//when dragged 
				xP = x; 
				yP = y; 
				
				wX = n.xPos; 
				wY = n.yPos; 
				//break the loop 
				this.Draw(); 
				return; 

			}
		}
	}

	@Override
	public void mouseDragged(double x, double y) 
	{
		for (int i = window.size()-1; i >= 0 ; i --) 
		{
			if (window.get(i).check(x, y) == true)
			{
				//adding to the local xPos 
				window.get(i).xPos = x + (wX- xP); 
				window.get(i).yPos = y + (wY -yP); 
				this.Draw();
				return; 
				
			}
		}
		
	}

	@Override
	public void mouseReleased(double x, double y) {}

	@Override
	public void keyTyped(char c) 
	{
		if (c == 'Q' || c == 'q')
		{
			System.exit(0);
		}
		else if (c == 'R' || c == 'r')
		{
			reset(); 
			System.out.println ("E"); 
			
		}
		else 
		{
			System.out.println ("Incorrect letter inputted in program try again."); 
		}
		//draw the window 
		this.Draw(); 
	}
	

	@Override
	public void keyPressed(int keycode) {}

	@Override
	public void keyReleased(int keycode) {}
	
	//addWindow
	public void addWindow(double x, double y, double w, double h, Color c)
	{
		//create a window object
		Windows wd ; 
		//create a new window object
		wd = new Windows (x, y, w, h, c ); 
		//add to the list of windows
		window.add(wd);
		
		//create a second window
		if(reset)
		{
		Windows resetw; 
		resetw = new Windows (x, y, w, h, c); 
		secondWindow.add(resetw); 
		}
	}
	//will draw all of the windows
	public void Draw()
	{
		canvas.clear(); 
		for (int i =0; i< window.size(); i ++)
		{
			//create a window object 
			Windows w  = window.get(i);
			//draw rectangles from inner class Food 
			w.draw();
		}
	}
	//will reset back to their original order 
	public void reset()
	{
		secondDraw(); 
		reset=false;
		//set the two windows equal to each other
		window.clear(); 
		//will draw the original order of the windows 
		for (int i = 0; i < secondWindow.size(); i ++)
		{
			Windows w2 = secondWindow.get(i); 
			System.out.println ("Hh"); 
			window.add(w2); 
			 
		}
//		this.Draw(); 
	}
	public void secondDraw ()
	{
		canvas.clear(); 
		for (int i=0; i <secondWindow.size(); i ++)
		{
			Windows w3 = window.get(i); 
			Windows w4 = secondWindow.get(i); 
			w3.draw(); 
			w4.draw(); 
		}
	}
	

	//create the inner class
	public class Windows
	{
		private double xPos; 
		private double yPos; 
		private double width; 
		private double height; 
		private Color color;
		
		public Windows(double x, double y, double w, double h, Color c)
		{
			this.xPos = x; 
			this.yPos = y; 
			this.width = w; 
			this.height = h; 
			this.color = c; 
		}
		public void draw()
		{
			canvas.setPenColor (color); 
			//draw a single window
			canvas.filledRectangle(xPos, yPos, width/2, height/2);
			
			
		}
		public boolean check(double x, double y)
		{
			if (x >xPos -width/2 && x<xPos + width/2
					&& y <yPos + height/2 && y> yPos - height/2)
			{
				System.out.println ("The mouse is inside the window"); 
				return true; 
			}
			else 
			{
				System.out.println ("The mouse is not inside the window");
				return false; 
			}
			
		}
		
	}

}
