
public class Firework 
{
	private Particle[] particles;
	private double xPos;
	private double yPos;
	
	public Firework()
	{
		particles = new Particle [200];
		for(int i=0; i < this.particles.length;i++)
		{
			this.particles[i] = new Particle();
		}
		xPos = StdDraw.getWidth()/2;
		yPos = StdDraw.getHeight()/2;
	}
	
	public Firework(double xPos,double yPos)
	{
		particles = new Particle [200];
		for(int i=0; i < this.particles.length;i++)
		{
			this.particles[i] = new Particle(xPos, yPos);
		}
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	public void explode()
	{
		for(int i=0; i < this.particles.length;i++)
		{
			this.particles[i].move();
		}
	}
	
	public void display()
	{
		for(int i=0; i < this.particles.length;i++)
		{
			this.particles[i].display();
		}
	}
}
