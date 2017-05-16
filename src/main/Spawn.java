/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Random;
import static main.Game.HEIGHT;
import static main.Game.WIDTH;

/**
 *
 * @author 1614290093
 */
public class Spawn {
    private Handler handler;
    private HUD hud;
    private Random r = new Random();
    private int scoreKeep = 0;
            
    public Spawn(Handler handler, HUD hud){
        this.handler = handler;
        this.hud = hud;
    }
    
    public void tick(){
        scoreKeep++;
        
        if(scoreKeep >=500){
            scoreKeep = 0;
            hud.setLevel(hud.getLevel()+1);
            if(hud.getLevel() == 2){
                handler.addObject(new BasicEnemy(r.nextInt(WIDTH),r.nextInt(HEIGHT), ID.BasicEnemy, handler));
            }
        }
    }
    
}
