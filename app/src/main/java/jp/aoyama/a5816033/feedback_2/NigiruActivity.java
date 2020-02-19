package jp.aoyama.a5816033.feedback_2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class NigiruActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nigiru);

        TextView commenttext = findViewById(R.id.comment);

        String string = "親指と人差し指で刃元をはさみ、<br/>残りの3本の指で柄を握ります";
        commenttext.setText(Html.fromHtml(string));
    }
}
