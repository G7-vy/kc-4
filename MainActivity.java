package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.unitconvertor.R;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText t1;
    TextView a1,a2;
    RadioButton r1,r2,r3,r4;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=(EditText) findViewById(R.id.input1);
        a1=(TextView) findViewById(R.id.res);
        a2=(TextView) findViewById(R.id.ans);
        r1=(RadioButton) findViewById(R.id.r1);
        r2=(RadioButton) findViewById(R.id.r2);
        r3=(RadioButton) findViewById(R.id.r3);
        r4=(RadioButton) findViewById(R.id.r4);
        b1=(Button) findViewById(R.id.button1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=t1.getText().toString();
                float m=Float.parseFloat(a);
                float ans1;
                if(r1.isChecked())
                {
                    ans1=m/100;
                    a1.setText("Result="+ans1);
                    a2.setText(m+"cm="+ans1+"m");
                }
                else if(r2.isChecked())
                {
                    ans1=m*100;
                    a1.setText("Result="+ans1);
                    a2.setText(m+"m="+ans1+"cm");
                }
                else if(r3.isChecked())
                {
                    ans1=m*12;
                    a1.setText("Result="+ans1);
                    a2.setText(m+"feet="+ans1+"inch");
                }
                else if(r4.isChecked())
                {
                    ans1=m/12;
                    a1.setText("Result="+ans1);
                    a2.setText(m+"inch="+ans1+"feet");
                }
                else
                    Toast.makeText(MainActivity.this, "Choose any one radio button",Toast.LENGTH_SHORT).show();
            }
        });

    }
}