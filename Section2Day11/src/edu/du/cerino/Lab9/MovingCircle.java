package edu.du.cerino.Lab9;

import java.awt.*;

public abstract class MovingCircle {
 protected double xPos;
 protected double yPos;
 protected double xVel;
 protected double yVel;
 protected double radius;
 private Color color;
 
 public MovingCircle(double r)
 {
	 this.radius = r;
	 this.xPos = Math.random();
	 this.yPos = Math.random();
	 this.xVel = Math.random() *0.02-0.01;
	 this.yVel = Math.random() *0.02-0.01;
 }
 
 public abstract void move();
 
 public void draw()
 {
	 StdDraw.setPenColor(color);
	 StdDraw.filledEllipse(xPos,yPos,radius,radius);
	 StdDraw.setPenColor(0, 0, 0);
	 StdDraw.ellipse(xPos, yPos, radius, radius);
 }
 
 public void forward()
 {
	 xPos += xVel;
	 yPos += yVel;
 }
 
 public boolean bounce()
 {
	 if ((xPos+radius >1 && xVel > 0) || (xPos -radius < 0 && xVel < 0)) 
		{
			xVel *= -1;
			return true;
		}
		
		if ((yPos+radius > 1 && yVel > 0) || (yPos -radius < 0 && yVel< 0)) 
		{
			yVel *= -1;
			return true;
		}
		return false;
 }
 
 public void setColor(Color c)
 {
	 this.color=c;
 }
 
}
