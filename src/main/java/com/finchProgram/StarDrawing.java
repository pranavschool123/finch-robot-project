package com.finchProgram;

import com.birdbrain.Finch;

public class StarDrawing {
    public static void main(String[] args) {

        Finch bird = new Finch();

        double[] arr = {22.5, 140, 150, 145, 150};

        for (double angle: arr) {
        bird.setTurn("R", angle, 50);
        bird.setMove("F", 10, 50);
        bird.setBeak(50, 100, 80);
        bird.pause(1);
        bird.setBeak(0, 0, 0);
        

        }

        // bird.setTurn("R", 22.5, 50);
        // bird.setMove("F", 10, 50);
        // bird.setTurn("R", 140, 50);
        // bird.setMove("F", 10, 50);
        // bird.setTurn("R", 150, 50);
        // bird.setMove("F", 10, 50);
        // bird.setTurn("R", 145, 50);
        // bird.setMove("F", 10, 50);
        // bird.setTurn("R", 150, 50);
        // bird.setMove("F", 11, 50);
        

        
        bird.disconnect();
    }
}