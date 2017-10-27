/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Main;
import java.awt.Graphics;

/**
 *
 * @author s1601396
 */
public class Game{
    
    private Main main;
    private Upgrade upgrade;
    private Bank bank;
    private Shop shop;
    private Marketing marketing;
    
    public Game(Main main, Upgrade upgrade, Bank bank, Shop shop, Marketing marketing){
        this.main = main;
        this.upgrade = upgrade;
        this.bank = bank;
        this.shop = shop;
        this.marketing = marketing;
        
    }
    
    public void tick(){
        
    }
    
    public void render(Graphics g){
        
    }
    
}
