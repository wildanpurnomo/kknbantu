package com.kkndesasendang.sendangsmartlearning.ui.match;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.github.nkzawa.emitter.Emitter;
import com.kkndesasendang.sendangsmartlearning.wsutil.SocketEventEnum;
import com.kkndesasendang.sendangsmartlearning.wsutil.WSInstance;

import org.json.JSONObject;

import static com.kkndesasendang.sendangsmartlearning.helper.Helper.logMessage;

public class MatchViewModel extends ViewModel {
    public WSInstance mWSInstance = WSInstance.getInstance();

    public MutableLiveData<JSONObject> mMatchUpdatedEventData = new MutableLiveData<>();
    public MutableLiveData<JSONObject> mMatchReadyEventData = new MutableLiveData<>();
    public MutableLiveData<JSONObject> mConnectionEvent = new MutableLiveData<>();

    private Emitter.Listener createListener(final MutableLiveData<JSONObject> prop) {
        return new Emitter.Listener() {
            @Override
            public void call(Object... args) {
                JSONObject data = (JSONObject) args[0];
                prop.postValue(data);
            }
        };
    }

    public void initViewModel() {
        mWSInstance.mSocket.on(SocketEventEnum.MATCH_UPDATED.label, createListener(mMatchUpdatedEventData));
        mWSInstance.mSocket.on(SocketEventEnum.MATCH_READY.label, createListener(mMatchReadyEventData));
        mWSInstance.mSocket.on(SocketEventEnum.WS_SERVER_CONNECTED.label, createListener(mConnectionEvent));
    }

    public LiveData<JSONObject> getMatchUpdatedEventData() {
        return mMatchUpdatedEventData;
    }

    public LiveData<JSONObject> getMatchReadyEventData() {
        return mMatchReadyEventData;
    }

    public LiveData<JSONObject> getConnectionEventData() {
        return mConnectionEvent;
    }

    public void connectSocket() {
        mWSInstance.mSocket.connect();
    }

    public void sendEvent(String eventName, JSONObject payload) {

        mWSInstance.mSocket.emit(eventName, payload);
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        mWSInstance.mSocket.close();
        logMessage("Socket closed", this.getClass().getName());
    }
}
