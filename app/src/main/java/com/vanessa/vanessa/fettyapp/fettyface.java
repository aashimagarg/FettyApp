package com.vanessa.vanessa.fettyapp;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import java.io.IOException;
/*
@author Aashima Garg & Vanessa Chang
@date 9/26/2015
 */

public class fettyface extends AppCompatActivity{


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fettyface);


        final MediaPlayer mp = new MediaPlayer();
        ImageButton b = (ImageButton) findViewById(R.id.imageButton);
//      List<MediaPlayer> musicPlayer = new ArrayList<MediaPlayer>();
//      List<String> sounds = new ArrayList<String>();
//            /*
//            for(int i = 0; i<6;i++)
//            {
//            musicPlayer.add(new MediPlayer());
//             }
//
//             sounds.add("1738.mp3");
//             sounds.add("SquahFetty.mp3");
//             sounds.add("AyeFetty.mp3");
//             sounds.add("RGFProductions.mp3");
//             sounds.add("YeahBabyFetty.wav");
//             sounds.add("Squah2Fetty.wav");
//
//             */
//

//     sounds.get(x);
//            /*
//            if(musicPlayer.get(x).isPlaying()) {
//                musicPlayer.get(x).stop();
//                }
//               try{
//               sound.get(
//             */
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (mp.isPlaying()) {
                    mp.stop();
                }

                try {
                    mp.reset();
                    AssetFileDescriptor afd;
                    afd = getAssets().openFd("1738.mp3");
                    mp.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                    mp.prepare();
                    mp.start();
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }

        });
        final MediaPlayer mp2 = new MediaPlayer();
        ImageButton b2 = (ImageButton) findViewById(R.id.imageButton2);
            b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (mp2.isPlaying()) {
                    mp2.stop();
                }

                try {
                    mp2.reset();
                    AssetFileDescriptor afd;
                    afd = getAssets().openFd("SquahFetty.mp3");
                    mp2.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                    mp2.prepare();
                    mp2.start();
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }

        });
        final MediaPlayer mp3 = new MediaPlayer();
        ImageButton b3 = (ImageButton) findViewById(R.id.imageButton3);

        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (mp3.isPlaying()) {
                    mp3.stop();
                }

                try {
                    mp3.reset();
                    AssetFileDescriptor afd;
                    afd = getAssets().openFd("AyeFetty.mp3");
                    mp3.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                    mp3.prepare();
                    mp3.start();
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }

        });
        final MediaPlayer mp4 = new MediaPlayer();
        ImageButton b4 = (ImageButton) findViewById(R.id.imageButton4);

        b4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (mp4.isPlaying()) {
                    mp4.stop();
                }

                try {
                    mp4.reset();
                    AssetFileDescriptor afd;
                    afd = getAssets().openFd("RGFProductions.mp3");
                    mp4.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                    mp4.prepare();
                    mp4.start();
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }

        });
        final MediaPlayer mp5 = new MediaPlayer();
        ImageButton b5 = (ImageButton) findViewById(R.id.imageButton5);

        b5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (mp5.isPlaying()) {
                    mp5.stop();
                }

                try {
                    mp5.reset();
                    AssetFileDescriptor afd;
                    afd = getAssets().openFd("YeahBabyFetty.wav");
                    mp5.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                    mp5.prepare();
                    mp5.start();
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }

        });

        final MediaPlayer mp6 = new MediaPlayer();
        ImageButton b6 = (ImageButton) findViewById(R.id.imageButton6);

        b6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (mp6.isPlaying()) {
                    mp6.stop();
                }

                try {
                    mp6.reset();
                    AssetFileDescriptor afd;
                    afd = getAssets().openFd("Squah2Fetty.wav");
                    mp6.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                    mp6.prepare();
                    mp6.start();
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fettyface, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}