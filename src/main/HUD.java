/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author 1614290093
 */
public class HUD {
    
    public static int HEALTH = 100;
    
    private int score=0;
    private int level =1;
    
    public void tick(){
      
        HEALTH = Game.clamp(HEALTH, 0, 100);
        
        score++;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    public void render(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(15, 15, 200, 32);
        
        g.setColor(Color.green);
        g.fillRect(15, 15, HEALTH *2, 32);
        
        g.setColor(Color.white);
        g.drawRect(15, 15, 200, 32);
        
        g.drawString("Score: "+ score, 15, 70);
        g.drawString("Level: "+ level, 15, 85);
        
    }
}
