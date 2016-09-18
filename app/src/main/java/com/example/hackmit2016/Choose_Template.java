package com.example.hackmit2016;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by xiaoluguo on 9/17/16.
 */
public class Choose_Template extends AppCompatActivity{
    //implements NavigationView.OnNavigationItemSelectedListener {
    int num = 1;
    int resID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_template);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button right=(Button) findViewById(R.id.rightTemplate);
        Button left=(Button) findViewById(R.id.leftTemplate);
        Button select=(Button) findViewById(R.id.selectTemp);
        Button save=(Button) findViewById(R.id.save);

        final ImageView pic= (ImageView) findViewById(R.id.temps);

        right.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        num=(num+1)%11;
                        if (num == 0) { num = 11; }
                        String mDrawableName="l"+num;
                        resID=getResources().getIdentifier(mDrawableName, "drawable", getPackageName());
                        pic.setImageResource(resID);
                    }
                }
        );
        left.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        num=(num-1)%11;
                        if (num == 0) { num = 11; }
                        String mDrawableName="l"+num;
                        resID=getResources().getIdentifier(mDrawableName, "drawable", getPackageName());
                        pic.setImageResource(resID);
                    }
                }
        );
        select.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        //add "Add Photo" button
                        //let user add photos
                        //saves each screen
                        //still allows user to move
                        //upon moving, de-select
                    }
                }
        );
        save.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        //saves entire sequence
                        //what

                        //exits to home page
                        Intent i = new Intent(Choose_Template.this, CreateNew.class);
                        startActivity(i);
                    }
                }
        );

    }

    //private void addPhotoButton() {
    //}

    //private ???
}
