package com.example.sifact;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SimpleInterest extends AppCompatActivity {

    EditText prin,rate,time;
    TextView tv1;
    Button cal;
    long p,tn;
    double r;
    double sim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_interest);
    tv1=findViewById(R.id.textView);
        prin=findViewById(R.id.editText2);
        rate=findViewById(R.id.editText3);
        time=findViewById(R.id.editText4);
        cal=findViewById(R.id.button4);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p=Integer.parseInt(prin.getText().toString());
                r=Float.parseFloat(rate.getText().toString());
                tn=Integer.parseInt(time.getText().toString());
                sim=(p*r*tn)/100;
                Toast.makeText(SimpleInterest.this,"Simple Interest is "+sim,Toast.LENGTH_LONG).show();
                tv1.setText(String.valueOf(sim));
            }
        });
    }
}
