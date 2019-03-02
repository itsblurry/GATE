package com.example.wayne.gate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    }

    public void security(View y)
    {
        Intent i1=new Intent("com.example.wayne.gate.Main2Activity");
        startActivity(i1);
    }

    public void resident(View y)
    {
        Intent i2=new Intent("com.example.wayne.gate.Main3Activity");
        startActivity(i2);
    }
}
