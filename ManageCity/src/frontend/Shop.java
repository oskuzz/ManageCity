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
import java.awt.image.BufferedImage;

/**
 *
 * @author s1601396
 */
public class Shop extends MouseAdapter {

    private Main main;
    private Bank bank;
    private BufferedImage shopbackground;
    private boolean shop1 = false;
    private Color c = Color.white;
    
    public Shop(Main main, Bank bank, BufferedImage background) {
        this.main = main;
        this.bank = bank;
        this.shopbackground = background;
    }

    public void mousePressed(MouseEvent e) {
        int mx = e.getX();
        int my = e.getY();

        if (main.mouseOver(mx, my, 15, 15, 100, 50)) {
            main.screen = SCREEN.Game;
        }
        
        if(!shop1 && main.mouseOver(mx,my,200, 100, 120, 50)) {
        	bank.toBank(-100);
        	shop1 = true;
        	c = Color.gray;
        }

    }

    

    public void mouseReleased(MouseEvent e) {

    }

    public void tick() {

    }

    public void render(Graphics g) {
        Font fnt = new Font("Arial", 1, 30);
        Font fnt2 = new Font("Arial", 1, 20);
        g.drawImage(shopbackground, 0, 0, null);
        
        g.setFont(fnt);
        g.setColor(Color.black);
        g.drawString("Bank: " + Integer.toString(bank.getBank()), 200, 30);
        g.drawRect(15, 15, 100, 50);
        
        g.drawString("Return", 17, 50);
        
        g.setFont(fnt2);
        g.setColor(c);
        g.fillRect(200, 100, 120, 50);
        g.setColor(Color.black);
        g.drawRect(200, 100, 120, 50);
        g.drawString("Boost: 100�", 202, 133);
    }

}
