/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.ArrayList;

/**
 *
 * @author osku0
 */
public class Screen {

    private ArrayList<Boolean> screen;

    public Screen() {
        screen = new ArrayList<>();
        arrayList();
        System.out.println(screen);
    }

    public void arrayList() {
        for (int i = 1; i < 8; i++) {
            screen.add(false);
        }
    }

    public static void main(String[] args) {
        new Screen();
    }
}
