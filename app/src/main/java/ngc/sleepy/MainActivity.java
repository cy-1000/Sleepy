package ngc.sleepy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.Serializable;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void goToMusic(View view){
        //create an intent and send to next activity
        Intent intentMusic = new Intent(this, MusicActivity.class);
        //create a Player object and send to next activity
        Player player = new Player();
        intentMusic.putExtra("Player", player);
        startActivity(intentMusic);

    }




}
