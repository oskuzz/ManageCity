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

/**
 *
 * @author s1601396
 */
public class NewGame {

    private Main main;

    public NewGame(Main main) {
        this.main = main;
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
