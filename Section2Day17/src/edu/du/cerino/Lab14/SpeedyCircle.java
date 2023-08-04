package edu.du.cerino.Lab14;

public class SpeedyCircle extends NormalCircle{

	public SpeedyCircle(double r) {
		super(r);
		super.setColor(StdDraw.GREEN);
	}
	
	public boolean bounce()
	{
		if(super.bounce())
		{
			this.velocity.scalarMultiple(1.2);
		}
		return super.bounce();
	}

}
