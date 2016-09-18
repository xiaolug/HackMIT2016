package com.example.hackmit2016;

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


/**
 * Created by xiaoluguo on 9/17/16.
 */

public class Quiz extends AppCompatActivity {
    int counter=1;
    String cardName= "Card Number "+counter;
    TextView textview= (TextView) findViewById(R.id.textView2);
    TextView numField=(TextView) findViewById(R.id.textView5);
    TextView suitField=(TextView) findViewById(R.id.textView6);
    NumberPicker field = (NumberPicker) findViewById(R.id.numberPicker);
    Boolean b=true;
    Boolean b1=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        if(field.getValue()==Games.number[counter]&&b){
//            Games.points++;
//            String display="Correct: Points = "+Games.points;
//            numField.setText(display);
//            b = false;
//        }
//        else if(b){
//            String display="Wrong: Points =  "+Games.points;
//            numField.setText(display);
//            b = false;
//        }if(!b1){
//            counter++;
//            textview.setText(cardName);
//            b=true;
//            b1=true;
//            suitField.setText("");
//            numField.setText("");
//        }
//        Button diamonds= (Button) findViewById(R.id.button9);
//        Button hearts= (Button) findViewById(R.id.button10);
//        Button spades= (Button) findViewById(R.id.button11);
//        Button clubs= (Button) findViewById(R.id.button12);
//
//        diamonds.setOnClickListener(
//                new Button.OnClickListener() {
//                    public void onClick(View v) {
//                        if(Games.suit.equals("D")&&b1) {
//                            Games.points++;
//                            String display="Correct: Points = "+Games.points;
//                            suitField.setText(display);
//                            b1 = false;
//                        }else if (b1){
//                            String display="Wrong: Points =  "+Games.points;
//                            suitField.setText(display);
//                            b = false;
//                        }
//                        if(!b){
//                            counter++;
//                            textview.setText(cardName);
//                            b=true;
//                            b1=true;
//                            suitField.setText("");
//                            numField.setText("");
//                        }
//                    }
//                }
//        );
//        hearts.setOnClickListener(
//                new Button.OnClickListener() {
//                    public void onClick(View v) {
//                       if(Games.suit.equals("H")&&b1) {
//                           Games.points++;
//                           String display="Correct: Points = "+Games.points;
//                           suitField.setText(display);
//                           b1 = false;
//                        }else if (b1){
//                           String display="Wrong: Points =  "+Games.points;
//                           suitField.setText(display);
//                           b = false;
//                       }
//                        if(!b){
//                            counter++;
//                            textview.setText(cardName);
//                            b=true;
//                            b1=true;
//                            suitField.setText("");
//                            numField.setText("");
//                        }
//                    }
//                }
//        );
//        spades.setOnClickListener(
//                new Button.OnClickListener() {
//                    public void onClick(View v) {
//                        if(Games.suit.equals("S")&&b1) {
//                            Games.points++;
//                            String display="Correct: Points = "+Games.points;
//                            suitField.setText(display);
//                            b1 = false;
//                        }else if (b1){
//                            String display="Wrong: Points =  "+Games.points;
//                            suitField.setText(display);
//                            b = false;
//                        }
//                        if(!b){
//                            counter++;
//                            textview.setText(cardName);
//                            b=true;
//                            b1=true;
//                            suitField.setText("");
//                            numField.setText("");
//                        }
//                    }
//                }
//        );
//        clubs.setOnClickListener(
//                new Button.OnClickListener() {
//                    public void onClick(View v) {
//                        if(Games.suit.equals("C")&&b1) {
//                            Games.points++;
//                            String display="Correct: Points = "+Games.points;
//                            suitField.setText(display);
//                            b1 = false;
//                        }else if (b1) {
//                            String display = "Wrong: Points =  " + Games.points;
//                            suitField.setText(display);
//                            b = false;
//                        }
//                        if(!b){
//                            counter++;
//                            textview.setText(cardName);
//                            b=true;
//                            b1=true;
//                            suitField.setText("");
//                            numField.setText("");
//                        }
//                    }
//                }
//        );


    }
}