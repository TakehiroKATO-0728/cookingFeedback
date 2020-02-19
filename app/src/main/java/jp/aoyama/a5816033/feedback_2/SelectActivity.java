package jp.aoyama.a5816033.feedback_2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        Button rightButton = (Button)findViewById(R.id.right_button);
        rightButton.setOnClickListener((View view3) -> {
            startActivity(new Intent(this, RightActivity.class));
        });
    }
}
