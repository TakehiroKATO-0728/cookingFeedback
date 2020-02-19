package jp.aoyama.a5816033.feedback_2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MotikataActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motikata);

        Button soete = (Button)findViewById(R.id.soete_button);
        Button nigiru = (Button)findViewById(R.id.nigiru_button);
        soete.setOnClickListener((View v) -> {
            startActivity(new Intent(this, SoeteActivity.class));
        });
        nigiru.setOnClickListener((View view) -> {
            startActivity(new Intent(this,NigiruActivity.class));
        });
    }
}
