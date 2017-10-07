/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Main;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author osku0
 */
public class Upgrade extends MouseAdapter{

    private Main main;
    
    public Upgrade(Main main) {
        this.main = main;
    }
    
    public void mousePressed(MouseEvent e){
        
    }
    
    public void mouseReleased(MouseEvent e){
        
    }
    
    public void tick(){
        
    }
    
    public void render(Graphics g){
        g.setColor(Color.blue);
        g.drawRect(100, 100, 100, 100);
    }
}
