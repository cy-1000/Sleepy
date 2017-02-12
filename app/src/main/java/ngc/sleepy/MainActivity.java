package ngc.sleepy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Serializable;

import static android.content.Intent.FLAG_ACTIVITY_REORDER_TO_FRONT;
import static android.provider.AlarmClock.EXTRA_MESSAGE;


public class MainActivity extends AppCompatActivity {

    Player player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player = new Player();

    }


    public void goToMusic(View view){
        if (player.isTimerStarted()){
            finish();
            return;
        }
        Intent intentMusic = new Intent(this, MusicActivity.class);
        //create a Player object and send to next activity
        intentMusic.putExtra("Player", player);
        startActivity(intentMusic);
    }

    public void goToMethods(View view) {
        Intent intentMethods = new Intent(this, MethodsActivity.class);
        startActivity(intentMethods);
    }
  
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        return true;
    }
  
    public void goToInfo(View view) {
        Intent intentInfo = new Intent(this, InfoActivity.class);
        startActivity(intentInfo);
    }

}
