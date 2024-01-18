package com.example.addtwonumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText n1,n2;
    TextView ans;
    Button buttom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=findViewById(R.id.n1);
        n2=findViewById(R.id.n2);
        ans=findViewById(R.id.ans);
        buttom=findViewById(R.id.button);
        buttom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sum=Integer.parseInt(n1.getText().toString())+Integer.parseInt(n2.getText().toString());
                ans.setText(String.valueOf(sum));

            }
        });

    }
}