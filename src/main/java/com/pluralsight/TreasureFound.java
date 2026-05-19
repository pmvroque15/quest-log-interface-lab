package com.pluralsight;

import javax.swing.*;

public class TreasureFound {
    private String treasureName;
    private String rarity;

    public TreasureFound(String treasureName, String rarity) {
        this.treasureName = treasureName;
        this.rarity = rarity;
    }


    public String getRarity() {
        return rarity;
    }

    public String getName() {
        return this.treasureName;
    }

    public int getPoints() {
        int points = 0;

        if (getRarity().equalsIgnoreCase("common")) {
            points += 25;
        } else if (getRarity().equalsIgnoreCase("rare")) {
            points += 75;
        } else if (getRarity().equalsIgnoreCase("legendary")) {
            points += 150;
        } else {
            points = 0;
        }

        return points;
    }

    public String getSummary() {
        return String.format("Found %s for %d points", getName(), getPoints());
    }
}
