package pl.lab03.musicapp.topsongs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import pl.lab03.musicapp.R;

public class TopSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_songs);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();

        return true;
    }

}
