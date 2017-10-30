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
 * @author s1601396
 */
public class NewGame extends MouseAdapter {

    private Main main;
    private boolean open = false;

    public NewGame(Main main) {
        this.main = main;
    }
    
    public void open(boolean open){
        this.open = open;
    }

    public void mousePressed(MouseEvent e) {
        int mx = e.getX();
        int my = e.getY();

        if (open && mouseOver(mx, my, 380, 430, 200, 60)) {
            main.screen = SCREEN.Game;
        }
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

    public void mouseReleased(MouseEvent e) {

    }

    public void tick() {

    }

    public void render(Graphics g) {
        g.setColor(Color.white);
        g.drawRect(380, 430, 200, 60);

        Font fnt = new Font("Arial", 1, 35);
        g.setFont(fnt);
        g.setColor(Color.black);

        g.drawString("Play", 420, 473);
    }
}
