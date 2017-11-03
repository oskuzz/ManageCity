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
public class Game extends MouseAdapter {

    private Main main;
    private Upgrade upgrade;
    private Bank bank;
    private Shop shop;
    private Marketing marketing;
    private BufferedImage overflow;

    public Game(Main main, Upgrade upgrade, Bank bank, Shop shop, Marketing marketing, BufferedImage overflow) {
        this.main = main;
        this.upgrade = upgrade;
        this.bank = bank;
        this.shop = shop;
        this.marketing = marketing;
        this.overflow = overflow;
    }

    public void mousePressed(MouseEvent e) {
        int mx = e.getX();
        int my = e.getY();

        if (mouseOver(mx, my, 720, 548, 100, 50)) {
            main.screen = SCREEN.Bank;

        }

        if (mouseOver(mx, my, 830, 548, 100, 50)) {
            main.screen = SCREEN.Shop;
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
        g.drawImage(overflow, 0, -10, null);
        g.setColor(Color.black);
        g.drawRect(830, 548, 100, 50);

        Font fnt = new Font("Arial", 1, 30);

        g.setFont(fnt);
        g.drawString("Shop", 845, 580);

        Font fnt2 = new Font("Arial", 1, 20);

        g.drawRect(720, 548, 100, 50);
        g.drawString("Bank", 735, 580);
        g.setFont(fnt2);
        g.drawString("Bank: " + Integer.toString(bank.getBank()), 20, 30);

    }

}
