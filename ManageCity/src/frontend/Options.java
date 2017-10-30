/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author osku0
 */
public class Options {

    public Options(){
        
    }
    
    public void tick() {

    }

    public void render(Graphics g) {
        Font fnt = new Font("Arial", 1, 40);
        g.setFont(fnt);
        g.setColor(Color.white);
        g.drawString("Options", 400, 400);
    }
}
