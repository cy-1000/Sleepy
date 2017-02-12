package ngc.sleepy;

import java.io.Serializable;

/**
 * Created by cy on 2/11/17.
 */

public class Player implements Serializable {

    String audioName;
    int time;
    boolean timerStarted;



    public Player(String audioName, int time){
        this.audioName = audioName;
        this.time = time;
    }

    public Player(){
        this.audioName = "";
        this.time = 0;
    }

    public void setAudioName(String audioName){
        this.audioName = audioName;
    }
    public String getAudioName(){
        return audioName;
    }
    public void setTime(int time){
        this.time = time;
    }
    public int getTime(){
        return time;
    }

    public boolean isTimerStarted(){
        return timerStarted;
    }
    public void setTimerStarted(boolean ans){
        timerStarted = ans;
    }
}
