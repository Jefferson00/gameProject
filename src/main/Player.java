/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;
import static main.HUD.HEALTH;

/**
 *
 * @author 1614290093
 */
public class Player extends GameObject{
    
    Random r =  new Random();
    Handler handler;
    
    public Player(int x, int y, ID id, Handler handler) {
        super(x, y, id);
        this.handler = handler;
        //velX = r.nextInt(5)+1;
       // velY = r.nextInt(5);
    }

    public Rectangle getBounds(){
        return new Rectangle(x,y,32,32);
    }
    
    public void tick() {
        x += velX;
        y += velY;
        
       x = Game.clamp(x, 0 ,Game.WIDTH -37);
       y = Game.clamp(y, 0 ,Game.HEIGHT -60);
       
      collision();
    }
    
     public void collision(){
         for(int i=0; i< handler.object.size();i++){
             GameObject tempObject = handler.object.get(i);
                if(tempObject.getId() == ID.BasicEnemy){
                    if(getBounds().intersects(tempObject.getBounds())){
                        //codigo da colisão
                        
                          HEALTH -= 2;
                    }
                }
     }
    }
    
    public void render(Graphics g) {
        
        
        g.setColor(Color.yellow);
        g.fillRect(x, y, 33, 33);
    }
    
}
