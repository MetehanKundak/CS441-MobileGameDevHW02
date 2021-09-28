package com.example.cs441_mobilegamedevhw02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.view.View.OnKeyListener;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
EditText editText;
//List<items> items_list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //fillitemsList();


        editText = findViewById(R.id.editText);
        editText.setOnKeyListener(new OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction()!=KeyEvent.ACTION_DOWN)
                    return false;
                if(keyCode == KeyEvent.KEYCODE_ENTER ){
                    //your necessary codes...



                    return true;
                }
                return false;
            }
        });




    }
/*
    private void fillitemsList() {
        //int id;
        //String name;
        items i0 = new items(0, "apple");
        items i1 = new items(1, "pineapple");
        items_list.addAll(Arrays.asList(i0,i1));
    }
*/

}
