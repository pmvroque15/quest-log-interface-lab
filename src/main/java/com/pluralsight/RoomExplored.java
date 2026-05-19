package com.pluralsight;

public class RoomExplored implements ScoreEvent {
    private String roomName;
    private boolean secretFound;

    public RoomExplored(String roomName, boolean secretFound) {
        this.roomName = roomName;
        this.secretFound = secretFound;
    }

    @Override
    public String getName() {
        return this.roomName;
    }

    @Override
    public int getPoints() {
        int basePoints = 20;

        if (secretFound) {
            basePoints += 40;
        }

        return basePoints;
    }

    @Override
    public String getSummary() {
        return String.format("Explored %s for %s points", getName(), getPoints());
    }
}
