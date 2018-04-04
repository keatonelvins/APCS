//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	public Ball(int x, int y)
	{
		super(x,y);
		setXSpeed(3);
		setYSpeed(1);
	}
	
	public Ball(int x, int y, int w, int h)
	{
		super(x,y,w,h);
		setXSpeed(3);
		setYSpeed(1);
	}
	
	public Ball(int x, int y, int w, int h, Color c)
	{
		super(x,y,w,h,c);
		setXSpeed(3);
		setYSpeed(1);
	}
	
	public Ball(int x, int y, int w, int h, int xS, int yS) {
		super(x, y, w, h);
		setXSpeed(xS);
		setYSpeed(yS);
		
	}
	
	public Ball(int x, int y, int w, int h, Color c, int xS, int yS)
	{
		super(x,y,w,h,c);
		setXSpeed(xS);
		setYSpeed(yS);
	}
	
   //add the set methods
	public void setXSpeed(int x){
	   xSpeed = x;
	}
	   
	public void setYSpeed(int y){
		ySpeed = y;
	}   

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   draw(window,Color.white);

      setX(getX()+xSpeed);
		//setY
      setY(getY()+ySpeed);
		//draw the ball at its new location
      draw(window, Color.blue);
   }
   
   public void erase(Graphics window)
   {
	   draw(window,Color.white);
   }
   
	public boolean equals(Object obj)
	{
		Ball rhs = (Ball)obj;
		if(getX() == rhs.getX() && getY() == rhs.getY() && getXSpeed() == rhs.getXSpeed() && getYSpeed() == rhs.getYSpeed())
			return true;
		return false;
	}   

   //add the get methods
	public int getXSpeed(){
		   return xSpeed;
	   }
	   
	   public int getYSpeed(){
		   return ySpeed;
	   }
   //add a toString() method
	   public String toString(){
			return getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor() + " " + getXSpeed() + " " + getYSpeed();
		}
}