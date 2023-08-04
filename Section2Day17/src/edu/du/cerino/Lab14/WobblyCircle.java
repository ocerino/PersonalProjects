package edu.du.cerino.Lab14;

public class WobblyCircle extends MovingCircle{

	public WobblyCircle(double r) {
		super(r);
		
		super.setColor(StdDraw.RED);
	}
	
	public void move()
	{
		super.forward();
		super.bounce();
		this.position.x = position.x+(Math.random()*0.02-0.01);
		this.position.y = position.y+(Math.random()*0.02-0.01);
	}

}
