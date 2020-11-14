package com.kkndesasendang.sendangsmartlearning.ui.match;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.github.nkzawa.emitter.Emitter;
import com.kkndesasendang.sendangsmartlearning.helper.SingleLiveEvent;
import com.kkndesasendang.sendangsmartlearning.model.MatchQuestionModel;
import com.kkndesasendang.sendangsmartlearning.model.RankingModel;
import com.kkndesasendang.sendangsmartlearning.wsutil.SocketEventEnum;
import com.kkndesasendang.sendangsmartlearning.wsutil.WSInstance;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import static com.kkndesasendang.sendangsmartlearning.helper.Helper.logMessage;

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
    public MutableLiveData<ArrayList<MatchQuestionModel>> mMatchQuestionList = new MutableLiveData<>();
    public MutableLiveData<ArrayList<RankingModel>> mCurrentRanking= new MutableLiveData<>();

    private Emitter.Listener createGenericListener(final MutableLiveData<JSONObject> prop) {
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

    public LiveData<ArrayList<MatchQuestionModel>> getMatchQuestions() {
        return mMatchQuestionList;
    }

    public LiveData<ArrayList<RankingModel>> getCurrentRanking() {
        return mCurrentRanking;
    }

    public void connectSocket() {
        mWSInstance.mSocket.connect();
        mWSInstance.mSocket.on(SocketEventEnum.JOINED_MATCH.label, createGenericListener(mHasJoinedMatchEventData));
        mWSInstance.mSocket.on(SocketEventEnum.MATCH_UPDATED.label, createGenericListener(mMatchUpdatedEventData));
        mWSInstance.mSocket.on(SocketEventEnum.WS_SERVER_CONNECTED.label, createGenericListener(mConnectionEvent));
        mWSInstance.mSocket.on(SocketEventEnum.ONE_QUESTION_FINISHED.label, createGenericListener(mOneQuestionFinished));

        mWSInstance.mSocket.on(SocketEventEnum.MATCH_READY.label, new Emitter.Listener() {
            @Override
            public void call(Object... args) {
                JSONObject data = (JSONObject) args[0];
                try {
                    logMessage("onMatchReady " + data, MatchViewModel.class.getName());
                    extractParticipants(data.getJSONArray("participants"));
                    extractQuizzes(data.getJSONArray("quizzes"));
                    mMatchId.postValue(data.getString("matchId"));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                mMatchReadyEventData.postValue(data);
            }
        });
    }

    private void extractParticipants(JSONArray rawParticipants) throws JSONException {
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0 ; i < rawParticipants.length(); i++) {
            names.add(rawParticipants.getString(i));
        }
        mParticipants.postValue(names);
    }

    private void extractQuizzes(JSONArray rawQuizzes) throws JSONException {
        ArrayList<MatchQuestionModel> questionList = new ArrayList<>();
        for (int i = 0 ; i < rawQuizzes.length() ; i++) {
            JSONObject item = rawQuizzes.getJSONObject(i);
            // extract question
            String question = item.getString("questionString");

            // extract options
            JSONArray rawOptionArr = item.getJSONArray("options");
            ArrayList<String> optionArr = new ArrayList<>();
            for (int j = 0 ; j < rawOptionArr.length(); j++) {
                optionArr.add(rawOptionArr.getString(j));
            }

            // extract answer
            String answer = item.getString("answer");

            // add to list
            questionList.add(new MatchQuestionModel(question, optionArr, answer));
        }
        logMessage("MatchQuestionList: " + mMatchQuestionList, this.getClass().getName());
        mMatchQuestionList.postValue(questionList);
    }

    public void sendEvent(String eventName, JSONObject payload) {
        mWSInstance.mSocket.emit(eventName, payload);
    }

    public void disconnectSocket() {
        mWSInstance.mSocket.disconnect();
        mWSInstance.mSocket.off(SocketEventEnum.JOINED_MATCH.label);
        mWSInstance.mSocket.off(SocketEventEnum.MATCH_UPDATED.label);
        mWSInstance.mSocket.off(SocketEventEnum.MATCH_READY.label);
        mWSInstance.mSocket.off(SocketEventEnum.WS_SERVER_CONNECTED.label);
        mWSInstance.mSocket.off(SocketEventEnum.ONE_QUESTION_FINISHED.label);
    }
}
