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
public class MainMenu extends MouseAdapter {

    private Main main;
    private static BufferedImage MAINMENUIMAGE;
    private static BufferedImage MAINMENUBACKGROUND;

    ;

    public MainMenu(Main main, BufferedImage MAINMENUIMAGE, BufferedImage MAINMENUBACKGROUND) {
        this.main = main;
        this.MAINMENUIMAGE = MAINMENUIMAGE;
        this.MAINMENUBACKGROUND = MAINMENUBACKGROUND;
    }

    public void mousePressed(MouseEvent e) {
        int mx = e.getX();
        int my = e.getY();

        if (main.screen == SCREEN.MainMenu) {
            if (mouseOver(mx, my, 380, 230, 200, 60)) {
                main.screen = SCREEN.NewGame;
            }

            if (mouseOver(mx, my, 380, 330, 200, 60)) {
                main.screen = SCREEN.Continue;
            }

            if (mouseOver(mx, my, 380, 430, 200, 60)) {
                main.screen = SCREEN.Options;
            }

            if (mouseOver(mx, my, 380, 530, 200, 60)) {
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
        g.drawImage(MAINMENUBACKGROUND, 0, 0, null);
        g.drawImage(MAINMENUIMAGE, 0, -29, null);
        g.setColor(Color.red);

        Font fnt = new Font("Arial", 1, 35);
        g.setFont(fnt);
        g.setColor(Color.black);
        g.drawString("New Game", 390, 273);
        g.drawString("Continue", 408, 373);
        g.drawString("Options", 420, 473);
        g.drawString("Exit", 450, 573);

    }
}
