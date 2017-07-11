package com.Jacknes;

import java.util.*;

/**
 * Created by jacknes on 11/7/17.
 */
public class World {
    private int size;
    private int difficulty;
    private int[][] map;
    Scanner scanner = new Scanner(System.in);
    Player player;

    public World(int size, int difficulty)
    {
        this.size = size;
        this.difficulty = difficulty;
        generateMap();
        //TODO: Generate Two-dim array
        //TODO: Populate array;
    }

    private void generateMap()
    {
        // 0 is empty space.
        // -1 is the player.
        // 1 is a wall.
        // 2 is cheese.
        // 3 is a cat napper.
        // 4 is Jerry.
        map =  new int[size][size];
        //TODO: Populate the map randomly depending on difficulty.
    }


    public void play()
    {
        //TODO: Implement play function to allow a player to move around.
        String option;
        while (!(option = readOption()).equals("x"))
        {
            switch(option) {
                case "U": move("U"); break;
                case "D": move("D"); break;
                case "L": move("L"); break;
                case "R": move("R"); break;
                case "I": openInventory(player); break;
                default: help();  break;
            }
        }
    }

    private void help()
    {
        System.out.println("U/D/L/R are directions, moving up, down, left and right respectively.");
        System.out.println("I accesses your inventory.");
        System.out.println("X closes the game.");
    }


    private String readOption()
    {
        System.out.print("Option (U/D/L/R/I/X): ");
        return scanner.nextLine();
    }



    private void move(String direction)
    {

    }

    private void openInventory(Player player)
    {

    }
}
