package com.pluralsight;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        ScoreEvent event1 = new MonsterDefeat("Goblin Captain", 3, true);
        ScoreEvent event2 = new TreasureFound("sapphire", "common");

        System.out.println(event1.getSummary());
        System.out.println(event2.getSummary());
    }
}