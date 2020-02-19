package jp.aoyama.a5816033.feedback_2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CutActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cut);

        Button cucumberButton = (Button)findViewById(R.id.cucumber_button);
        Button tomatoButton = (Button)findViewById(R.id.tomato_button);

        cucumberButton.setOnClickListener((View view3) ->{
            startActivity(new Intent(this, CucumberActivity.class));
        });
    }
}
