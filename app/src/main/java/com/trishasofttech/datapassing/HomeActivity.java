package com.trishasofttech.datapassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    /*sharedpreferenes to show the data*/
    SharedPreferences sp;
    TextView tv_data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        /*to access/open the Sharedpreferences file*/
        sp = getSharedPreferences("virusir", 0);
        tv_data = findViewById(R.id.tv_data);
        /*to display the data from sharedpreferenes to textview*/
        //tv_data.setText(sp.getString("usernamekey", null));

        /*to get the data using bundle*/
        Bundle bundle = getIntent().getExtras();
        if (bundle!= null)
        {
            String data = bundle.getString("usernamekey");
            tv_data.setText(data);
        }
    }
}