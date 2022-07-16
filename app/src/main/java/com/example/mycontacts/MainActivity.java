package com.example.mycontacts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Set;

public class MainActivity extends AppCompatActivity {


    EditText name,phone;
    Button add,contacts;
    static RadioButton male,female;
    public static ArrayList<String>names =new ArrayList<String>();
    public static ArrayList<String> numbers =new ArrayList<String>();
    public static int cnt=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=(EditText)findViewById(R.id.name);
        phone=(EditText)findViewById(R.id.phone);
        add=(Button)findViewById(R.id.AddContact);
        contacts=(Button)findViewById(R.id.ViewContact);
        male=(RadioButton)findViewById(R.id.male);
        female=(RadioButton)findViewById(R.id.female);



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "Inside add Onclick", Toast.LENGTH_LONG).show();
                   names.add(name.getText().toString());
                   numbers.add(phone.getText().toString());
                Toast.makeText(MainActivity.this, "Contact Added Successfully", Toast.LENGTH_LONG).show();
                }

        });

        contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MyContacts.class);
                startActivity(intent);
            }
        });

    }
    public void clear(View v)
    {
        name.setText("");
        phone.setText("");
        Toast.makeText(this, "Clear", Toast.LENGTH_LONG).show();
    }

}
