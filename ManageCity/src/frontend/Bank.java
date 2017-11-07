/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Main;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author osku0
 */
public class Bank extends MouseAdapter {

    private int kassa;
    private Main main;
    private int loan;

    public Bank(int alkukassa, Main main) {
        this.kassa = alkukassa;
        this.main = main;
    }

    public void MousePressed(MouseEvent e) {

    }

    public void MouseReleased(MouseEvent e) {

    }

    public void toBank(int maara) {
        kassa += maara;
    }

    public int getBank() {
        return kassa;
    }

    public void tick() {

    }

    public void render(Graphics g) {
        Font fnt2 = new Font("Arial", 1, 25);
        Font fnt = new Font("Arial", 1, 20);

        g.setColor(Color.black);
        g.setFont(fnt);

        g.drawString("Current Balance:" + Integer.toString(kassa), 100, 50);
        g.setFont(fnt2);
        g.drawString("Loans", 100, 100);

        g.setColor(Color.green);
        g.fillRect(100, 110, 100, 50);
        g.setColor(Color.black);
        g.drawRect(99, 109, 101, 51);
        g.drawString("100€", 123, 143);
    }

}
