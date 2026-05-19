package com.pluralsight;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        MonsterDefeat monsterDefeat = new MonsterDefeat("Goblin Captain", 3, true);
        TreasureFound treasureFound = new TreasureFound("sapphire", "common");

        System.out.println(monsterDefeat.getSummary());
        System.out.println(treasureFound.getSummary());
    }
}