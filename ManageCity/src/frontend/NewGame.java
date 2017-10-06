/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Main;
import java.awt.Color;
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
        g.setColor(Color.black);
        g.fillRect(100, 100, 100, 100);
    }
}
