//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		setPos(100, 150);
		setSize(10, 10);
		setColor(new Color(0));
	}

	//add other Block constructors - x , y , width, height, color
	public Block(int x, int y, int w, int h)
	{
		setPos(x, y);
		setSize(w, h);
		setColor(new Color(0));
	}
	
	public Block(int x, int y)
	{
		setPos(x, y);
		setSize(10, 10);
		setColor(new Color(0));
	}
	
	public Block(int x, int y, int w, int h, Color c)
	{
		setPos(x, y);
		setSize(w, h);
		setColor(c);
	}

   //add the other set methods
	public void setPos(int x, int y){
		   xPos = x;
		   yPos = y;
	}
	
   public void setX(int x){
	   xPos = x;
   }
   
   public void setY(int y){
	   yPos = y;
   }

   public void setSize(int w, int h){
	   width = w;
	   height = h;
   }
   
   public void setColor(Color col)
   {
	   color = col;
   }
   
   public int getX(){
	   return xPos;
   }
   
   public int getY(){
	   return yPos;
   }
   
   public int getWidth(){
	   return width;
   }
   
   public int getHeight(){
	   return height;
   }
   
   public Color getColor(){
	   return color;
   }

   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   setColor(col);
	   window.setColor(color);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		Block rhs = (Block)obj;
		if(getX() == rhs.getX() && getY() == rhs.getY() && getWidth() == rhs.getWidth() && getHeight() == rhs.getHeight())
			return true;
		return false;
	}   
	
   //add a toString() method  - x , y , width, height, color
	public String toString(){
		return getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor();
	}
}