package com.kkndesasendang.sendangsmartlearning.wsutil;

import com.github.nkzawa.socketio.client.IO;
import com.github.nkzawa.socketio.client.Socket;

import java.net.URISyntaxException;

public class WSInstance {
    private static WSInstance webSocketInstance = null;

    public Socket mSocket;

    private WSInstance() {
        try {
            mSocket = IO.socket("https://sicenikapi-dot-sendang-digital-map.et.r.appspot.com/");
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
}
