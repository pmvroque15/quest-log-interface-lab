package com.pluralsight;

public class MonsterDefeat {
    private String monsterName;
    private int difficultLevel;
    private boolean boss;

    public MonsterDefeat(String monsterName, int difficultLevel, boolean boss) {
        this.monsterName = monsterName;
        this.difficultLevel = difficultLevel;
        this.boss = boss;
    }

    public String getName() {
        return this.monsterName;
    }

    public int getPoints() {
        int points = this.difficultLevel * 50;

        if (this.boss) {
            points += 100;
        }

        return points;
    }

    public String getSummary() {
        return String.format("Defeated %s for %d points", getName(), getPoints());
    }
}
