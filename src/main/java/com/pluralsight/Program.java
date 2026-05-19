package com.pluralsight;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        QuestLog quest = new QuestLog();
        ScoreEvent event1 = new MonsterDefeat("Goblin Captain", 3, true);
        ScoreEvent event2 = new TreasureFound("sapphire", "common");

        quest.addEvent(event1);
        quest.addEvent(event2);

        quest.printSummary();

    }
}