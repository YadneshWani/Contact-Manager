package com.example.mycontacts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MyContacts extends AppCompatActivity {

    ListView lv;
    static MyContacts myContacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_contacts);

        lv=(ListView)findViewById(R.id.listview);
        myContacts=this;


        lv.setAdapter(new CustomAdapter());
    }
}
