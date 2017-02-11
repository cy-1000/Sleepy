package ngc.sleepy;

import java.io.Serializable;

/**
 * Created by cy on 2/11/17.
 */

public class Player implements Serializable {

    String audioName;
    long time;


    public Player(String audioName, long time){
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
    public void setTime(long time){
        this.time = time;
    }
    public long getTime(){
        return time;
    }
}
