package edu.du.cerino.Lab9;

public class SpeedyCircle extends NormalCircle{

	public SpeedyCircle(double r) {
		super(r);
		super.setColor(StdDraw.GREEN);
	}
	
	public boolean bounce()
	{
		if(super.bounce())
		{
			this.xVel *= 1.2;
			this.yVel *= 1.2;
		}
		return super.bounce();
	}

}
