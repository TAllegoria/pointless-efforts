package ball;

public class Ball
{
	private int radius;
	private String material;
	private String color;
	private boolean inflatable;
	
	public Ball(int radius, String material, String color, boolean inflatable)
	{
		this.radius = radius;
		this.material = material;
		this.color = color;
		this.inflatable = inflatable;
	}

	public int getRadius()
	{
		return radius;
	}

	public void setRadius(int radius)
	{
		this.radius = Math.abs(radius);
	}

	public String getMaterial()
	{
		return material;
	}

	public void setMaterial(String material)
	{
		this.material = material;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public boolean isInflatable()
	{
		return inflatable;
	}

	public void setInflatable(boolean inflatable)
	{
		this.inflatable = inflatable;
	}

	public String toString()
	{
		if (this.inflatable == true)
		{
			return this.color + " " + this.material + " inflatable ball with a radius of " + this.radius + " mm";
		}
		else
		{
			return this.color + " " + this.material + " solid ball with a radius of " + this.radius + " mm";
		}
	}
	
	public double getCircumference()
	{
		return 2 * Math.PI * this.radius;
	}
	
	public double getVolume()
	{
		return 4 / 3 * Math.PI * Math.pow(this.radius, 3.0);
	}
}