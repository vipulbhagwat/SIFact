package com.example.sifact;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Factorial extends AppCompatActivity {

    EditText et1;
    TextView tv2;
    Button fact1;
    String s;
    int n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factorial);
        et1=findViewById(R.id.editText);
        tv2=findViewById(R.id.textView2);
        fact1=findViewById(R.id.button3);
        fact1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n=Integer.parseInt(et1.getText().toString());
                long facto=1;
                int i;
                for(i=1;i<=n;i++)
                {
                    facto=facto*i;
                }
                Toast.makeText(Factorial.this,"Factorial is  "+facto,Toast.LENGTH_SHORT).show();
                tv2.setText(String.valueOf(facto));

            }
        });
    }
}
