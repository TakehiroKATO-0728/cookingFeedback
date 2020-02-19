package jp.aoyama.a5816033.feedback_2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class StopActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop);

        TextView commenttext = findViewById(R.id.comment);

        String string = "あなたは、包丁を<br/><br/>  <font color=\"red\"><big>ゆっくり動かして</big></font>  切る<br/><br/>傾向があります";
        commenttext.setText(Html.fromHtml(string));
    }
}
