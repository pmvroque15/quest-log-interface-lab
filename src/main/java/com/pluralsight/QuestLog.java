package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuestLog {
    private List<ScoreEvent> events;

    public QuestLog() {
       events = new ArrayList<>();
    }

    public void addEvent(ScoreEvent event) {
        events.add(event);
    }

    public int getTotalScore() {
        int totalScore = 0;
        for(ScoreEvent score: events) {
            totalScore += score.getPoints();
        }
        return totalScore;
    }

    public ScoreEvent getHighestScoringEvent() {
        int highestPoint = 0;
        ScoreEvent scoreEvent = null;
        for(ScoreEvent score : events) {
           if (score.getPoints() > highestPoint) {
               highestPoint = score.getPoints();
               scoreEvent = score;
           }
        }
        return scoreEvent;

    }

    public ScoreEvent getLowestScoringEvent(){
        int lowestPoint = events.get(0).getPoints();
        ScoreEvent scoreEvent = null;

        for (ScoreEvent score : events) {
            if (score.getPoints() < lowestPoint) {
                lowestPoint = score.getPoints();
                scoreEvent = score;
            }
        }
        return scoreEvent;
    }

    public void printSummary() {

    }
}
