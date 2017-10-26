/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author s1601396
 */
public class Images {

    private static BufferedImage image;
    private static final String IMAGEDIR = "images/";
    private static final String MAINMENU = "MainMenu.png";

    private static BufferedImage mainmenu;

    public BufferedImage loadImage() {
        try {
            mainmenu = ImageIO.read(getClass().getResource(IMAGEDIR + MAINMENU));
        } catch (IOException ex) {
        }
        return image;
    }

    public static BufferedImage getMainMenu() {
        return mainmenu;
    }
}
