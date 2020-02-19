package jp.aoyama.a5816033.feedback_2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class StartActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Button stopBtn = (Button)findViewById(R.id.stop_btn);
        Button xBtn = (Button)findViewById(R.id.x_btn);
        Button yBtn = (Button)findViewById(R.id.y_btn);
        Button zBtn = (Button)findViewById(R.id.z_btn);

        stopBtn.setOnClickListener((View v) -> {
            startActivity(new Intent(this,StopActivity.class));
        });
        xBtn.setOnClickListener((View v) -> {
            startActivity(new Intent(this,MovexActivity.class));
        });
        yBtn.setOnClickListener((View v) -> {
            startActivity(new Intent(this,MoveyActivity.class));
        });
        zBtn.setOnClickListener((View v) -> {
            startActivity(new Intent(this,MovezActivity.class));
        });
    }
}
