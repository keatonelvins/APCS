//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private Alien alienOne;
	private Alien alienTwo;
	private TinyAlien tinyBoi;
	private boolean tinyActive;
	 
	private AlienHorde aliens;
	private Bullets shots;
	private int alienCount;
	private boolean gameOver;
	private boolean didWin;

	private boolean[] keys;
	private BufferedImage back;
	private boolean bulletLock;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other stuff
		ship = new Ship(300,400,2);
		
		aliens = new AlienHorde();
        aliens.add(new Alien(200,50,2));
        aliens.add(new Alien(400,50,2));
        aliens.add(new Alien(600,50,2));
        aliens.add(new Alien(800,50,2));
        
        alienCount = 0;
        gameOver = false;
        didWin = false;
		
		shots = new Bullets();
		bulletLock = false;

		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   if(gameOver == false)
		   paint(window);
	   else{
		   window.setColor(Color.BLACK);
		   window.fillRect(0, 0, 1200, 800);
		   window.setColor(Color.YELLOW);
		   if(didWin == true)
			   window.drawString("YOU WIN", 600, 400);
		   else
			   window.drawString("YOU LOSE", 600, 400);
	   }

   }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,1200,800);

		if(keys[0] == true){
            if(ship.getX() > -15){
                ship.move("LEFT");
            }
		}
        if(keys[1] == true){
            if(ship.getX() < 1120){
                ship.move("RIGHT");
            }
        }
        if(keys[2] == true){
            if(ship.getY() > 10){
                ship.move("DOWN");
            }
        }
        if(keys[3] == true){
            if(ship.getY() < 680){
                ship.move("UP");
            } 
        }
        if(keys[4] == true){
        	Ammo shot = new Ammo(ship.getX()+35, ship.getY(), 5);
            shots.add(shot);
            keys[4]=false;
        }
        
        for(Alien a : aliens.getList())
        {
            a.draw(graphToBack);
            if(a.getX() < 0 || a.getX() > 1100)
            {
                a.drop();
                a.setSpeed(a.getSpeed()*-1);
            }
            if(a.getY() > 600){
            	aliens.remove(a);
            	gameOver();
            }
            a.move("RIGHT");
            
            if(a.getX()+15>=ship.getX()+15 && a.getX()+50<=ship.getX()+50 && a.getY()<=ship.getY() && a.getY()+80>=ship.getY())
            	gameOver = true;

            for(Ammo s: shots.getList())
            {
                if(a.getX()+15<=s.getX() && a.getX()+50>=s.getX() && a.getY()+15<=s.getY() && a.getY()+60>=s.getY())
                {
                    aliens.remove(a);
                    shots.remove(s);
                }
                
            }
        }
        
        if(alienCount % 5 == 0 && alienCount > 0 && tinyActive == false){
        	tinyActive = true;
        	tinyBoi = new TinyAlien(0,50,4);
        }
        
        if(tinyActive == true){
        	tinyBoi.draw(graphToBack);
            if(tinyBoi.getX() < 0 || tinyBoi.getX() > 1100)
            {
            	tinyBoi.drop();
            	tinyBoi.setSpeed(tinyBoi.getSpeed()*-1);
            }
            if(tinyBoi.getY() > 600){
            	tinyActive = false;
            	gameOver();
            }
            if(tinyBoi.getX()<=ship.getX() && tinyBoi.getX()+25>=ship.getX() && tinyBoi.getY()<=ship.getY() && tinyBoi.getY()+40>=ship.getY())
            {
            	gameOver = true;
            }
            tinyBoi.move("RIGHT");

            for(Ammo s: shots.getList())
            {
                if(tinyBoi.getX()<=s.getX() && tinyBoi.getX()+25>=s.getX() && tinyBoi.getY()<=s.getY() && tinyBoi.getY()+40>=s.getY())
                {
                	tinyActive = false;
                    shots.remove(s);
                }
                
            }
        }
        
        for(Ammo s : shots.getList()){
            s.draw(graphToBack);
            s.move("DOWN");
            if(s.getY()<=0)
            {
                shots.remove(s);
            }
        }

        ship.draw(graphToBack);
		twoDGraph.drawImage(back, null, 0, 0);
		
		if(alienCount <= 30){
			Alien lastAlien = aliens.getAlien(aliens.getList().size() - 1);
			if(lastAlien.getX() > 250 || lastAlien.getY() > 100){
	        	aliens.add(new Alien(0,50,2));
	            alienCount++;
			}
        }
		
		if(aliens.getList().size() == 0){
			didWin = true;
			gameOver();
		}

	}
	
	public void gameOver(){
		gameOver = true;
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE && bulletLock == false)
		{
			keys[4] = true;
			bulletLock = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
			bulletLock = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
		}
	}

   public void run()
   {
   	try
   	{
   		while(gameOver == false)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

