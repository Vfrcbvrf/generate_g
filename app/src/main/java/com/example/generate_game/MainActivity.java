package com.example.generate_game;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;


public class MainActivity extends AppCompatActivity {

    ArrayList<String> users = new ArrayList<String>();
    ArrayList<String> selectedUsers = new ArrayList<String>();
    ArrayAdapter<String> adapter;
    ArrayList<String> locat = new ArrayList<>();
    ListView usersList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Collections.addAll(users, "Лес", "Пещера", "Река");
        usersList = findViewById(R.id.usersList);
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_multiple_choice, users);
        usersList.setAdapter(adapter);

        usersList.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
            {

                String user = adapter.getItem(position);

                if(usersList.isItemChecked(position))
                    selectedUsers.add(user);
                else
                    selectedUsers.remove(user);




            }
        });





    }



    public void onClick(View v) {



        if (selectedUsers!= null) {

            String[] arr = new String[selectedUsers.size()];
            arr = selectedUsers.toArray(arr);
            for (int i = 0; i < arr.length; i++) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        arr[i], Toast.LENGTH_SHORT);
                toast.show();
            }


            for (int i = 0; i < arr.length; i++) {
                Log.d("string is", (String) arr[i]);
            }
            Intent intent = new Intent(this, act1.class);
            intent.putExtra("locations", arr);
            startActivity(intent);

        }

    }
}