package ngc.sleepy;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TimerActivity extends Activity {

    Player player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);

        Intent intentTimer = getIntent();
        player = (Player) intentTimer.getSerializableExtra("Player");

    }

    public void goToPlayback(View view) {
        Intent intentPlayback = new Intent(this, PlaybackActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText3);
        int time = Integer.parseInt(editText.getText().toString());
        player.setTime(time*60);
        //Pass object to the next activity
        intentPlayback.putExtra("Player", player);
        startActivity(intentPlayback);

    }

}




