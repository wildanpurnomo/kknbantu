package com.kkndesasendang.sendangsmartlearning.wsutil;

import com.github.nkzawa.socketio.client.IO;
import com.github.nkzawa.socketio.client.Socket;

import java.net.URISyntaxException;

public class WSInstance {
    private static WSInstance webSocketInstance = null;

    public Socket mSocket;

    private WSInstance() {
        try {
            mSocket = IO.socket("http://192.168.100.72:4000");
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public static WSInstance getInstance() {
        if (webSocketInstance == null) {
            webSocketInstance = new WSInstance();
        }

        return webSocketInstance;
    }

    public void sendEvent() {

    }
}
