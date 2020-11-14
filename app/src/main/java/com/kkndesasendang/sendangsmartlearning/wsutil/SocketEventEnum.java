package com.kkndesasendang.sendangsmartlearning.wsutil;

public enum SocketEventEnum {
    WS_SERVER_CONNECTED("connected"),
    JOINED_MATCH("hasJoined"),
    REQUEST_MATCH("requestMatch"),
    MATCH_UPDATED("matchUpdated"),
    MATCH_READY("matchReady"),
    SUBMIT_ANSWER("submitAnswer"),
    ONE_QUESTION_FINISHED("oneQuestionFinished");

    public final String label;

    SocketEventEnum(String label) {
        this.label = label;
    }
}
