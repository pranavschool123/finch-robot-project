package com.finchProgram;

import com.birdbrain.Finch;

public class StarDrawing {
    public static void main(String[] args) {

        Finch bird = new Finch();
        
        for (int i=0; i < 5; i++) {
            drawLine(bird);
            turnStarAngle(bird);
        }
        

        // bird.stop();
        bird.disconnect();
    }
}