/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Images;
import backend.Main;
import backend.Main.SCREEN;
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
    private static final BufferedImage IMAGE = Images.getMainMenu();

    ;

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
                main.screen = SCREEN.Continue;
            }

            if (mouseOver(mx, my, 380, 360, 200, 60)) {
                main.screen = SCREEN.Options;
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
        g.drawImage(IMAGE, 0, 0, null);
    }
}
