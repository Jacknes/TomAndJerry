package com.Jacknes;

import java.util.*;

public class GameController {
    private static World world;
    
    public static void main(String[] args) {
        // write your code here
        initialiseGame();
    }

    public static void initialiseGame() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Size of Grid: ");
        int sizeOfGrid = scanner.nextInt();
        System.out.print("Difficulty(1-10): ");
        int difficulty = scanner.nextInt();

        world = new World(sizeOfGrid, difficulty);
        world.play();
    }
    
    
}
