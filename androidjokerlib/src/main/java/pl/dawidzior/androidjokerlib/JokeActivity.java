package pl.dawidzior.androidjokerlib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String JOKE_TAG = "JOKE_TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        TextView jokeTextView = findViewById(R.id.joke_tv);

        String joke = getIntent().getStringExtra(JOKE_TAG);

        if (joke != null) {
            jokeTextView.setText(joke);
        } else {
            jokeTextView.setText(R.string.joke_error);
        }
    }
}
