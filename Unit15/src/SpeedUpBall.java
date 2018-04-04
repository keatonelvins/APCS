//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends Ball
{

   //instance variables

   public SpeedUpBall()
   {
	   super();
   }

   public SpeedUpBall(int x, int y)
   {
	   super(x, y);
   }


   public SpeedUpBall(int x, int y, int xSpd, int ySpd)
   {
	   super(x, y, xSpd, ySpd);
   }

   public SpeedUpBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {
	   super(x, y, wid, ht, xSpd, ySpd);
   }


   public SpeedUpBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
	   super(x, y, wid, ht, col, xSpd, ySpd);
   }

   public void setXSpeed( int xSpd )
   {
	   int count = 0;
	   if (xSpd > 0) {
		   count = 1;
	   }
	   if (xSpd < 0) {
		   count = -1;
	   }
	   super.setXSpeed(xSpd + count);
   }

   public void setYSpeed( int ySpd )
   {
	   int count = 0;
	   if (ySpd > 0) {
		   count = 1;
	   }
	   if (ySpd < 0) {
		   count = -1;
	   }
	   super.setYSpeed(ySpd + count);
   }
}

