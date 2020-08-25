package com.trishasofttech.datapassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private Button btn_next;
private EditText et_username;

/*SharedPrefernces store light weight data in key values pair e.g store session data*/
    SharedPreferences sp;
    /*to edit the sharedpreferences file*/
    SharedPreferences.Editor ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_username = findViewById(R.id.et_username);
        btn_next = findViewById(R.id.btn_next);

        /*data passing using Sharedpreferences*/
        /*to create or open the sharedprefernces file*/
        sp = getSharedPreferences("virusir", 0);
        /*to edit the sharedprefernces file*/
        ed = sp.edit();

        /*btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                *//*to store the username in sharedpreferences*//*
                ed.putString("usernamekey", et_username.getText().toString());
                *//*to save the operation*//*
                ed.commit();
                startActivity(intent);
            }
        });*/

        /*Data Passing Using Bundle*/
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                /*to store the data into bundle*/
                Bundle bundle = new Bundle();
                bundle.putString("usernamekey", et_username.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });



    }
}