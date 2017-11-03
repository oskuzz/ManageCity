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
 * @author osku0
 */
public class Bank {
    
    private int kassa;
    private Main main;
    
    public Bank(int alkukassa, Main main){
        this.kassa = alkukassa;
        this.main = main;
    }
    
    public void tick(){
        
    }
    
    public void toBank(int maara){
        kassa += maara;
    }
    
    public int getBank(){
        return kassa;
    }
    
    public void render(Graphics g){
        
    }
    
}
