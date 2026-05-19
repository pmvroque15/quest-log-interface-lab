package com.pluralsight;

public class TrapTriggered implements ScoreEvent{
    private String trapName;
    private int damage;

    public TrapTriggered(String trapName, int damage) {
        this.trapName = trapName;
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public String getName(){
        return this.trapName;
    };

    public int getPoints(){
        return this.damage * (-10);
    };

    public String getSummary(){
        return String.format("Triggered %s Trap for %d points", getName(), getDamage());
    };
}
