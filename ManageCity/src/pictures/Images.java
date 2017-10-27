/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pictures;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author s1601396
 */
public class Images {

    private static final String MAINMENU = "MainMenu.png";
    private static final String MAINMENUBACKGROUND = "MainMenuBackGround.png";
    private static final String GAMEOVERFLOW = "GameOverFlow.png";

    private static BufferedImage mainmenu;
    private static BufferedImage mainmenubackground;
    private static BufferedImage gameoverflow;

    public void loadImage() {
        try {
            mainmenu = ImageIO.read(getClass().getResource(MAINMENU));
            mainmenubackground = ImageIO.read(getClass().getResource(MAINMENUBACKGROUND));
            gameoverflow = ImageIO.read(getClass().getResource(GAMEOVERFLOW));
            
        } catch (IOException ex) {
            System.out.println("FAIL");
        }
    }

    public static BufferedImage getMainMenu() {
        return mainmenu;
    }

    public static BufferedImage getMainMenuBackGround() {
        return mainmenubackground;
    }
    public static BufferedImage getGameOverFlow() {
        return gameoverflow;
    }
}
