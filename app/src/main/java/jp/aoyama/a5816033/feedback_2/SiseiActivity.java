package jp.aoyama.a5816033.feedback_2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class SiseiActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sisei);

        TextView commenttext = findViewById(R.id.comment);

        String string = "1.こぶし1個分、調理台と身体の間をあけます<br/>2.足を少し開きます<br/>3.右足を斜め横に引いて立ちます";
        commenttext.setText(Html.fromHtml(string));
    }
}
