package com.example.android.fivethings;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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

    /*
    public void contnetOfWritingBrush(String subject, String text){
        subject = "Brief introduction to writing brush.";
        text = "Ink brushes (simplified Chinese: 毛笔; traditional Chinese: 毛筆; pinyin: máo bǐ) are used in Chinese calligraphy. " +
                "They are also used in Chinese painting and descendant brush painting styles. " +
                "The ink brush was invented in China, believed to be around 300 B.C." +
                " Together with the inkstone, inkstick and Xuan paper, these four writing implements form the Four Treasures of the Study.";
    }
    */

    public void showWrtingBrush (View view){
        //ImageView writingBrushView = (ImageView)findViewById(R.id.writingbrush);
        //writingBrushView.setImageResource(R.drawable.ink_stick);

        /*
        subject = "Brief introduction to writing brush.";
        text = "Ink brushes (simplified Chinese: 毛笔; traditional Chinese: 毛筆; pinyin: máo bǐ) are used in Chinese calligraphy. " +
                "They are also used in Chinese painting and descendant brush painting styles. " +
                "The ink brush was invented in China, believed to be around 300 B.C." +
                " Together with the inkstone, inkstick and Xuan paper, these four writing implements form the Four Treasures of the Study.";
        */

        Intent intent = new Intent(this, WritingBrush.class);
        startActivity(intent);
    }

    public void showInkStick (View view){
        Intent intent = new Intent(this, ink_stick.class);
        startActivity(intent);
    }

    public void showPaper (View view){
        Intent intent = new Intent(this, paper.class);
        startActivity(intent);
    }

    public void showInkStone (View view){
        Intent intent = new Intent(this, InkStone.class);
        startActivity(intent);
    }

    public void showYong (View view){
        Intent intent = new Intent(this, Yong.class);
        startActivity(intent);
    }

}
