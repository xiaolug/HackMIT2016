package com.example.hackmit2016;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by xiaoluguo on 9/18/16.
 */
public class Gamept2 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    static int[] number ={4,5,7,13,13,4,6,2,5,8,1};
    static String[] numMap = {"t","n","m","r","l","g","k","f","p","z","w","q","b"}; //ace to king in order
    static String[] suit={"s", "s", "c","d","s","c","d","s","h","h","c"};
    static String[] loc={"East Campus","Senior House", "Maseeh", "McCormick", "Baker", "Burton-Connor", "MacGregor", "New",
                            "Next","Random","Simmons"};
    static String[]obj={"smore", "seal","cake","dab","sub","car","dog","sun","hall","hoof","cat"};
    int num=1;
    int resID;
    int resID2;
    static int points=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.games);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button right=(Button) findViewById(R.id.button6);
        Button left=(Button) findViewById(R.id.button7);
        Button finish=(Button) findViewById(R.id.button8);

        final ImageView pic= (ImageView) findViewById(R.id.imageView2);
        final ImageView card = (ImageView) findViewById(R.id.imageView3);
        final TextView des=(TextView) findViewById(R.id.textView9);

        right.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if(num!=11) {
                            num = num + 1;
                            des.setText(loc[num-1]+": "+obj[num-1]);
                            String mDrawableName = "l" + num;
                            resID = getResources().getIdentifier(mDrawableName, "drawable", getPackageName());
                            pic.setImageResource(resID);

                            String cardFileName = suit[num - 1] + numMap[number[num - 1] - 1];
                            resID2 = getResources().getIdentifier(cardFileName, "drawable", getPackageName());
                            card.setImageResource(resID2);
                        }
                    }
                }
        );
        left.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if(num!=1) {
                            num = num - 1;
                            des.setText(loc[num-1]+": "+obj[num-1]);
                            String mDrawableName = "l" + num;
                            resID = getResources().getIdentifier(mDrawableName, "drawable", getPackageName());
                            pic.setImageResource(resID);

                            String cardFileName = suit[num - 1] + numMap[number[num - 1] - 1];
                            resID2 = getResources().getIdentifier(cardFileName, "drawable", getPackageName());
                            card.setImageResource(resID2);
                        }
                    }
                }
        );

        finish.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(Gamept2.this, Quiz.class);
                        startActivity(i);
                    }
                }
        );


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_newpath) {

            Intent i = new Intent(this, CreateNew.class);
            startActivity(i);

        } else if (id == R.id.nav_mypaths) {

            Intent i = new Intent(this, MyPaths.class);
            startActivity(i);

        } else if (id == R.id.nav_games) {
            Intent i = new Intent(this, Games.class);
            startActivity(i);

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
