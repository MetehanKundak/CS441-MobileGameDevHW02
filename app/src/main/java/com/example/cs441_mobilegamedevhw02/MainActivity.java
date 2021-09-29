package com.example.cs441_mobilegamedevhw02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.view.View.OnKeyListener;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
EditText editText;
List<items> items_list = new ArrayList<>();
int next_id;
String input;
//Button  click_button;


private RecyclerView recyclerView;
private RecyclerView.Adapter mAdapter;
private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.lv_itemList);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new RecyleViewAdapter(items_list, MainActivity.this);
        recyclerView.setAdapter(mAdapter);

        //click_button = (Button) findViewById(R.id.button);

        fillitemsList();
        Toast.makeText(this,"Count= " + items_list.size(), Toast.LENGTH_SHORT).show();


        editText = findViewById(R.id.editText);
        //input = editText.toString();
/*
        click_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next_id ++;
                items new_item = new items(next_id,editText.toString());

                items_list.add(new_item);
            }
        });

*/




        editText.setOnKeyListener(new OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction()!=KeyEvent.ACTION_DOWN)
                    return false;
                if(keyCode == KeyEvent.KEYCODE_ENTER ){
                    //your necessary codes...


                    next_id ++;
                    items new_item = new items(next_id,editText.getText().toString());
                    items_list.add(new_item);



                    return true;
                }
                return false;
            }
        });

    }

    private void fillitemsList() {
        //int id;
        //String name;
        items i0 = new items(0, "apple");
        items i1 = new items(1, "pineapple");
        items_list.addAll(Arrays.asList(i0,i1));
    }


}
