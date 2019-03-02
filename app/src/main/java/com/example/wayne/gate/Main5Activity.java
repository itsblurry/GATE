package com.example.wayne.gate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secwork);
    }

    public void resident(View y)
    {
        Intent i1 = new Intent("com.example.wayne.gate.Main4Activity");
        startActivity(i1);
    }

    public void visitor(View y)
    {
        Intent i2 = new Intent("com.example.wayne.gate.Main6Activity");
        startActivity(i2);
    }

}
