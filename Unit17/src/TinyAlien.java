import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;

public class TinyAlien extends Alien{
	private int speed;
	private Image image;
	
	public TinyAlien(int x, int y, int s)
	{
		super(x, y);
		speed=s;
		try
		{
			image = ImageIO.read(new File("H://APCS//Unit17//Assignments-starfighter//TinyAlien.png"));
		}
		catch(Exception e)
		{
			System.out.print("Error");
		}
	}
	
	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}
	
	public void drop(){
		setY(getY()+75);
	}
	
	public void move(String direction)
	{
		if(direction.equals("LEFT"))
	      setX(getX()-getSpeed());
		if(direction.equals("RIGHT"))
		  setX(getX()+getSpeed());
		if(direction.equals("UP"))
		  setY(getY()+getSpeed());
		if(direction.equals("DOWN"))
		  setY(getY()-getSpeed());
	}
	
	public void draw( Graphics window )
	{
		window.drawImage(image,getX(),getY(),32,15,null);
	}
}
