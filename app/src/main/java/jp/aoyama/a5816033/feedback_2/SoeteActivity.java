package jp.aoyama.a5816033.feedback_2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class SoeteActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soete);

        TextView commenttext = findViewById(R.id.comment);

        String string = "指を軽く曲げて、<br/>中指または人差し指の第一関節に刃を沿わせる";
        commenttext.setText(Html.fromHtml(string));
    }
}
