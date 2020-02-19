package jp.aoyama.a5816033.feedback_2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class PutActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_put);

        TextView commenttext = findViewById(R.id.comment);

        String string = "まな板の奥へ刃先を向けて置きましょう";
        commenttext.setText(Html.fromHtml(string));
    }
}
