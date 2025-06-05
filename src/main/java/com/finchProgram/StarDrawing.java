package com.finchProgram;

import com.birdbrain.Finch;

/**
 * The StarDrawing program uses the Finch robot to draw a pattern resembling
 * resembling a 5-pointed star. The program is able to do this by using 
 * both turning and forward movement commands. Each turn is marked by a
 * specific angle, stored in an array.
 * 
 * This program also allows the LED on the beak of the robot to light up.
 * It does this at every point on the star.
 */
public class StarDrawing {
    
    /**
     * This is the main method that executes the star drawing program sequence
     * utilizing the Finch robot.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        // Creates the new Finch robot object
        Finch bird = new Finch();

        // Array that stores the turning angles used during the program
        double[] arr = {22.5, 140, 150, 145, 150};

        // Loop through each angle to draw the star pattern and light up the beak at the points
        for (double angle: arr) {
        bird.setTurn("R", angle, 50);
        bird.setMove("F", 10, 50);
        bird.setBeak(50, 100, 80);
        bird.pause(1);
        bird.setBeak(0, 0, 0);
        

        }
        

        
        // Disconnects the Finch when star drawing sequence finishes
        bird.disconnect();
    }
}