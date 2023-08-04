package edu.du.cerino.Lab14;

import java.awt.*;

public abstract class MovingCircle {
	protected Vector position;
	protected Vector velocity;
	protected double radius;
	private Color color;

	public MovingCircle(double r) {
		this.radius = r;
		this.position = new Vector(Math.random(), Math.random());
		this.velocity = new Vector(Math.random()* 0.02 - 0.01, Math.random()* 0.02 - 0.01);
	}

	public abstract void move();

	public void draw() {
		StdDraw.setPenColor(color);
		StdDraw.filledEllipse(position.x, position.y, radius, radius);
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.ellipse(position.x, position.y, radius, radius);
	}

	public void forward() {
		this.position.addVector(velocity);
	}

	public boolean bounce() {
		if ((position.x + radius > 1 && velocity.x > 0) || (position.x - radius < 0 && velocity.x < 0)) {
			velocity.x *= -1;
			return true;
		}

		if ((position.y + radius > 1 && velocity.y > 0) || (position.y - radius < 0 && velocity.y < 0)) {
			velocity.y *= -1;
			return true;
		}
		return false;
	}

	public void setColor(Color c) {
		this.color = c;
	}

	protected class Vector {
		protected double x, y;

		public Vector(double x, double y) {
			this.x = x;
			this.y = y;
		}

		public void addVector(Vector v) {
			this.x += v.x;
			this.y += v.y;
		}
		
		public void scalarMultiple(double c)
		{
			this.x *= c;
			this.y *= c;
		}
	}

}
