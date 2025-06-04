package com.finchProgram;

import com.birdbrain.Finch;

public class StarDrawing {
    
    public static final int MOVE_DURATION = 800;
    public static final int TURN_DURATION = 440;
    public static final int MOTOR_SPEED = 50;

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