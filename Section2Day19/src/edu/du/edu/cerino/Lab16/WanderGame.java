package edu.du.edu.cerino.Lab16;

import java.awt.*;
import java.util.*;

public class WanderGame implements DrawListener {
	
	private double xPos, yPos, size;
	private Color color;
	private Draw canvas;
	private ArrayList<Food> food;
	
	public WanderGame()
	{
		this.canvas = new Draw();
		this.canvas.setCanvasSize(500, 500);
		this.canvas.setXscale(0, 500);
		this.canvas.setYscale(0, 500);
		this.canvas.addListener(this);
		this.xPos = Math.random()*500;
		this.yPos = Math.random()*500;
		this.size = 12.5;
		this.color = new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256));
		this.food = new ArrayList<Food> (100);
		for(int i = 0;i<100;i++)
		{
			food.add(i, new Food(Math.random()*500,Math.random()*500));
		}
	}
	

	@Override
	public void mousePressed(double x, double y) {
		if(x > xPos+size/3 && y > yPos+size/3)
		{
			this.color = new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256));
		}
		else 
		{
			this.xPos = Math.random()*500;
			this.yPos = Math.random()*500;
		}
	}
	
	@Override
	public void keyTyped(char c) {
		if(c=='w')
		{
			yPos++;
		}
		else if(c=='s')
		{
			yPos--;
		}
		else if(c=='a')
		{
			xPos--;
		}
		else if(c=='d')
		{
			xPos++;
		}
	}
	
	public void draw()
	{
		canvas.enableDoubleBuffering();
		while(true)
		{
			canvas.clear();
			canvas.setPenColor(color);
			canvas.filledCircle(xPos, yPos, size);
			for(int i = 0; i<food.size();i ++)
			{
				food.get(i).draw();
			
				
				if(xPos <= food.get(i).xPosition+size/2 && yPos <= food.get(i).yPosition+size/2 || xPos >= food.get(i).xPosition+size/2 && yPos >= food.get(i).yPosition+size/2)
				{
					food.remove(food.get(i));
					size++;
				}
			}
			canvas.show();
			canvas.pause(10);
		}
		
		
	}
	
	private class Food
	{
		private double xPosition;
		private double yPosition;
		
		public Food(double x, double y)
		{
			this.xPosition = x;
			this.yPosition = y;
		}
		
		public void draw()
		{
			canvas.setPenColor(Draw.BOOK_LIGHT_BLUE);
			canvas.filledCircle(xPosition, yPosition, 10);
		}
	}

	@Override
	public void mouseDragged(double x, double y) {
	
	}

	@Override
	public void mouseReleased(double x, double y) {
	
	}

	@Override
	public void keyPressed(int keycode) {
	
	}

	@Override
	public void keyReleased(int keycode) {
		
	}

}
