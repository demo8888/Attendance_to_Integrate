package com.example.deshan.attendance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private static Button button_enterAtt;
    private static Button button_view;
    private static Button button_update;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickButtonListener();
        onClickButtonListenerView();
        onClickButtonListenerUpdate();
        onClickButtonListenerPercentage();

        Spinner subjects = (Spinner)findViewById(R.id.spinner2);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.subs));

        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        subjects.setAdapter(myAdapter);




    }

    public void onClickButtonListener(){
        button_enterAtt = (Button)findViewById(R.id.button);
        button_enterAtt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(".EnterAttendance");
                startActivity(intent1);
            }
        });
    }

    public void onClickButtonListenerView(){
        button_view = (Button)findViewById(R.id.button3);
        button_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(".display");
                startActivity(intent1);
            }
        });
    }

    public void onClickButtonListenerUpdate(){
        button_update = (Button)findViewById(R.id.button9);
        button_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(".update");
                startActivity(intent1);
            }
        });
    }

    public void onClickButtonListenerPercentage(){
        button_update = (Button)findViewById(R.id.button6);
        button_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(".percentage");
                startActivity(intent1);
            }
        });
    }
}
