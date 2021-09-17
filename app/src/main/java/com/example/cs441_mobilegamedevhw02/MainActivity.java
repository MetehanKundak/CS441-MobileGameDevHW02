package com.example.cs441_mobilegamedevhw02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    EditText hello_text;
    Button  click_button;
    //Button reset_button;
    RecyclerView.Recycler recycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hello_text = (EditText) findViewById(R.id.editTextTextPersonName );
        recycler = (RecyclerView.RecyclerListener) findViewById(R.id.recycler);
        click_button = (Button) findViewById(R.id.button);
        //reset_button = (Button) findViewById(R.id.reset_button);
    }
}