package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class helpActivity extends AppCompatActivity {
TextView tv1,tv0,tv3,tv4,tv5,tv6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        tv1=findViewById(R.id.textView22);
        tv0=findViewById(R.id.textView25);
        tv3=findViewById(R.id.textView17);
        tv4=findViewById(R.id.textView26);
        tv5=findViewById(R.id.textView27);
        tv6=findViewById(R.id.textView29);
        Intent i9=getIntent();
        Intent i10=getIntent();
        Intent i11=getIntent();
        Intent i12=getIntent();
        Intent i13=getIntent();
        Intent i14=getIntent();

        String s2=i10.getStringExtra("count");
        String s3=i11.getStringExtra("count");
        String s4=i12.getStringExtra("count");
        String s5=i13.getStringExtra("count");
        String s6=i14.getStringExtra("count");

        tv0.setText(s2);
        tv3.setText(s3);
        tv4.setText(s4);
        tv5.setText(s5);
        tv6.setText(s6);

    }
}
