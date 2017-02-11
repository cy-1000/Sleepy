package ngc.sleepy;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PlaybackActivity extends AppCompatActivity {

    Player player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playback);

        Intent intentPlayback = getIntent();
        player = (Player)intentPlayback.getSerializableExtra("Player");
        TextView countdown = (TextView) findViewById(R.id.timerCountdown);
        long time = player.getTime();
        countdown(time,countdown);

    }

    public void countdown(long Seconds,final TextView tv){
        new CountDownTimer(Seconds* 1000+1000, 1000) {
            public void onTick(long millisUntilFinished) {
                int seconds = (int) (millisUntilFinished / 1000);
                int minutes = seconds / 60;
                seconds = seconds % 60;
                tv.setText("TIME : " + String.format("%02d", minutes)
                        + ":" + String.format("%02d", seconds));
            }
            public void onFinish() {
                tv.setText("Completed");
            }
        }.start();
    }
}
