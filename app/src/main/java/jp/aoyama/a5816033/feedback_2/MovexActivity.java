package jp.aoyama.a5816033.feedback_2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MovexActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movex);

        Button sbtn = (Button)findViewById(R.id.stop_btn);

        sbtn.setOnClickListener((View v) -> {
            startActivity(new Intent(this,StopActivity.class));
        });
    }
}
