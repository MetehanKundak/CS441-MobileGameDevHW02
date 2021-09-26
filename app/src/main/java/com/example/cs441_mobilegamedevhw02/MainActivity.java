package com.example.cs441_mobilegamedevhw02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.view.View.OnKeyListener;



import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText input_text;
    Button  add_button;
    //int items=0;
    ArrayList<EditText> shopping_items = new ArrayList<EditText>();
    ListView list;

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

        input_text = findViewById(R.id.input_text);
        list = findViewById(R.id.list_view);
        add_button = findViewById(R.id.button);

        list.setOnKeyListener(new OnKeyListener() {
            @Override
            //@Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction()!=KeyEvent.ACTION_DOWN)
                    return false;
                if(keyCode == KeyEvent.KEYCODE_ENTER ){
                     shopping_items.add(input_text);




                    return true;
                }
                return false;
            }
        });




        //recycler = (RecyclerView.RecyclerListener) findViewById(R.id.recycler);
        //click_button = (Button) findViewById(R.id.button);
        //reset_button = (Button) findViewById(R.id.reset_button);
        //RecyclerView recyclerList = (RecyclerView) findViewById(R.id.recyclerList);
        // Initialize contacts
        //recyclerList = recyclerList.createList(10);
        //recycleview = findViewById(R.id.recyclerList);
        //input = findViewById(R.id.Input);
        //click_button = findViewById(R.id.button);
        //recycle





    }
}