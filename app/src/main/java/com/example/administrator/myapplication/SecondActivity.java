package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    Button btn;
    EditText ed1,ed2,ed3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ed1 = (EditText)findViewById(R.id.edittext);
        ed2 = (EditText)findViewById(R.id.edittext2);
        ed3 = (EditText)findViewById(R.id.editText3);

        btn= (Button)findViewById(R.id.button);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed1.getText().toString().equals("")) {
                    ed1.setError("Enter the Name First");
                    return;
                }
                if (ed2.getText().toString().equals("")){
                    ed2.setError("Enter the Aadhar ID");
                    return;
                }
                if (ed3.getText().toString().equals(""))
                {
                    ed3.setError("Enter the Enrollment No.");
                    return;
                }


                else{
                Intent i= new Intent(SecondActivity.this,thirdActivity.class);
                i.putExtra("fname",ed1.getText().toString());
                i.putExtra("aname",ed2.getText().toString());
                i.putExtra("ename",ed3.getText().toString());
                startActivity(i);

            }}
        });

    }
}
