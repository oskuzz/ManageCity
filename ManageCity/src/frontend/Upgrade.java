/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Main;
import backend.Main.SCREEN;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author osku0
 */
public class Upgrade extends MouseAdapter{
	
	public static float upgrade1 = 0;
	public static float upgrade2 = 0;
	public static float upgrade3 = 0;
	public static float upgrade4 = 0;
	public static float upgrade5 = 0;
	
    private Main main;
    
    public Upgrade(Main main) {
        this.main = main;
        
        
    }
    
    public void mousePressed(MouseEvent e){
    	int mx = e.getX();
    	int my = e.getY();
        if(main.screen == SCREEN.Upgrade) {
        	//upgrade1
        	if(mouseOver(mx,my, 668,200,25,21)) {
        		upgrade1--;
        	} else if(mouseOver(mx,my,810,200,25,21)) {
        		upgrade1++;
        	}
        	//upgrade2
        	if(mouseOver(mx,my, 668,250,25,21)) {
        		upgrade2--;
        	} else if(mouseOver(mx,my,810,250,25,21)) {
        		upgrade2++;
        	}
        	//upgrade3
        	if(mouseOver(mx,my, 668,300,25,21)) {
        		upgrade3--;
        	} else if(mouseOver(mx,my,810,300,25,21)) {
        		upgrade3++;
        	}
        	//upgrade4
        	if(mouseOver(mx,my, 668,350,25,21)) {
        		upgrade4--;
        	} else if(mouseOver(mx,my,810,350,25,21)) {
        		upgrade4++;
        	}
        	//upgrade5
        	if(mouseOver(mx,my, 668,400,25,21)) {
        		upgrade5--;
        	} else if(mouseOver(mx,my,810,400,25,21)) {
        		upgrade5++;
        	}
        	
        	
        }
    }
    
    public void mouseReleased(MouseEvent e){
        
    }
    
    public boolean mouseOver(int mx, int my, int x, int y, int width, int height) {
        if (mx > x && mx < x + width) {
            if (my > y && my < y + height) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    
    public void tick(){
    	upgrade1 = Main.clamp(upgrade1, 0, 5);
    	upgrade2 = Main.clamp(upgrade2, 0, 5);
    	upgrade3 = Main.clamp(upgrade3, 0, 5);
    	upgrade4 = Main.clamp(upgrade4, 0, 5);
    	upgrade5 = Main.clamp(upgrade5, 0, 5);
    }
    
    public void render(Graphics g){
    	Font fnt = new Font("arial", 1, 50);
    	Font fnt2 = new Font("arial", 1, 20);
    	
    	g.setFont(fnt);
        g.setColor(Color.black);
        g.drawString("Upgrades", 350, 75);
        
        //upgrade1
        g.fillRect(668, 200, 25, 21);
        g.setFont(fnt2);
        g.setColor(Color.white);
        g.drawString("-1", 671, 218);
        
        g.setColor(Color.green);
        g.fillRect(700, 200, (int) upgrade1 * 20, 20);
        
        g.setColor(Color.black);
        g.drawRect(700, 200, 100, 20);
        
        g.setColor(Color.black);
        g.fillRect(810, 200, 25, 21);
        g.setFont(fnt2);
        g.setColor(Color.white);
        g.drawString("+1", 811, 218);
        
        g.setColor(Color.black);
        g.drawRect(700, 200, 20, 20);
        g.drawRect(720, 200, 20, 20);
        g.drawRect(740, 200, 20, 20);
        g.drawRect(760, 200, 20, 20);
        
      //upgrade2
        g.setColor(Color.black);
        g.fillRect(668, 250, 25, 21);
        g.setFont(fnt2);
        g.setColor(Color.white);
        g.drawString("-1", 671, 268);
        
        g.setColor(Color.green);
        g.fillRect(700, 250, (int) upgrade2 * 20, 20);
        
        g.setColor(Color.black);
        g.drawRect(700, 250, 100, 20);
        
        g.setColor(Color.black);
        g.fillRect(810, 250, 25, 21);
        g.setFont(fnt2);
        g.setColor(Color.white);
        g.drawString("+1", 811, 268);
        
        g.setColor(Color.black);
        g.drawRect(700, 250, 20, 20);
        g.drawRect(720, 250, 20, 20);
        g.drawRect(740, 250, 20, 20);
        g.drawRect(760, 250, 20, 20);
        
      //upgrade3
        g.setColor(Color.black);
        g.fillRect(668, 300, 25, 21);
        g.setFont(fnt2);
        g.setColor(Color.white);
        g.drawString("-1", 671, 318);
        
        g.setColor(Color.green);
        g.fillRect(700, 300, (int) upgrade3 * 20, 20);
        
        g.setColor(Color.black);
        g.drawRect(700, 300, 100, 20);
        
        g.setColor(Color.black);
        g.fillRect(810, 300, 25, 21);
        g.setFont(fnt2);
        g.setColor(Color.white);
        g.drawString("+1", 811, 318);
        
        g.setColor(Color.black);
        g.drawRect(700, 300, 20, 20);
        g.drawRect(720, 300, 20, 20);
        g.drawRect(740, 300, 20, 20);
        g.drawRect(760, 300, 20, 20);
        
      //upgrade4
        g.setColor(Color.black);
        g.fillRect(668, 350, 25, 21);
        g.setFont(fnt2);
        g.setColor(Color.white);
        g.drawString("-1", 671, 368);
        
        g.setColor(Color.green);
        g.fillRect(700, 350, (int) upgrade4 * 20, 20);
        
        g.setColor(Color.black);
        g.drawRect(700, 350, 100, 20);
        
        g.setColor(Color.black);
        g.fillRect(810, 350, 25, 21);
        g.setFont(fnt2);
        g.setColor(Color.white);
        g.drawString("+1", 811, 368);
        
        g.setColor(Color.black);
        g.drawRect(700, 350, 20, 20);
        g.drawRect(720, 350, 20, 20);
        g.drawRect(740, 350, 20, 20);
        g.drawRect(760, 350, 20, 20);

        //upgrade5
        g.setColor(Color.black);
	    g.fillRect(668, 400, 25, 21);
	    g.setFont(fnt2);
	    g.setColor(Color.white);
	    g.drawString("-1", 671, 418);
	      
	    g.setColor(Color.green);
	    g.fillRect(700, 400, (int) upgrade5 * 20, 20);
	      
	    g.setColor(Color.black);
	    g.drawRect(700, 400, 100, 20);
	      
	    g.setColor(Color.black);
	    g.fillRect(810, 400, 25, 21);
	    g.setFont(fnt2);
	    g.setColor(Color.white);
	    g.drawString("+1", 811, 418);
	    
	    g.setColor(Color.black);
        g.drawRect(700, 400, 20, 20);
        g.drawRect(720, 400, 20, 20);
        g.drawRect(740, 400, 20, 20);
        g.drawRect(760, 400, 20, 20);
        
    }
}
