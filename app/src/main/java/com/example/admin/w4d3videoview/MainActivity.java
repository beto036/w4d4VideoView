package com.example.admin.w4d3videoview;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "TAG_";
    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        
        videoView = (VideoView) findViewById(R.id.aMAinVideo);

        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.documentariesandyou);

    }

    public void play(View view) {
        videoView.start();
    }

    public void stop(View view) {
        videoView.pause();
    }
}
