/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import frontend.*;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

/**
 *
 * @author s1601396
 */
public class Main extends Canvas implements Runnable {

    public static final int WIDTH = 960, HEIGHT = 640;
    private Thread thread;
    private boolean running = false;

    private MainMenu mainmenu;
    private NewGame newGame;
    private Upgrade upgrade;

    public enum SCREEN {
        MainMenu,
        Shop,
        Upgrade,
        Marketing,
        Game,
        Options,
        Menu,
        Bank,
        NewGame
    };

    public static SCREEN screen = SCREEN.Upgrade;

    public Main() {

        mainmenu = new MainMenu(this);
        newGame = new NewGame(this);
        upgrade = new Upgrade(this);

        this.addMouseListener(mainmenu);

        new Window(WIDTH, HEIGHT, "Game", this);
    }

    public void run() {
        this.requestFocus();
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int frames = 0;
        while (running) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while (delta >= 1) {
                tick();
                delta--;
            }
            if (running) {
                render();
            }
            frames++;

            if (System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                //System.out.println("FPS: " + frames);
                frames = 0;
            }
        }
        stop();
    }

    public synchronized void start() {
        thread = new Thread(this);
        thread.start();
        running = true;
    }

    public synchronized void stop() {
        try {
            thread.join();
            running = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void tick() {

    }

    public void render() {
        BufferStrategy bs = this.getBufferStrategy();
        if (bs == null) {
            this.createBufferStrategy(3);
            return;
        }

        Graphics g = bs.getDrawGraphics();

        g.setColor(Color.white);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        if (screen == SCREEN.MainMenu) {
            mainmenu.render(g);
        } else if (screen == SCREEN.NewGame) {
            newGame.render(g);
        } else if (screen == SCREEN.Upgrade) {
            upgrade.render(g);
        }

        g.dispose();
        bs.show();
    }

    public static void main(String[] args) {
        new Main();
    }
}
