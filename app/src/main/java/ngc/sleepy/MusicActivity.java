package ngc.sleepy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MusicActivity extends AppCompatActivity {

    Player player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        Intent intentMusic = getIntent();
        player = (Player)intentMusic.getSerializableExtra("Player");


    }
    public void goToTimer(View view) {
        Intent intentTimer = new Intent(this, TimerActivity.class);
        String audioName = "audio";
        player.setAudioName(audioName);
        //pass the player object to the next activity
        intentTimer.putExtra("Player", player);
        startActivity(intentTimer);
    }
}
