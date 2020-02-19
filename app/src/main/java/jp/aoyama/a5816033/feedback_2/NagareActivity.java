package jp.aoyama.a5816033.feedback_2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NagareActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nagare);

        TextView nagaretext = findViewById(R.id.nagare_text);
        TextView okutext = findViewById(R.id.oku);
        TextView tatutext = findViewById(R.id.sisei);
        TextView kirutext = findViewById(R.id.kiru);

        nagaretext.setText(R.string.n_text);
        okutext.setText("1.置く");
        tatutext.setText("2.立つ");
        kirutext.setText("3.切る");

        Button putbtn=(Button)findViewById(R.id.put_btn);
        Button siseibtn=(Button)findViewById(R.id.sisei_btn);
        Button cutbtn=(Button)findViewById(R.id.syokuzai_btn);
        Button nigirubtn=(Button)findViewById(R.id.nigi_btn);

        cutbtn.setOnClickListener((View v) -> {
            startActivity(new Intent(this, CutActivity.class));
        });
        putbtn.setOnClickListener((View v) -> {
            startActivity(new Intent(this, PutActivity.class));
        });
        siseibtn.setOnClickListener((View v) -> {
            startActivity(new Intent(this, SiseiActivity.class));
        });
        nigirubtn.setOnClickListener((View v) -> {
            startActivity(new Intent(this, MotikataActivity.class));
        });
    }
}
