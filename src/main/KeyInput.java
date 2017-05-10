/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author 1614290093
 */
public class KeyInput extends KeyAdapter{
    
    private Handler handler;
    
    public KeyInput(Handler handler){
        this.handler = handler;
    }
    
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        
        for(int i =0; i<handler.object.size();i++){
            GameObject tempObject = handler.object.get(i);
            
            if(tempObject.getId() == ID.Player){
                if(key == KeyEvent.VK_W)tempObject.setVelY(5);
                if(key == KeyEvent.VK_A)tempObject.setVelY(-5);
                if(key == KeyEvent.VK_D)tempObject.setVelX(5);
                if(key == KeyEvent.VK_S)tempObject.setVelX(-5);
            }
        }
    }
    
    public void keyRealeased(KeyEvent e){
            int key = e.getKeyCode();
        
        for(int i =0; i<handler.object.size();i++){
            GameObject tempObject = handler.object.get(i);
            
            if(tempObject.getId() == ID.Player){
                if(key == KeyEvent.VK_W)tempObject.setVelY(0);
                if(key == KeyEvent.VK_A)tempObject.setVelY(0);
                if(key == KeyEvent.VK_D)tempObject.setVelX(0);
                if(key == KeyEvent.VK_S)tempObject.setVelX(0);
            }
        }
    }
}
