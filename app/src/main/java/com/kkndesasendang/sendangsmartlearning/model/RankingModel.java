package com.kkndesasendang.sendangsmartlearning.model;

public class RankingModel implements Comparable {
    private String participantName;
    private int participantScore;

    public RankingModel(String participantName, int participantScore) {
        this.participantName = participantName;
        this.participantScore = participantScore;
    }

    public String getParticipantName() {
        return participantName;
    }

    public int getParticipantScore() {
        return participantScore;
    }

    @Override
    public int compareTo(Object o) {
        int compareScore = ((RankingModel)o).getParticipantScore();
        return compareScore - this.participantScore;
    }
}
