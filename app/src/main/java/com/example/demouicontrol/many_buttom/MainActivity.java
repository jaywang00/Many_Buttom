package com.example.demouicontrol.many_buttom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    ToggleButton tbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tbtn = findViewById(R.id.toggleButton);
        tbtn.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {


        if(isChecked)
            Toast.makeText(MainActivity.this, "Now is On", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(MainActivity.this, "Now is Off", Toast.LENGTH_SHORT).show();
    }
}
