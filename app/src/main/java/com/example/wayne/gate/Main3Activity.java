package com.example.wayne.gate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reslogin);
    }

    public void continue1(View y)
    {
        EditText ed1=(EditText)findViewById(R.id.editText5);
        EditText ed2=(EditText)findViewById(R.id.editText3);
        Intent i1=new Intent(getApplicationContext(), Main7Activity.class);
        Bundle bundle=new Bundle();
        bundle.putString("ed1",(ed2.getText().toString()+ed1.getText().toString()));
        i1.putExtras(bundle);
        startActivity(i1);
    }

}
