package com.example.administrator.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class thirdActivity extends AppCompatActivity {
    SharedPreferences sh=null;
    SharedPreferences.Editor editor=null;
    Button btn1, btn2, btn3, btn4, btn5, btn6;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        sh=getSharedPreferences("myfile", Context.MODE_PRIVATE);
        btn1 = findViewById(R.id.button2);
        btn2 = findViewById(R.id.button4);
        btn3 = findViewById(R.id.button5);
        btn4 = findViewById(R.id.button7);
        btn5 = findViewById(R.id.button8);
        btn6 = findViewById(R.id.button6);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(thirdActivity.this, splash2Activity.class);

                startActivity(i1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(thirdActivity.this, splash2Activity.class);

                startActivity(i2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(thirdActivity.this, splash2Activity.class);

                startActivity(i3);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(thirdActivity.this,splash2Activity.class);

                startActivity(i4);

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(thirdActivity.this, splash2Activity.class);

                startActivity(i5);

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6 = new Intent(thirdActivity.this, splash2Activity.class);

                startActivity(i6);

            }
        });

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String t = null;
        switch (item.getItemId()) {
            case R.id.about:
                t = item.getTitle().toString();
                Intent i1 = new Intent(thirdActivity.this, splash3Activity.class);
                startActivity(i1);
                return true;
            case R.id.help:
                t = item.getTitle().toString();
                Intent i2 = new Intent(thirdActivity.this, helpActivity.class);
                startActivity(i2);
                return true;
            case R.id.exit:
                t = item.getTitle().toString();
                finish();
                System.exit(0);
            default:
                break;

        }
        return super.onOptionsItemSelected(item);
    }


        }
