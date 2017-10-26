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
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

/**
 *
 * @author s1601396
 */
public class MainMenu extends MouseAdapter {

    private Main main;

    public MainMenu(Main main) {
        this.main = main;
    }

    public void mousePressed(MouseEvent e) {
        int mx = e.getX();
        int my = e.getY();

        if (main.screen == SCREEN.MainMenu) {
            if (mouseOver(mx, my, 380, 160, 200, 60)) {
                main.screen = SCREEN.NewGame;
            }

            if (mouseOver(mx, my, 380, 260, 200, 60)) {
                System.out.println("Continue");
            }

            if (mouseOver(mx, my, 380, 360, 200, 60)) {
                System.out.println("Options");
            }

            if (mouseOver(mx, my, 380, 460, 200, 60)) {
                System.exit(0);
            }
        }
    }

    public void mouseReleased(MouseEvent e) {

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

    public void tick() {

    }

    public void render(Graphics g) {
        Font fnt = new Font("arial", 1, 30);

        g.setColor(Color.black);
        g.setFont(fnt);
        g.drawString("Play", 450, 200);
        g.drawRect(380, 160, 200, 60);
        g.drawString("Continue", 420, 300);
        g.drawRect(380, 260, 200, 60);
        g.drawString("Options", 430, 400);
        g.drawRect(380, 360, 200, 60);
        g.drawString("Exit", 450, 500);
        g.drawRect(380, 460, 200, 60);
    }
}
