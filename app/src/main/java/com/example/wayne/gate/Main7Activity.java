package com.example.wayne.gate;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.wayne.gate.Helper.QRCodeHelper;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public class Main7Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        Bundle bundle = getIntent().getExtras();
        String s = bundle.getString("ed1");
        ImageView im1 = (ImageView) findViewById(R.id.imageView);
        Bitmap bitmap = QRCodeHelper
                .newInstance(this)
                .setContent(s)
                .setErrorCorrectionLevel(ErrorCorrectionLevel.Q)
                .setMargin(2)
                .getQRCOde();
        im1.setImageBitmap(bitmap);
    }

}