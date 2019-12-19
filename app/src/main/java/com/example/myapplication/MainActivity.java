package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridLayout myGridLayout = new GridLayout(this);

        ViewGroup.LayoutParams grParams = new ViewGroup.LayoutParams(

                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT

        );

        myGridLayout.setLayoutParams(grParams);
        myGridLayout.setOrientation(GridLayout.HORIZONTAL);
        myGridLayout.setColumnCount(4);
        myGridLayout.setRowCount(11);

        //Title
        TextView myTextView = new TextView(this);
        myTextView.setText("Rules void hello1(int hour)");
        myTextView.setTextSize(14);
        myTextView.setBackgroundColor(Color.BLACK);
        myTextView.setTextColor(Color.WHITE);
        GridLayout.Spec rowSpec = GridLayout.spec(0,1,1f);
        GridLayout.Spec colSpec = GridLayout.spec(0,4,1f);
        GridLayout.LayoutParams vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        myTextView.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        myTextView.setLayoutParams(vParams);
        myGridLayout.addView(myTextView);

        //Properites
        myTextView = new TextView(this);
        myTextView.setText("properties");
        myTextView.setTextSize(14);
        myTextView.setBackgroundColor(Color.WHITE);
        myTextView.setTextColor(Color.BLACK);
        rowSpec = GridLayout.spec(1,2,1f);
        colSpec = GridLayout.spec(0,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        myTextView.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        myTextView.setLayoutParams(vParams);
        myGridLayout.addView(myTextView);
        
        //Name
        myTextView = new TextView(this);
        myTextView.setText("name");
        myTextView.setTextSize(14);
        myTextView.setBackgroundColor(Color.WHITE);
        myTextView.setTextColor(Color.BLACK);
        rowSpec = GridLayout.spec(1,1,1f);
        colSpec = GridLayout.spec(1,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        myTextView.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        myTextView.setLayoutParams(vParams);
        myGridLayout.addView(myTextView);

        //Day Hour Classification
        myTextView = new TextView(this);
        myTextView.setText("Day Hour Classification");
        myTextView.setTextSize(14);
        myTextView.setBackgroundColor(Color.WHITE);
        myTextView.setTextColor(Color.BLACK);
        rowSpec = GridLayout.spec(1,1,1f);
        colSpec = GridLayout.spec(2,2,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        myTextView.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        myTextView.setLayoutParams(vParams);
        myGridLayout.addView(myTextView);

        //Category
        myTextView = new TextView(this);
        myTextView.setText("category");
        myTextView.setTextSize(14);
        myTextView.setBackgroundColor(Color.WHITE);
        myTextView.setTextColor(Color.BLACK);
        rowSpec = GridLayout.spec(2,1,1f);
        colSpec = GridLayout.spec(1,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        myTextView.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        myTextView.setLayoutParams(vParams);
        myGridLayout.addView(myTextView);

        //Day And Time
        myTextView = new TextView(this);
        myTextView.setText("Day and Time");
        myTextView.setTextSize(14);
        myTextView.setBackgroundColor(Color.WHITE);
        myTextView.setTextColor(Color.BLACK);
        rowSpec = GridLayout.spec(2,1,1f);
        colSpec = GridLayout.spec(2,2,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        myTextView.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        myTextView.setLayoutParams(vParams);
        myGridLayout.addView(myTextView);

        //Rule
        myTextView = new TextView(this);
        myTextView.setText("Rule");
        myTextView.setTextSize(14);
        myTextView.setTypeface(null, Typeface.BOLD);
        myTextView.setBackgroundColor(Color.parseColor("#33F1FF"));
        myTextView.setTextColor(Color.BLACK);
        rowSpec = GridLayout.spec(3,1,1f);
        colSpec = GridLayout.spec(0,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        myTextView.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        myTextView.setLayoutParams(vParams);
        myGridLayout.addView(myTextView);

        //C1
        myTextView = new TextView(this);
        myTextView.setText("C1");
        myTextView.setTextSize(14);
        myTextView.setTypeface(null, Typeface.BOLD);
        myTextView.setBackgroundColor(Color.parseColor("#33F1FF"));
        myTextView.setTextColor(Color.BLACK);
        rowSpec = GridLayout.spec(3,1,1f);
        colSpec = GridLayout.spec(1,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        myTextView.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        myTextView.setLayoutParams(vParams);
        myGridLayout.addView(myTextView);

        //A1
        myTextView = new TextView(this);
        myTextView.setText("A1");
        myTextView.setTextSize(14);
        myTextView.setTypeface(null, Typeface.BOLD);
        myTextView.setBackgroundColor(Color.parseColor("#33F1FF"));
        myTextView.setTextColor(Color.BLACK);
        rowSpec = GridLayout.spec(3,1,1f);
        colSpec = GridLayout.spec(2,2,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        myTextView.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        myTextView.setLayoutParams(vParams);
        myGridLayout.addView(myTextView);

        //Space
        myTextView = new TextView(this);
        myTextView.setText(" ");
        myTextView.setTextSize(14);
        myTextView.setBackgroundColor(Color.parseColor("#33F1FF"));
        myTextView.setTextColor(Color.BLACK);
        rowSpec = GridLayout.spec(4,1,1f);
        colSpec = GridLayout.spec(0,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        myTextView.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        myTextView.setLayoutParams(vParams);
        myGridLayout.addView(myTextView);

        //min <= hour && hour <= max
        myTextView = new TextView(this);
        myTextView.setText("min<=hour && hour<=max");
        myTextView.setTextSize(11);
        myTextView.setBackgroundColor(Color.parseColor("#33F1FF"));
        myTextView.setTextColor(Color.BLACK);
        rowSpec = GridLayout.spec(4,1,1f);
        colSpec = GridLayout.spec(1,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        myTextView.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        myTextView.setLayoutParams(vParams);
        myGridLayout.addView(myTextView);

        //Greeting
        myTextView = new TextView(this);
        myTextView.setText("System.out.println(greeting + \", World!\")");
        myTextView.setTextSize(11);
        myTextView.setBackgroundColor(Color.parseColor("#33F1FF"));
        myTextView.setTextColor(Color.BLACK);
        rowSpec = GridLayout.spec(4,1,1f);
        colSpec = GridLayout.spec(2,2,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        myTextView.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        myTextView.setLayoutParams(vParams);
        myGridLayout.addView(myTextView);

        //Space
        myTextView = new TextView(this);
        myTextView.setTextSize(12);
        myTextView.setBackgroundColor(Color.parseColor("#33F1FF"));
        myTextView.setTextColor(Color.BLACK);
        rowSpec = GridLayout.spec(5,1,1f);
        colSpec = GridLayout.spec(0,1, 1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        myTextView.setGravity(Gravity.CENTER_HORIZONTAL);
        myTextView.setLayoutParams(vParams);
        myGridLayout.addView(myTextView);

        //int min
        myTextView = new TextView(this);
        myTextView.setText("int min");
        myTextView.setTextSize(12);
        myTextView.setBackgroundColor(Color.parseColor("#33F1FF"));
        myTextView.setTextColor(Color.BLACK);
        rowSpec = GridLayout.spec(5,1,1f);
        colSpec = GridLayout.spec(1,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        myTextView.setGravity(Gravity.CENTER_HORIZONTAL);
        myTextView.setLayoutParams(vParams);
        myGridLayout.addView(myTextView);

        //int max
        myTextView = new TextView(this);
        myTextView.setText("int max");
        myTextView.setTextSize(12);
        myTextView.setBackgroundColor(Color.parseColor("#33F1FF"));
        myTextView.setTextColor(Color.BLACK);
        rowSpec = GridLayout.spec(5,1,1f);
        colSpec = GridLayout.spec(2,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        myTextView.setGravity(Gravity.CENTER_HORIZONTAL);
        myTextView.setLayoutParams(vParams);
        myGridLayout.addView(myTextView);

        //String Greeting
        myTextView = new TextView(this);
        myTextView.setText("String Greeting");
        myTextView.setTextSize(12);
        myTextView.setBackgroundColor(Color.parseColor("#33F1FF"));
        myTextView.setTextColor(Color.BLACK);
        rowSpec = GridLayout.spec(5,1,1f);
        colSpec = GridLayout.spec(3,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        myTextView.setGravity(Gravity.CENTER_HORIZONTAL);
        myTextView.setLayoutParams(vParams);
        myGridLayout.addView(myTextView);

        //Rule
        myTextView = new TextView(this);
        myTextView.setText("Rule");
        myTextView.setTextSize(14);
        myTextView.setTypeface(null, Typeface.BOLD);
        myTextView.setBackgroundColor(Color.WHITE);
        myTextView.setTextColor(Color.BLACK);
        rowSpec = GridLayout.spec(6,1,1f);
        colSpec = GridLayout.spec(0,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        myTextView.setGravity(Gravity.LEFT);
        myTextView.setLayoutParams(vParams);
        myGridLayout.addView(myTextView);

        //R20
        myTextView = new TextView(this);
        myTextView.setText("R10");
        myTextView.setTextSize(12);
        myTextView.setBackgroundColor(Color.WHITE);
        myTextView.setTextColor(Color.BLACK);
        rowSpec = GridLayout.spec(7,1,1f);
        colSpec = GridLayout.spec(0,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        myTextView.setGravity(Gravity.LEFT);
        myTextView.setLayoutParams(vParams);
        myGridLayout.addView(myTextView);

        //R20
        myTextView = new TextView(this);
        myTextView.setText("R20");
        myTextView.setTextSize(12);
        myTextView.setBackgroundColor(Color.WHITE);
        myTextView.setTextColor(Color.BLACK);
        rowSpec = GridLayout.spec(8,1,1f);
        colSpec = GridLayout.spec(0,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        myTextView.setGravity(Gravity.LEFT);
        myTextView.setLayoutParams(vParams);
        myGridLayout.addView(myTextView);

        //R30
        myTextView = new TextView(this);
        myTextView.setText("R30");
        myTextView.setTextSize(12);
        myTextView.setBackgroundColor(Color.WHITE);
        myTextView.setTextColor(Color.BLACK);
        rowSpec = GridLayout.spec(9,1,1f);
        colSpec = GridLayout.spec(0,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        myTextView.setGravity(Gravity.LEFT);
        myTextView.setLayoutParams(vParams);
        myGridLayout.addView(myTextView);

        //R40
        myTextView = new TextView(this);
        myTextView.setText("R40");
        myTextView.setTextSize(12);
        myTextView.setBackgroundColor(Color.WHITE);
        myTextView.setTextColor(Color.BLACK);
        rowSpec = GridLayout.spec(10,1,1f);
        colSpec = GridLayout.spec(0,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        myTextView.setGravity(Gravity.LEFT);
        myTextView.setLayoutParams(vParams);
        myGridLayout.addView(myTextView);

        //From
        myTextView = new TextView(this);
        myTextView.setText("From");
        myTextView.setTextSize(14);
        myTextView.setTypeface(null, Typeface.BOLD);
        myTextView.setBackgroundColor(Color.parseColor("#FCF57B"));
        myTextView.setTextColor(Color.BLACK);
        rowSpec = GridLayout.spec(6,1,1f);
        colSpec = GridLayout.spec(1,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        myTextView.setGravity(Gravity.LEFT);
        myTextView.setLayoutParams(vParams);
        myGridLayout.addView(myTextView);

        //0
        myTextView = new TextView(this);
        myTextView.setText("0");
        myTextView.setTextSize(12);
        myTextView.setBackgroundColor(Color.parseColor("#FCF57B"));
        myTextView.setTextColor(Color.BLACK);
        rowSpec = GridLayout.spec(7,1,1f);
        colSpec = GridLayout.spec(1,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        myTextView.setGravity(Gravity.RIGHT);
        myTextView.setLayoutParams(vParams);
        myGridLayout.addView(myTextView);

        //12
        myTextView = new TextView(this);
        myTextView.setText("12");
        myTextView.setTextSize(12);
        myTextView.setBackgroundColor(Color.parseColor("#FCF57B"));
        myTextView.setTextColor(Color.BLACK);
        rowSpec = GridLayout.spec(8,1,1f);
        colSpec = GridLayout.spec(1,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        myTextView.setGravity(Gravity.RIGHT);
        myTextView.setLayoutParams(vParams);
        myGridLayout.addView(myTextView);

        //18
        myTextView = new TextView(this);
        myTextView.setText("18");
        myTextView.setTextSize(12);
        myTextView.setBackgroundColor(Color.parseColor("#FCF57B"));
        myTextView.setTextColor(Color.BLACK);
        rowSpec = GridLayout.spec(9,1,1f);
        colSpec = GridLayout.spec(1,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        myTextView.setGravity(Gravity.RIGHT);
        myTextView.setLayoutParams(vParams);
        myGridLayout.addView(myTextView);

        //2
        myTextView = new TextView(this);
        myTextView.setText("22");
        myTextView.setTextSize(12);
        myTextView.setBackgroundColor(Color.parseColor("#FCF57B"));
        myTextView.setTextColor(Color.BLACK);
        rowSpec = GridLayout.spec(10,1,1f);
        colSpec = GridLayout.spec(1,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        myTextView.setGravity(Gravity.RIGHT);
        myTextView.setLayoutParams(vParams);
        myGridLayout.addView(myTextView);

        //To
        myTextView = new TextView(this);
        myTextView.setText("To");
        myTextView.setTextSize(14);
        myTextView.setTypeface(null, Typeface.BOLD);
        myTextView.setBackgroundColor(Color.parseColor("#FCF57B"));
        myTextView.setTextColor(Color.BLACK);
        rowSpec = GridLayout.spec(6,1,1f);
        colSpec = GridLayout.spec(2,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        myTextView.setGravity(Gravity.LEFT);
        myTextView.setLayoutParams(vParams);
        myGridLayout.addView(myTextView);

        //11
        myTextView = new TextView(this);
        myTextView.setText("11");
        myTextView.setTextSize(12);
        myTextView.setBackgroundColor(Color.parseColor("#FCF57B"));
        myTextView.setTextColor(Color.BLACK);
        rowSpec = GridLayout.spec(7,1,1f);
        colSpec = GridLayout.spec(2,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        myTextView.setGravity(Gravity.RIGHT);
        myTextView.setLayoutParams(vParams);
        myGridLayout.addView(myTextView);

        //17
        myTextView = new TextView(this);
        myTextView.setText("17");
        myTextView.setTextSize(12);
        myTextView.setBackgroundColor(Color.parseColor("#FCF57B"));
        myTextView.setTextColor(Color.BLACK);
        rowSpec = GridLayout.spec(8,1,1f);
        colSpec = GridLayout.spec(2,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        myTextView.setGravity(Gravity.RIGHT);
        myTextView.setLayoutParams(vParams);
        myGridLayout.addView(myTextView);

        //21
        myTextView = new TextView(this);
        myTextView.setText("21");
        myTextView.setTextSize(12);
        myTextView.setBackgroundColor(Color.parseColor("#FCF57B"));
        myTextView.setTextColor(Color.BLACK);
        rowSpec = GridLayout.spec(9,1,1f);
        colSpec = GridLayout.spec(2,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        myTextView.setGravity(Gravity.RIGHT);
        myTextView.setLayoutParams(vParams);
        myGridLayout.addView(myTextView);

        //23
        myTextView = new TextView(this);
        myTextView.setText("23");
        myTextView.setTextSize(12);
        myTextView.setBackgroundColor(Color.parseColor("#FCF57B"));
        myTextView.setTextColor(Color.BLACK);
        rowSpec = GridLayout.spec(10,1,1f);
        colSpec = GridLayout.spec(2,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        myTextView.setGravity(Gravity.RIGHT);
        myTextView.setLayoutParams(vParams);
        myGridLayout.addView(myTextView);

        //Greeting
        myTextView = new TextView(this);
        myTextView.setText("Greeting");
        myTextView.setTextSize(14);
        myTextView.setTypeface(null, Typeface.BOLD);
        myTextView.setBackgroundColor(Color.parseColor("#FF9463"));
        myTextView.setTextColor(Color.BLACK);
        rowSpec = GridLayout.spec(6,1,1f);
        colSpec = GridLayout.spec(3,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        myTextView.setGravity(Gravity.LEFT);
        myTextView.setLayoutParams(vParams);
        myGridLayout.addView(myTextView);

        //Good Morning
        myTextView = new TextView(this);
        myTextView.setText("Good Morning");
        myTextView.setTextSize(11);
        myTextView.setBackgroundColor(Color.parseColor("#FF9463"));
        myTextView.setTextColor(Color.BLACK);
        rowSpec = GridLayout.spec(7,1,1f);
        colSpec = GridLayout.spec(3,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        myTextView.setGravity(Gravity.LEFT);
        myTextView.setLayoutParams(vParams);
        myGridLayout.addView(myTextView);

        //Good Afternoon
        myTextView = new TextView(this);
        myTextView.setText("Good Afternoon");
        myTextView.setTextSize(12);
        myTextView.setBackgroundColor(Color.parseColor("#FF9463"));
        myTextView.setTextColor(Color.BLACK);
        rowSpec = GridLayout.spec(8,1,1f);
        colSpec = GridLayout.spec(3,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        myTextView.setGravity(Gravity.LEFT);
        myTextView.setLayoutParams(vParams);
        myGridLayout.addView(myTextView);

        //Good Evening
        myTextView = new TextView(this);
        myTextView.setText("Good Evening");
        myTextView.setTextSize(12);
        myTextView.setBackgroundColor(Color.parseColor("#FF9463"));
        myTextView.setTextColor(Color.BLACK);
        rowSpec = GridLayout.spec(9,1,1f);
        colSpec = GridLayout.spec(3,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        myTextView.setGravity(Gravity.LEFT);
        myTextView.setLayoutParams(vParams);
        myGridLayout.addView(myTextView);

        //Good Night
        myTextView = new TextView(this);
        myTextView.setText("Good Night");
        myTextView.setTextSize(12);
        myTextView.setBackgroundColor(Color.parseColor("#FF9463"));
        myTextView.setTextColor(Color.BLACK);
        rowSpec = GridLayout.spec(10,1,1f);
        colSpec = GridLayout.spec(3,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        myTextView.setGravity(Gravity.LEFT);
        myTextView.setLayoutParams(vParams);
        myGridLayout.addView(myTextView);

        setContentView(myGridLayout);

    }

}
