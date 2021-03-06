//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
		super(10,10);
		speed =5;
   }


   //add the other Paddle constructors
   public Paddle(int x, int y)
	{
		setPos(x, y);
		setSize(10, 10);
		setColor(new Color(0));
		setSpeed(5);
	}
   
   public Paddle(int x, int y, int s)
	{
		setPos(x, y);
		setSize(10, 10);
		setColor(new Color(0));
		setSpeed(s);
	}
	
	public Paddle(int x, int y, int w, int h)
	{
		setPos(x, y);
		setSize(w, h);
		setColor(new Color(0));
		setSpeed(5);
	}
	
	public Paddle(int x, int y, int w, int h, int s)
	{
		setPos(x, y);
		setSize(w, h);
		setSpeed(s);
	}
	
	public Paddle(int x, int y, int w, int h, Color c, int s)
	{
		setPos(x, y);
		setSize(w, h);
		setColor(c);
		setSpeed(s);
	}

	public void setSpeed(int s)
	{
	    speed = s;
	}

   public void moveUpAndDraw(Graphics window)
   {
	  
	  draw(window,Color.white);

      setY(getY()-speed);
      
      draw(window, Color.green);
   }

   public void moveDownAndDraw(Graphics window)
   {
	  draw(window,Color.white);

      setY(getY()+speed);
      
      draw(window, Color.green);
   }

   //add get methods
   public int getSpeed(){
	   return speed;
   }
   
   //add a toString() method
   public String toString(){
		return getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor() + " " + getSpeed();
	}
}