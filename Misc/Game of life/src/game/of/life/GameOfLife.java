/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.of.life;

/**
 *
 * @author Jack
 */
public class GameOfLife {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GOL life = new GOL();
        life.setLocationRelativeTo(null);
        life.show();
    }
    
}