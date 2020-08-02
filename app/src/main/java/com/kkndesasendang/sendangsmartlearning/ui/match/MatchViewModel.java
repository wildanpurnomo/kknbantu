package com.kkndesasendang.sendangsmartlearning.ui.match;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.github.nkzawa.emitter.Emitter;
import com.kkndesasendang.sendangsmartlearning.helper.SingleLiveEvent;
import com.kkndesasendang.sendangsmartlearning.model.RankingModel;
import com.kkndesasendang.sendangsmartlearning.wsutil.SocketEventEnum;
import com.kkndesasendang.sendangsmartlearning.wsutil.WSInstance;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class MatchViewModel extends ViewModel {
    public WSInstance mWSInstance = WSInstance.getInstance();

    public SingleLiveEvent<JSONObject> mHasJoinedMatchEventData = new SingleLiveEvent<>();
    public SingleLiveEvent<JSONObject> mMatchUpdatedEventData = new SingleLiveEvent<>();
    public SingleLiveEvent<JSONObject> mMatchReadyEventData = new SingleLiveEvent<>();
    public SingleLiveEvent<JSONObject> mConnectionEvent = new SingleLiveEvent<>();
    public SingleLiveEvent<JSONObject> mOneQuestionFinished = new SingleLiveEvent<>();
    public MutableLiveData<ArrayList<String>> mParticipants = new MutableLiveData<>();
    public MutableLiveData<String> mMatchId = new MutableLiveData<>();
    public MutableLiveData<Integer> mParticipantIndex = new MutableLiveData<>();
    public MutableLiveData<JSONArray> mQuizzes = new MutableLiveData<>();
    public MutableLiveData<String> mAnswer = new MutableLiveData<>();
    public MutableLiveData<ArrayList<RankingModel>> mCurrentRanking= new MutableLiveData<>();

    private Emitter.Listener createListener(final MutableLiveData<JSONObject> prop) {
        return new Emitter.Listener() {
            @Override
            public void call(Object... args) {
                JSONObject data = (JSONObject) args[0];
                prop.postValue(data);
            }
        };
    }

    public LiveData<JSONObject> getHasJoinedEventData() {
        return mHasJoinedMatchEventData;
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

    public LiveData<JSONObject> getOneQuestionFinishedEventData() {
        return mOneQuestionFinished;
    }

    public LiveData<JSONArray> getQuizzes() {
        return mQuizzes;
    }

    public LiveData<ArrayList<RankingModel>> getCurrentRanking() {
        return mCurrentRanking;
    }

    public void connectSocket() {
        mWSInstance.mSocket.connect();
        mWSInstance.mSocket.on(SocketEventEnum.JOINED_MATCH.label, createListener(mHasJoinedMatchEventData));
        mWSInstance.mSocket.on(SocketEventEnum.MATCH_UPDATED.label, createListener(mMatchUpdatedEventData));
        mWSInstance.mSocket.on(SocketEventEnum.MATCH_READY.label, createListener(mMatchReadyEventData));
        mWSInstance.mSocket.on(SocketEventEnum.WS_SERVER_CONNECTED.label, createListener(mConnectionEvent));
        mWSInstance.mSocket.on(SocketEventEnum.ONE_QUESTION_FINISHED.label, createListener(mOneQuestionFinished));
    }

    public void sendEvent(String eventName, JSONObject payload) {
        mWSInstance.mSocket.emit(eventName, payload);
    }

    public void disconnectSocket() {
        mWSInstance.mSocket.disconnect();
        mWSInstance.mSocket.off(SocketEventEnum.ONE_QUESTION_FINISHED.label);
    }
}
