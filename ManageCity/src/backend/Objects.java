/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.awt.Graphics;

/**
 *
 * @author s1601396
 */
public abstract class Objects {

    public Objects() {

    }

    public abstract void tick();

    public abstract void render(Graphics g);

}
