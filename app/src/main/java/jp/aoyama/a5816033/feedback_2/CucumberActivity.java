package jp.aoyama.a5816033.feedback_2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CucumberActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cucumber);

        Button kogutiButton = (Button)findViewById(R.id.koguti_button);

        kogutiButton.setOnClickListener((View view4) ->{
            startActivity(new Intent(this, KogutiActivity.class));
        });
    }
}
