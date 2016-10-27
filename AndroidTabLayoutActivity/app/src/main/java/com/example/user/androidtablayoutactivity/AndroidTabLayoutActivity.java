package com.example.user.androidtablayoutactivity;


import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class AndroidTabLayoutActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TabHost tabHost=getTabHost();

        TabSpec videospec=tabHost.newTabSpec("Videos");
        videospec.setIndicator("Videos",
                getResources().getDrawable(R.drawable.icon_videos_tab));
        Intent videosIntent=new Intent(this,VediosActivity.class);
        videospec.setContent(videosIntent);

        TabSpec photospec=tabHost.newTabSpec("Photos");
        photospec.setIndicator("Photos",
                getResources().getDrawable(R.drawable.icon_photos_tab));
        Intent photosIntent=new Intent(this,PhotosActivity.class);
        photospec.setContent(photosIntent);


        TabSpec songspec=tabHost.newTabSpec("Songs");
        songspec.setIndicator("Songs",
                getResources().getDrawable(R.drawable.icon_songs_tab));
        Intent songsIntent=new Intent(this,SongsActivity.class);
        songspec.setContent(songsIntent);

        tabHost.addTab(photospec);
        tabHost.addTab(songspec);
        tabHost.addTab(videospec);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
