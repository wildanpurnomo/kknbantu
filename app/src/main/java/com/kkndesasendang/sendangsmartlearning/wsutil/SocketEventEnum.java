package com.kkndesasendang.sendangsmartlearning.wsutil;

public enum SocketEventEnum {
    WS_SERVER_CONNECTED("connected"),
    REQUEST_MATCH("requestMatch"),
    MATCH_UPDATED("matchUpdated"),
    MATCH_READY("matchReady");

    public final String label;

    SocketEventEnum(String label) {
        this.label = label;
    }
}
