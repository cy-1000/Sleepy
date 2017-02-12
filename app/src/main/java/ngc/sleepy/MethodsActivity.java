package ngc.sleepy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MethodsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_methods);
    }

    public void goToMethodOne(View view) {
        Intent intentMethodOne = new Intent(this, FourSevenEightActivity.class);
        startActivity(intentMethodOne);
    }

    public void goToMethodTwo(View view) {
        Intent intentMethodTwo = new Intent(this, MethodTwoActivity.class);
        startActivity(intentMethodTwo);
    }

    public void goToMethodThree(View view) {
        Intent intentMethodThree = new Intent(this, MethodThreeActivity.class);
        startActivity(intentMethodThree);
    }
}
