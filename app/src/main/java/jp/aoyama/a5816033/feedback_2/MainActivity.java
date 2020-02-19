package jp.aoyama.a5816033.feedback_2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button guidebutton = (Button)findViewById(R.id.guide_button);
        Button startbutton = (Button)findViewById(R.id.start_button);
        guidebutton.setOnClickListener((View v) -> {
            startActivity(new Intent(this, NagareActivity.class));
        });
        startbutton.setOnClickListener((View view) -> {
            startActivity(new Intent(this,SelectActivity.class));
        });
    }
}
