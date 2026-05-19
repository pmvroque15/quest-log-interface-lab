package com.pluralsight;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        QuestLog quest = new QuestLog();

//        ScoreEvent event1 = new MonsterDefeat("Goblin Captain", 3, true);
//        ScoreEvent event2 = new TreasureFound("Sapphire", "common");
//
//        ScoreEvent event3 = new MonsterDefeat("Skeleton Warrior", 2, false);
//        ScoreEvent event4 = new TreasureFound("Ancient Crown", "legendary");
//
//        ScoreEvent event5 = new TrapTriggered("Spike Trap", 3);
//        ScoreEvent event6 = new RoomExplored("Ancient Library", true);
//

//        quest.addEvent(event2);
//        quest.addEvent(event3);
//        quest.addEvent(event4);
//        quest.addEvent(event5);
//        quest.addEvent(event6);

//        quest.printSummary();
        Scanner scanner = new Scanner(System.in);
        String prompt = """
                           \s
                            Menu
                ------------------------------
                    1) Add monster defeat
                    2) Add treasure found
                    3) Add trap triggered
                    4) Add room explored
                    5) View quest log
                    0) Quit
                -----------------------------
               \s""";


        boolean running = true;
        do {
            System.out.println(prompt);
            System.out.println("Please pick an option: ");
            int number = Integer.parseInt(scanner.nextLine());

            switch(number) {
                case 1:
                    System.out.println("What is the monster name: ");
                    String monsterName = scanner.nextLine();

                    System.out.println("Difficulty level: ");
                    int difficultyLevel = Integer.parseInt(scanner.nextLine());

                    System.out.println("Is the monster a boss? (true/false)");
                    boolean boss = scanner.hasNextBoolean();

                    ScoreEvent monsterDefeatEvent = new MonsterDefeat(monsterName, difficultyLevel, boss);

                    quest.addEvent(monsterDefeatEvent);
                    break;
                case 2:
                    System.out.println("What is the name of the treasure: ");
                    String treasureName = scanner.nextLine();

                    System.out.println("Rarity level: commmon/rare/legendary");
                    String rarityLevel = scanner.nextLine();

                    ScoreEvent treasureFound = new TreasureFound(treasureName, rarityLevel);

                    quest.addEvent(treasureFound);
                    break;
                case 3:
                    System.out.println("What is the name of the trap: ");
                    String trapName = scanner.nextLine();

                    System.out.println("How much is the damage: ");
                    int damage = Integer.parseInt(scanner.nextLine());

                    ScoreEvent trapTriggered = new TrapTriggered(trapName, damage);

                    quest.addEvent(trapTriggered);
                    break;
                case 4:
                    System.out.println("What is the room name explored: ");
                    String roomName = scanner.nextLine();

                    System.out.println("Is there a secret found in the room? ");
                    boolean isSecretFound = scanner.hasNextBoolean();

                    ScoreEvent roomExplored = new RoomExplored(roomName, isSecretFound);

                    quest.addEvent(roomExplored);
                    break;
                case 5:
                    quest.printSummary();
                    break;
                case 0:
                    System.out.println("Thank you for using my app!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid input. Try again.");
            }

        } while (running);
    }
}