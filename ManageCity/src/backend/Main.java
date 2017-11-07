/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import pictures.Images;
import frontend.*;
import java.awt.Canvas;
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
    private Bank bank;
    private Shop shop;
    private Marketing marketing;
    private Game game;
    private Options options;

    public enum SCREEN {
        MainMenu,
        Shop,
        Upgrade,
        Marketing,
        Game,
        Options,
        Menu,
        Bank,
        NewGame,
        Continue
    };

    public static SCREEN screen = SCREEN.MainMenu;

    public Main() {

        Images images = new Images();

        images.loadImage();
        newGame = new NewGame(this);
        mainmenu = new MainMenu(this, Images.getMainMenu(), Images.getMainMenuBackGround(), newGame);
        upgrade = new Upgrade(this);
        bank = new Bank(100, this);
        marketing = new Marketing();
        shop = new Shop(this, bank, Images.getShopBackGround());
        game = new Game(this, upgrade, bank, shop, marketing, Images.getGameOverFlow());
        options = new Options();

        this.addMouseListener(mainmenu);
        this.addMouseListener(game);
        this.addMouseListener(upgrade);
        this.addMouseListener(newGame);
        this.addMouseListener(shop);
        this.addKeyListener(new KeyInput());

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
                System.out.println("FPS: " + frames);
                frames = 0;
            }
        }
        stop();
    }

    public boolean mouseOver(int mx, int my, int x, int y, int width, int height) {
        if (mx > x && mx < x + width) {
            if (my > y && my < y + height) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
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
        if (screen == SCREEN.Upgrade) {
            upgrade.tick();
        }
    }

    public void render() {

        BufferStrategy bs = this.getBufferStrategy();
        if (bs == null) {
            this.createBufferStrategy(3);
            return;
        }

        Graphics g = bs.getDrawGraphics();

        g.fillRect(0, 0, WIDTH, HEIGHT);
        if (null != screen) {
            switch (screen) {
                case MainMenu:
                    mainmenu.render(g);
                    break;
                case NewGame:
                    newGame.render(g);
                    break;
                case Upgrade:
                    upgrade.render(g);
                    break;
                case Bank:
                    bank.render(g);
                    break;
                case Game:
                    game.render(g);
                    break;
                case Options:
                    options.render(g);
                    break;
                case Shop:
                    shop.render(g);
                default:
                    break;
            }
        }

        g.dispose();
        bs.show();
    }

    public static float clamp(float var, float min, float max) {
        if (var >= max) {
            return var = max;
        } else if (var <= min) {
            return var = min;
        } else {
            return var;
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
