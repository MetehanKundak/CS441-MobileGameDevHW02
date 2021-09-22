package com.example.cs441_mobilegamedevhw02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText hello_text;
    Button  click_button;
    //int items=0;
    ArrayList<String> shopping_items;

    //Button reset_button;
    //RecyclerView.Recycler recycler;
   /* public static ArrayList<recycleList> createrecycleList(int items) {
        ArrayList<recycleList> recycleList = new ArrayList<recycleList>();
        for (int i = 1; i <= items; i++) {
            recycleList.add(hello_text);
        }

        return recycleList;
    }*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //recycler = (RecyclerView.RecyclerListener) findViewById(R.id.recycler);
        //click_button = (Button) findViewById(R.id.button);
        //reset_button = (Button) findViewById(R.id.reset_button);
        //RecyclerView recyclerList = (RecyclerView) findViewById(R.id.recyclerList);
        // Initialize contacts
        //recyclerList = recyclerList.createList(10);
        recycleview = findViewById(R.id.recyclerList);
        input = findViewById(R.id.Input);
        click_button = findViewById(R.id.button);
        //recycle





    }
}