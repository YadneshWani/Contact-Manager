package com.example.mycontacts;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    @Override
    public int getCount() {
        return MainActivity.names.size();
    }

    @Override
    public Object getItem(int position) {
        return MainActivity.names.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(MyContacts.myContacts);

        View v = inflater.inflate(R.layout.single_contact, null);

        ImageView iv = (ImageView) v.findViewById(R.id.imageView);
        TextView name = (TextView) v.findViewById(R.id.nameTextView);
        TextView phone = (TextView) v.findViewById(R.id.phoneTextView);


        iv.setImageResource(R.drawable.contact_icon);
        name.setText(MainActivity.names.get(position));
        phone.setText(MainActivity.numbers.get(position));

        return v;


    }
}
