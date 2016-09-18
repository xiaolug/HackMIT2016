package com.example.hackmit2016;

import android.net.Uri;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.NumberPicker;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;


/**
 * Created by xiaoluguo on 9/17/16.
 */

public class Quiz extends AppCompatActivity {
    int counter = 1;
    String cardName = "Card Number " + counter;
    Boolean b = true;
    Boolean b1 = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final TextView textview = (TextView) findViewById(R.id.textView2);
        final TextView numField = (TextView) findViewById(R.id.textView5);
        final TextView suitField = (TextView) findViewById(R.id.textView6);
        final NumberPicker field = (NumberPicker) findViewById(R.id.numberPicker);
        field.setMinValue(1);
        field.setMaxValue(11);
        Button ent=(Button) findViewById(R.id.button13);
        ent.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if(!b1&&!b){
                            counter++;
                            String cardName = "Card Number " + counter;
                            textview.setText(cardName);
                            b=true;
                            b1=true;
                            suitField.setText("");
                            numField.setText("");
                        }
                        if(field.getValue()==Games.number[counter]&&b){
                            Games.points++;
                            String display="Correct: Points = "+Games.points;
                            numField.setText(display);
                            b = false;
                        }
                        else if(b){
                            String display="Wrong: Points =  "+Games.points;
                            numField.setText(display);
                            b = false;
                        }
                    }
                }
        );


        Button diamonds= (Button) findViewById(R.id.button9);
        Button hearts= (Button) findViewById(R.id.button10);
        Button spades= (Button) findViewById(R.id.button11);
        Button clubs= (Button) findViewById(R.id.button12);

        diamonds.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if(!b&&!b1){
                            counter++;
                            String cardName = "Card Number " + counter;
                            textview.setText(cardName);
                            b=true;
                            b1=true;
                            suitField.setText("");
                            numField.setText("");
                        }
                        else if(Games.suit[counter].equals("D")&&b1) {
                            Games.points++;
                            String display="Correct: Points = "+Games.points;
                            suitField.setText(display);
                            b1 = false;
                        }else if (b1){
                            String display="Wrong: Points = "+Games.points;
                            suitField.setText(display);
                            b1 = false;
                        }
                    }
                }
        );
        hearts.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if(!b&&!b1){
                            counter++;
                            String cardName = "Card Number " + counter;
                            textview.setText(cardName);
                            b=true;
                            b1=true;
                            suitField.setText("");
                            numField.setText("");
                        } else if(Games.suit[counter].equals("H")&&b1) {
                           Games.points++;
                           String display="Correct: Points = "+Games.points;
                           suitField.setText(display);
                           b1 = false;
                        }else if (b1){
                           String display="Wrong: Points =  "+Games.points;
                           suitField.setText(display);
                           b1 = false;
                       }
                    }
                }
        );
        spades.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if(!b&&!b1){
                            counter++;
                            String cardName = "Card Number " + counter;
                            textview.setText(cardName);
                            b=true;
                            b1=true;
                            suitField.setText("");
                            numField.setText("");
                        }else if(Games.suit[counter].equals("S")&&b1) {
                            Games.points++;
                            String display="Correct: Points = "+Games.points;
                            suitField.setText(display);
                            b1 = false;
                        }else if (b1){
                            String display="Wrong: Points =  "+Games.points;
                            suitField.setText(display);
                            b1 = false;
                        }
                    }
                }
        );
        clubs.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if(!b&&!b1){
                            counter++;
                            String cardName = "Card Number " + counter;
                            textview.setText(cardName);
                            b=true;
                            b1=true;
                            suitField.setText("");
                            numField.setText("");
                        }else if(Games.suit[counter].equals("C")&&b1) {
                            Games.points++;
                            String display="Correct: Points = "+Games.points;
                            suitField.setText(display);
                            b1 = false;
                        }else if (b1) {
                            String display = "Wrong: Points =  " + Games.points;
                            suitField.setText(display);
                            b1 = false;
                        }
                    }
                }
        );

    }
}