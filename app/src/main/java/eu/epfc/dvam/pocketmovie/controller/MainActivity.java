package eu.epfc.dvam.pocketmovie.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import eu.epfc.dvam.pocketmovie.R;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
