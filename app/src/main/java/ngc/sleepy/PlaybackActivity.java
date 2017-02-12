package ngc.sleepy;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

public class PlaybackActivity extends AppCompatActivity {

    Player player;
    MediaPlayer media;
    MainActivity main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playback);

        Intent intentPlayback = getIntent();
        player = (Player)intentPlayback.getSerializableExtra("Player");

        intentPlayback = intentPlayback.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        TextView countdown = (TextView) findViewById(R.id.timerCountdown);
        int time = player.getTime();
        player.setTimerStarted(true);
        countdown(time,countdown);
        media = MediaPlayer.create(PlaybackActivity.this, R.raw.naturesounds);
        media.start(); // no need to call prepare(); create() does that for you


    }

    public void countdown(int Seconds,final TextView tv){
        new CountDownTimer(Seconds* 1000+1000, 1000) {
            public void onTick(long millisUntilFinished) {
                int seconds = (int) (millisUntilFinished / 1000);
                int minutes = seconds / 60;
                seconds = seconds % 60;
                tv.setText("TIME : " + String.format("%02d", minutes)
                        + ":" + String.format("%02d", seconds));
            }
            public void onFinish() {
                media.stop();
                tv.setText("Completed");
            }
        }.start();


    }

    public void stopPlayback(View view){
        //create an intent and send to next activity
        Intent intentMusic = new Intent(this, MusicActivity.class);
        //create a Player object and send to next activity
        Player player = new Player();
        intentMusic.putExtra("Player", player);
        startActivity(intentMusic);
        media.stop();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if(keyCode == KeyEvent.KEYCODE_BACK)
        {
            /*Intent intentMain = new Intent(this, MainActivity.class);
            intentMain.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            intentMain.putExtra("Player",player);
            startActivity(intentMain);
            return true;*/
            stopPlayback(findViewById(R.id.stopButton));
        }
        return false;
    }
}
